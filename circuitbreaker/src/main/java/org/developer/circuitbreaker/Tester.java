package org.developer.circuitbreaker;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

public class Tester {
    @Retry(name = "mycircuitbreaker", fallbackMethod ="getApiFallback" )
    public String getData() throws InterruptedException {
        System.out.println("called");
        Thread.sleep(200000);
        return "Done";
    }
    public void getApiFallback(Exception e){
        System.out.println("failed");
    }
}
