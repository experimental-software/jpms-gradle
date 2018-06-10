package com.experimental.erp.sales.services;

import com.experimental.erp.sales.api.SalesService;
import org.springframework.stereotype.Service;

@Service
public class SalesServiceImpl implements SalesService
{
    @Override
    public int sellSomething(String name)
    {
        return 42;
    }
}
