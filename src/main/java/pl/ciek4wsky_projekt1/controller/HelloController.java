package pl.ciek4wsky_projekt1.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.ciek4wsky_projekt1.service.HelloService;

@RestController
@RequiredArgsConstructor
public class HelloController {

    private final HelloService helloService;

// Uzywajac @RequiredArgsConstructor nie trzeba tworzyć konstruktora dla tego serwisu.
//    public HelloController(HelloService helloService) {
//        this.helloService = helloService;
//    }

    @GetMapping("/")
    public String hello()
    {
        return helloService.hello();
    }
}
