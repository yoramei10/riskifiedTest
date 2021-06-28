package com.riskified.serviceTest.services;

import com.riskified.serviceTest.helper.EnrichedOrderBuilder;
import com.riskified.serviceTest.helper.RuleBuilder;
import com.riskified.serviceTest.models.EnrichedOrder;
import com.riskified.serviceTest.models.Rule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainServiceApplicationService {

    @Autowired
    private CheckRuleService checkRuleService;

    @Autowired
    private RuleBuilder ruleBuilder;

    @Autowired
    private EnrichedOrderBuilder enrichedOrderBuilder;


    public boolean exeService(){


        Rule checkEmailRule = ruleBuilder.createRule("IDRule1", "check email contain gmail.com", "email", "contain", "gmail.com",
                null, null);

        Rule checkTotalValueRule = ruleBuilder.createRule("IDRule2", "check total value", "totalPrice", "moreThan", "1000",
                null, null);

        checkRuleService.getRuleToRun().add(checkEmailRule);
        checkRuleService.getRuleToRun().add(checkTotalValueRule);

        EnrichedOrder eOrder = enrichedOrderBuilder.createEOrder("EOrderID1", "yoram1@gmail.com", 12.32);

        return checkRuleService.runAllServices(eOrder);
    }


}
