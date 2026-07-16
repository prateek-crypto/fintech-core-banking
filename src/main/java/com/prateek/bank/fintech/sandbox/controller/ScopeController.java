package com.prateek.bank.fintech.sandbox.controller;

import com.prateek.bank.fintech.sandbox.scope.PrototypeScopeService;
import com.prateek.bank.fintech.sandbox.scope.SingletonScopeService;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class ScopeController {

    private final SingletonScopeService singletonScopeService;
    private final ObjectProvider<PrototypeScopeService> prototypeProvider;

    public ScopeController(SingletonScopeService singletonScopeService,
                           ObjectProvider<PrototypeScopeService> prototypeProvider) {
        this.singletonScopeService = singletonScopeService;
        this.prototypeProvider = prototypeProvider;
    }

    @GetMapping("/api/v1/sandbox/scopes")
    public ResponseEntity<Map<String, String>> compareScopes() {

        PrototypeScopeService prototypeOne = prototypeProvider.getObject();
        PrototypeScopeService prototypeTwo = prototypeProvider.getObject();

        Map<String, String> response = new LinkedHashMap<>();

        response.put("Singleton Bean", singletonScopeService.getBeanInfo());

        response.put("Prototype Bean 1", prototypeOne.getBeanInfo());

        response.put("Prototype Bean 2", prototypeTwo.getBeanInfo());

        response.put("Prototype Same Object ?",
                String.valueOf(prototypeOne == prototypeTwo));

        return ResponseEntity.ok(response);
    }
}