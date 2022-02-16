package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

@GetMapping("/test")
    public String test(){
    return "test";
}

    @GetMapping("/test/branch2")
    public String testBranch2(){
        return "test";
    }


}
