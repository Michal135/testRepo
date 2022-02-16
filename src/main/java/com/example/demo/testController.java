package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/test/branch1")
    public String testBranch1() {
        return "branch1";
    }

    @GetMapping("/test/developchange")
    public String developchange() {
        return "developchange";
    }

    @GetMapping("/test/branch2")
    public String testBranch2() {
        return "branch2";
    }

    @GetMapping("/test/1")
    public String test1() {
        return "test1";
    }

    @GetMapping("/test/masterChange")
    public String myChange(){
        return "test";
    }
    @GetMapping("/test/masterNext")
    public String myChange2(){
        return "test2";
    }

    @GetMapping("/test/masterNext3")
    public String myChange3(){
        return "test3";
    }

    @GetMapping("/test/masterNext4")
    public String myChange4(){
        return "test4";
    }
    @GetMapping("/test/master5")
    public String myChange5(){
        return "test5";
    }

    @GetMapping("/test/master6")
    public String myChange6(){
        return "test6";
    }

}
