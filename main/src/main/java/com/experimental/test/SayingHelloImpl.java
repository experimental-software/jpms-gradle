package com.experimental.test;

import org.springframework.stereotype.Service;

@Service
public class SayingHelloImpl implements SayingHello
{
    @Override
    public String greet(String name)
    {
        String msg = "Hello, " + name;
        System.out.println(msg);
        return msg;
    }
}
