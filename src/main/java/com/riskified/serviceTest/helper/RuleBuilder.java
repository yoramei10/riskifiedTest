package com.riskified.serviceTest.helper;


import com.riskified.serviceTest.models.Rule;
import org.springframework.stereotype.Service;

@Service
public class RuleBuilder {


    public Rule createRule(String ruleID,
                           String description,
                           String ruleField,
                           String action,
                           String value,
                           String actionToNextrule,
                           Rule nextRule){

        Rule rule = new Rule();
        rule.setRuleID(ruleID);
        rule.setDescription(description);
        rule.setRuleField(ruleField);
        rule.setOperator(action);
        rule.setValue(value);
        rule.setOperatorToNextrule(actionToNextrule);
        rule.setNextRule(nextRule);

        return rule;
    }
}
