package com.experimental;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ToolsAndServicesApplication
{
    public static void main(String[] args)
    {
        new SpringApplicationBuilder().sources(ToolsAndServicesApplication.class).run(args);
    }
}
