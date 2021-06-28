package com.riskified.serviceTest.helper;


import com.riskified.serviceTest.models.EnrichedOrder;
import org.springframework.stereotype.Service;

@Service
public class EnrichedOrderBuilder {

    private static EnrichedOrderBuilder enrichedOrderBuilderInst = new EnrichedOrderBuilder();
    private EnrichedOrderBuilder(){}

    public static EnrichedOrderBuilder getEnrichedOrderBuilderInst(){
        return enrichedOrderBuilderInst;
    }

    public EnrichedOrder createEOrder(String EOrderID, String email, double totalPrice){

        EnrichedOrder enrichedOrder = new EnrichedOrder();
        enrichedOrder.setEOrderID(EOrderID);
        enrichedOrder.setEmail(email);
        enrichedOrder.setTotalPrice(totalPrice);

        return enrichedOrder;
    }


}
