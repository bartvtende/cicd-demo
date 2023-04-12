package nl.bart.cicddemo.controller;

import nl.bart.cicddemo.service.StepsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StepsController {

    private final StepsService stepsService;

    public StepsController(StepsService stepsService) {
        this.stepsService = stepsService;
    }

    @GetMapping("/")
    public List<String> allSteps() {
        return stepsService.getAllSteps();
    }
}
