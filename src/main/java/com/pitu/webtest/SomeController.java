package com.pitu.webtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SomeController {
    @RequestMapping(value="/something", method = RequestMethod.GET)
    public List<Integer> testAction() {
        List<Integer> x = new ArrayList<>();
        x.add(1234);
        x.add(4567);

        return x;
    }

    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    public String getGreeting(@PathVariable String name) {
        String result = "Hello " + name;
        return result;
    }

}
