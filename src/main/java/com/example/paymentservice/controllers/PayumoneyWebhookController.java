package com.example.paymentservice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webhooks/payumoney")
public class PayumoneyWebhookController {

    public  void handleWebhookEvent() {
        // Handle Stripe webhook event
    }
}
