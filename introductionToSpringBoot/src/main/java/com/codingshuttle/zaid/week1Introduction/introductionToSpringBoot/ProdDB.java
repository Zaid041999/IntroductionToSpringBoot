package com.codingshuttle.zaid.week1Introduction.introductionToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

import org.springframework.stereotype.Component;

@Component
//@Primary
@ConditionalOnProperty(name = "deploy.env" , havingValue = "production")
public class ProdDB implements DB {

    public String getData(){
        return "Prod Data";
    }
}
