package com.example.demo.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {
    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder routeLocatorBuilder) {
        return routeLocatorBuilder.routes()
                .route("customer", rt -> rt.path("/cust/**")
                        .uri("http://localhost:8095/"))
                .route("account1", rt -> rt.path("/acc/**")
                        .uri("http://localhost:8096/"))
                .build();

    }
}