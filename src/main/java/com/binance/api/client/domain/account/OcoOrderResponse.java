package com.binance.api.client.domain.account;

import java.util.List;

import lombok.Data;

@Data
public class OcoOrderResponse {

    String orderListId;
    String contingencyType;
    String listStatusType;
    String listOrderStatus;
    String listClientOrderId;
    long transactionTime;
    String symbol;
    List<OcoOrder> orders;
    List<NewOrderResponse> orderReports;

    @Data
    static class OcoOrder {
        String symbol;
        long orderId;
        String clientOrderId;
    }

}
