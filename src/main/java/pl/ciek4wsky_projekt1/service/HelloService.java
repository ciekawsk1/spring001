package pl.ciek4wsky_projekt1.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope
public class HelloService {

    public String hello()
    {
        return "Hello World";
    }
}
