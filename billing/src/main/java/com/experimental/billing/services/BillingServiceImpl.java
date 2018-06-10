package com.experimental.billing.services;

import com.experimental.billing.api.BillingService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BillingServiceImpl implements BillingService {

    @Override
    public UUID generateInvoice() {
        return UUID.randomUUID();
    }
}
