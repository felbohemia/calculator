package com.atamie.calculator;

import org.springframework.stereotype.Service;

@Service
public class Sum {

    public int sum(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }

}
