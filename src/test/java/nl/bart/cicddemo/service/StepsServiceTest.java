package nl.bart.cicddemo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StepsServiceTest {

    @Autowired
    private StepsService stepsService;

    @Test
    void testSuccess() {
        var result = stepsService.getAllSteps();

        assertEquals(result.size(), 3);
        assertEquals(result.get(0), "1. Build app");
        assertEquals(result.get(1), "2. Run unit tests");
        assertEquals(result.get(2), "3. Package app");
    }

}
