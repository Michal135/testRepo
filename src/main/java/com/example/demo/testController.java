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
    @GetMapping("/testt/nextText")
    public String nextText6(){
        return "test6";
    }

    @GetMapping("/test/master6")
    public String myChange6(){
        return "test6";
    }

    @GetMapping("/test/master8")
    public String myChange8(){
        return "test8";
    }

    @GetMapping("/test/master7")
    public String myChange7(){
        return "test7";
    }

    @GetMapping("/test/commTest1")
    public String commTest1(){
        return "commTest1";
    }
    @GetMapping("/test/commTest2")
    public String commTest2(){
        return "commTest2";
    }

    @GetMapping("/test/commTest3")
    public String commTest3(){
        return "commTest3";
    }

    @GetMapping("/test/master9")
    public String myChange9(){
        return "test9";
    }

    @GetMapping("/test/master10")
    public String myChange10(){
        return "test10";
    }

    @GetMapping("/test/master100")
    public String myChange100(){
        return "test100";
    }
}
