package kz.kulamkadyr.task.controller;

import kz.kulamkadyr.task.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Controller приложения
 */

@Controller
@RequestMapping(value = "/task")
public class ApplicationController {

    private final ApplicationService applicationService;

    @Autowired
    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping("/main")
    public String greetingForm(Map<String, Object> model) {
        model.put("message", "");
        return "main";
    }

    @PostMapping("/main")
    public String greetingSubmit(@RequestParam int number, Map<String, Object> model ) {
        model.put("message",  applicationService.getMessage(number));
        return "main";
    }

}
