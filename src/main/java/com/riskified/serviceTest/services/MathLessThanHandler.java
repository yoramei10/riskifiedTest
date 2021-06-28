package com.riskified.serviceTest.services;

import org.springframework.stereotype.Service;

@Service
public class MathLessThanHandler implements AbstractHandler {

    @Override
    public boolean handle (Object field, Object value){
        return  (double)field < Double.parseDouble((String)value) ;
    }
}
