package com.riskified.serviceTest.services;


import com.riskified.serviceTest.models.EnrichedOrder;
import com.riskified.serviceTest.models.Rule;

public interface RuleHandler {

   boolean handleRule(EnrichedOrder EOrder, Rule rule) throws NoSuchFieldException;

}
