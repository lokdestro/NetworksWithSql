package app.controller;

import app.model.ExampleObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
    @GetMapping("/getExample")
    public ExampleObject getExample() {
        System.out.println("getExample");
        return new ExampleObject("Пример", 123);
    }

    @PostMapping("/postExample")
    public ExampleObject postExample(@RequestBody ExampleObject exampleObject) {
        return exampleObject;
    }
}
