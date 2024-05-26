package com.example.paymentservice.services;

import com.example.paymentservice.models.PaymentStatus;
import com.example.paymentservice.paymentgateways.PaymentGatewayFactory;
import com.example.paymentservice.paymentgateways.PaymentGatewayInterface;
import com.example.paymentservice.paymentgateways.RazorpayPaymentGateway;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {


    private PaymentGatewayFactory   paymentGatewayFactory;

    public PaymentService(PaymentGatewayFactory paymentGatewayFactory) {
        this.paymentGatewayFactory = paymentGatewayFactory;
    }
    public String createPaymentLink(Long orderId){
        // I need to get the details of the order
        //     - amount


        Long amount = 1000L;
        String userName = "Udhayakumar";
        String userMobile = "1234567890";
        String userEmail = "abc@example.com";


        PaymentGatewayInterface paymentGateway = paymentGatewayFactory.getBestPaymentGateway();

        return paymentGateway.createPaymentLink(
                amount, userName, userEmail, userMobile, orderId
        );
    }
    public PaymentStatus getPaymentStatus(Long paymentId){
        return null;
    }
}
