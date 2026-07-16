package com.prateek.bank.fintech.sandbox.scope;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class PrototypeScopeService {

    private static int instanceCount = 0;

    public PrototypeScopeService() {
        System.out.println("[CONSTRUCTOR] PrototypeScopeService Created");
    }

    @PostConstruct
    public void init() {
        instanceCount++;
        System.out.println("[POST CONSTRUCT] Prototype Bean Initialized");
        System.out.println("Instance Count : " + instanceCount);
        System.out.println("HashCode : " + this.hashCode());
    }

    public String getBeanInfo() {
        return "Prototype HashCode : " + this.hashCode();
    }
}