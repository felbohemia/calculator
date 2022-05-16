package com.atamie.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SumController {
    @Autowired
    private Sum sum;
    @RequestMapping("/sum")
    public String getSum(@RequestParam("a") int a, @RequestParam("b") int b){
        return String.valueOf(sum.sum(a,b));
    }
}
