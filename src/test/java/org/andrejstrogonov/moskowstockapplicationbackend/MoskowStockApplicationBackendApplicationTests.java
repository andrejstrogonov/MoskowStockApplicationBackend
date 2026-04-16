package org.andrejstrogonov.moskowstockapplicationbackend;

import org.andrejstrogonov.moskowstockapplicationbackend.model.Instrument;
import org.andrejstrogonov.moskowstockapplicationbackend.model.InstrumentType;
import org.andrejstrogonov.moskowstockapplicationbackend.model.Stock;
import org.andrejstrogonov.moskowstockapplicationbackend.model.Sector;
import org.andrejstrogonov.moskowstockapplicationbackend.repository.InstrumentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.time.LocalDateTime;

@SpringBootTest
@TestPropertySource(properties = {"spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration"})
class MoskowStockApplicationBackendApplicationTests {

    @Autowired
    private InstrumentRepository instrumentRepository;

    @Test
    void contextLoads() {
        // Test that the application context loads successfully
        assert instrumentRepository != null;
    }

    @Test
    void testInstrumentRepository() {
        Stock instrument = new Stock();
        instrument.setTicker("TEST");
        instrument.setName("Test Instrument");
        instrument.setType(InstrumentType.STOCK);
        instrument.setCurrentPrice(100.0);
        instrument.setLastUpdate(LocalDateTime.now());
        instrument.setDividendYield(2.5);
        instrument.setEps(10.0);
        instrument.setPe(15.0);
        instrument.setRoe(20.0);
        instrument.setDividendPayout(0.5);
        instrument.setSector(Sector.IT); // Changed to Sector.IT
        instrument.setIsExporter(false);
        instrument.setMarketCap(1000000.0);
        instrument.setCompanyName("Test Company");

        Instrument saved = instrumentRepository.save(instrument);
        assert saved.getId() != null;

        instrumentRepository.delete(saved);
    }
}
