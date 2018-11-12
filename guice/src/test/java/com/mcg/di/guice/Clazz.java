package com.mcg.di.guice;

public class Clazz implements Interface {
    @Override
    @GuiceAop
    public String hello(String world) {
        return "hello "+ world ;
    }


}
