package org.java.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfController {

    @GetMapping("/init")
    public String init(){
        return "hello......";
    }
}
