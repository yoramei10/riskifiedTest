package com.riskified.serviceTest.services;


import com.riskified.serviceTest.models.EnrichedOrder;
import com.riskified.serviceTest.models.Rule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;

@Service
public class MainHandler implements RuleHandler{

    @Autowired
    private HandlerFactory handlerFactory;

    @Override
    public boolean handleRule(EnrichedOrder EOrder, Rule rule) {

        AbstractHandler handler = handlerFactory.getHandler(rule.getOperator());

            return handler.handle(EOrder.getField(rule.getRuleField()), rule.getValue());
    }
}
