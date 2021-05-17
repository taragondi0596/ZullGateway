package com.example.routingandfilteringgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.example.routingandfilteringgateway.filters.SimpleFilter;

@EnableZuulProxy
@SpringBootApplication
public class RoutingAndFilteringGatewayApplication {

  public static void main(String[] args) {
    SpringApplication.run(RoutingAndFilteringGatewayApplication.class, args);
  }

  @Bean
  public SimpleFilter simpleFilter() {
    return new SimpleFilter();
  }

	@Bean
	public com.example.routingandfilteringgateway.filters.preFilter preFilter() {
		return new com.example.routingandfilteringgateway.filters.preFilter();
	}

	@Bean
	public com.example.routingandfilteringgateway.filters.PostFilter postFilter() {
		return new  com.example.routingandfilteringgateway.filters.PostFilter();
	}

	@Bean
	public com.example.routingandfilteringgateway.filters.ErrorFilter errorFilter() {
		return new com.example.routingandfilteringgateway.filters.ErrorFilter();
	}

	@Bean
	public com.example.routingandfilteringgateway.filters.RouteFilter routeFilter() {
		return new com.example.routingandfilteringgateway.filters.RouteFilter();
	}
}