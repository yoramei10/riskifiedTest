package com.riskified.serviceTest.services;

import org.springframework.stereotype.Service;

@Service
public class StringNotContainHandler implements AbstractHandler {

    @Override
    public boolean handle(Object field, Object value) {
        return !((String)field).contains((String)value);
    }
}
