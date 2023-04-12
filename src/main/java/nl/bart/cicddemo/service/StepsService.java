package nl.bart.cicddemo.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StepsService {

    public List<String> getAllSteps() {
        return List.of("1. Build app", "2. Run unit tests", "3. Package app");
    }
}
