package kz.kulamkadyr.task.controller.rest;

import kz.kulamkadyr.task.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * RestController приложения
 */
@RestController
@RequestMapping (value = "task/rest")
public class ApplicationRestController {

    private final ApplicationService applicationService;

    @Autowired
    public ApplicationRestController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping("/getMessage/{number}")
    public String getMessage(@PathVariable int number) {
        return applicationService.getMessage(number);
    }
}
