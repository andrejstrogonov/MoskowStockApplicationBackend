package org.andrejstrogonov.moskowstockapplicationbackend;

import org.andrejstrogonov.moskowstockapplicationbackend.model.Instrument;
import org.andrejstrogonov.moskowstockapplicationbackend.model.InstrumentType;
import org.andrejstrogonov.moskowstockapplicationbackend.repository.InstrumentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
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
        Instrument instrument = new Instrument();
        instrument.setTicker("TEST");
        instrument.setName("Test Instrument");
        instrument.setType(InstrumentType.STOCK);
        instrument.setCurrentPrice(100.0);

        Instrument saved = instrumentRepository.save(instrument);
        assert saved.getId() != null;

        instrumentRepository.delete(saved);
    }
}
