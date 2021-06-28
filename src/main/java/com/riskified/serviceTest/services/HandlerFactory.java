package com.riskified.serviceTest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HandlerFactory {

    @Autowired
    MathEqualHandler mathEqualHandler;
    @Autowired
    MathNotEqualHandler mathNotEqualHandler;
    @Autowired
    MathMoreThanHandler mathMoreThanHandler;
    @Autowired
    MathLessThanHandler mathLessThanHandler;
    @Autowired
    StringContainHandler stringContainHandler;

    @Autowired
    StringNotContainHandler stringNotContainHandler;

    public AbstractHandler getHandler(String hendlerType){

        switch (hendlerType){
            case("equal"): return mathEqualHandler;
            case("notEqual"): return mathNotEqualHandler;
            case("moreThan"): return mathMoreThanHandler;
            case("lessThan"): {return mathLessThanHandler;}
            case("contain"): return stringContainHandler;
            case("notContain"): return stringNotContainHandler;

            default: return null;
        }

    }
}
