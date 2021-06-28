package com.riskified.serviceTest.services;


import com.riskified.serviceTest.models.EnrichedOrder;
import com.riskified.serviceTest.models.Rule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

@Service
public class CheckRuleService {

    @Autowired
            private MainHandler mainHandler;


    List<Rule> ruleToRun = new ArrayList<>();

    public List<Rule> getRuleToRun() {
        return ruleToRun;
    }

    public void setRuleToRun(List<Rule> ruleToRun) {
        this.ruleToRun = ruleToRun;
    }

    public boolean runAllServices(EnrichedOrder EOrder){


        AtomicBoolean ruleValue = new AtomicBoolean(true);

        ruleToRun.forEach(rule -> {

            if (!mainHandler.handleRule(EOrder, rule)){
                ruleValue.set(false);
                return;
            }

        });

        return ruleValue.get();

    }

}
