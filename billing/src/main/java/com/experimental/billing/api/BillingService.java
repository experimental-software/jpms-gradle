package com.experimental.billing.api;

import java.util.UUID;

public interface BillingService {

    UUID generateInvoice();
}
