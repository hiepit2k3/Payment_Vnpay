package com.vnpay.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
public class ResPaymentDto implements Serializable {

    private String status;
    private String message;
    private String URL;
}
