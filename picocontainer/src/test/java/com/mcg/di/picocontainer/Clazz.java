package com.mcg.di.picocontainer;

import org.picocontainer.annotations.Inject;

public class Clazz {

    @Inject
    private Clazz1 clazz1;

    private Clazz2 clazz2;

    public Clazz2 getClazz2() {
        return clazz2;
    }

    public void setClazz2(Clazz2 clazz2) {
        this.clazz2 = clazz2;
    }

//    public Clazz1 getClazz1() {
//        return clazz1;
//    }
//
//    public void setClazz1(Clazz1 clazz1) {
//        this.clazz1 = clazz1;
//    }

    public String hello(String world) {
        return "hello "+ world ;
    }

    public String hello1(String world) {
        return clazz1.hello1(world) ;
    }

    public String hello2(String world) {
        return clazz2.hello2(world) ;
    }


}
