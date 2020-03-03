package ch.mab.plansch.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore
@RestController
@RequestMapping("/")
public class DefaultController {

    @GetMapping("/")
    public ModelAndView redirectToSwaggerPage() {
        return new ModelAndView("redirect:/swagger-ui.html");
    }
}
