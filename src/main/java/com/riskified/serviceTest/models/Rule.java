package com.riskified.serviceTest.models;

public class Rule {

    String ruleID;
    String description;
    String ruleField;
    String operator;
    String value;
    String operatorToNextrule;
    Rule nextRule;

    public String getRuleID() {
        return ruleID;
    }

    public void setRuleID(String ruleID) {
        this.ruleID = ruleID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRuleField() {
        return ruleField;
    }

    public void setRuleField(String ruleField) {
        this.ruleField = ruleField;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getOperatorToNextrule() {
        return operatorToNextrule;
    }

    public void setOperatorToNextrule(String operatorToNextrule) {
        this.operatorToNextrule = operatorToNextrule;
    }

    public Rule getNextRule() {
        return nextRule;
    }

    public void setNextRule(Rule nextRule) {
        this.nextRule = nextRule;
    }
}
