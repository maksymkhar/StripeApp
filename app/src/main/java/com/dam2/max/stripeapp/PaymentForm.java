package com.dam2.max.stripeapp;

/**
 * Created by max on 5/02/16.
 */
public interface PaymentForm {
    public String getCardNumber();
    public String getCvc();
    public Integer getExpMonth();
    public Integer getExpYear();
    public String getCurrency();
}
