package com.prateek.bank.fintech.sandbox.scope;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service
public class SingletonScopeService {

    private static int instanceCount = 0;

    public SingletonScopeService() {
        System.out.println("[CONSTRUCTOR] SingletonScopeService Created");
    }

    @PostConstruct
    public void init() {
        instanceCount++;
        System.out.println("[POST CONSTRUCT] Singleton Bean Initialized");
        System.out.println("Instance Count : " + instanceCount);
        System.out.println("HashCode : " + this.hashCode());
    }

    public String getBeanInfo() {
        return "Singleton HashCode : " + this.hashCode();
    }

    @PreDestroy
    public void destroy() {
        System.out.println("[PRE DESTROY] Singleton Bean Destroyed");
    }
}