package com.mcg.di.guice;

import com.google.inject.*;

public class GuiceTest {


    public static void main(String [] args) {
//        Injector injector= Guice.createInjector(new Module() {
//            @Override
//            public void configure(Binder binder) {
//                binder.bind(Clazz.class).to(Clazz.class);
//            }
//        });
        Injector injector=Guice.createInjector(new GuiceModule());
        Interface instance=injector.getInstance(Interface.class);
        String result=instance.hello("world");
        System.out.println(result);

    }

}
