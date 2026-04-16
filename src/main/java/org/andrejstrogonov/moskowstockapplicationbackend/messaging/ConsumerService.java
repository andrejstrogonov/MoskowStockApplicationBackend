package org.andrejstrogonov.moskowstockapplicationbackend.messaging;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Header;
import com.rabbitmq.client.Channel;
import org.andrejstrogonov.moskowstockapplicationbackend.dto.GoalRequest;
import org.andrejstrogonov.moskowstockapplicationbackend.model.Instrument;
import org.andrejstrogonov.moskowstockapplicationbackend.service.CalculatorService;
import org.andrejstrogonov.moskowstockapplicationbackend.service.InstrumentService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;
import org.andrejstrogonov.moskowstockapplicationbackend.dto.GoalResponse;

import java.io.IOException;

@Service
@ConditionalOnProperty(name = "spring.rabbitmq.host", havingValue = "localhost", matchIfMissing = true)
public class ConsumerService {

    private final InstrumentService instrumentService;
    private final CalculatorService calculatorService;

    @Autowired
    public ConsumerService(InstrumentService instrumentService, CalculatorService calculatorService) {
        this.instrumentService = instrumentService;
        this.calculatorService = calculatorService;
    }

    // Consumer for market data updates
    @RabbitListener(queues = "${rabbitmq.queue.market-data-updates:market.data.updates}", containerFactory = "rabbitListenerContainerFactory")
    public void handleMarketDataUpdate(Instrument instrument, Channel channel, @Header(AmqpHeaders.DELIVERY_TAG) long tag) throws IOException {
        try {
            // Update instrument in database
            instrumentService.updateInstrument(instrument.getId(), instrument);
            // Acknowledge message
            channel.basicAck(tag, false);
        } catch (Exception e) {
            // Reject and send to dead letter queue
            channel.basicNack(tag, false, false);
        }
    }

    // Consumer for portfolio generation
    @RabbitListener(queues = "${rabbitmq.queue.portfolio-generation:portfolio.generation}", containerFactory = "rabbitListenerContainerFactory")
    public void handlePortfolioGeneration(GoalRequest goalRequest, Channel channel, @Header(AmqpHeaders.DELIVERY_TAG) long tag) throws IOException {
        try {
            // Generate portfolio
            GoalResponse response = calculatorService.generateGoalPortfolio(goalRequest);
            // Here you could save the portfolio or send notification
            // For now, just acknowledge
            channel.basicAck(tag, false);
        } catch (Exception e) {
            channel.basicNack(tag, false, false);
        }
    }
}
