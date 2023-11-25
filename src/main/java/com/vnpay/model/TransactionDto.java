package com.vnpay.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class TransactionDto {
    private String orderInfo;
    private String payAmount;
    private String paymentTime;
    private String transactionId;
    private String responseCode;
}
