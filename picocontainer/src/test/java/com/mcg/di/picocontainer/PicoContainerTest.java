package com.mcg.di.picocontainer;

import org.picocontainer.*;
import org.picocontainer.injectors.Injectors;
import org.picocontainer.injectors.MultiInjection;


public class PicoContainerTest {

    public static void main(String [] args) {
//        PicoContainer pico = new DefaultPicoContainer();
//        ((DefaultPicoContainer) pico).addComponent(Clazz.class);
//        Clazz instance=pico.getComponent(Clazz.class);
//        String result=instance.hello("world");
//        System.out.println(result);

//        MutablePicoContainer mutablePicoContainer= new PicoBuilder().build().addAdapter(new ClazzFactoryInjector());
//        Clazz instance=mutablePicoContainer.getComponent(Clazz.class);
//        String result=instance.hello("world");
//        System.out.println(result);
//        Clazz children=mutablePicoContainer.makeChildContainer().getComponent(Clazz.class);
//        String childrenResult=children.hello("world");
//        System.out.println(childrenResult);
//        MutablePicoContainer mutablePicoContainer= new PicoBuilder().build();
//        mutablePicoContainer.addAdapter(new ProviderAdapter(new ClazzProvider()));
//        Clazz instance=mutablePicoContainer.getComponent(Clazz.class);
//        String result=instance.hello("world");
//        System.out.println(result);

//        MutablePicoContainer mutablePicoContainer= new PicoBuilder().build().addComponent(Clazz.class).addComponent(Clazz1.class);
//        Clazz instance=mutablePicoContainer.getComponent(Clazz.class);
//        System.out.println(instance.hello("world"));
//        System.out.println(instance.hello1("world"));

//        MutablePicoContainer mutablePicoContainer= new PicoBuilder().build();
//        mutablePicoContainer.addComponent(Clazz.class).addComponent(Clazz1.class).addComponent(Clazz2.class);
//        Clazz instance=mutablePicoContainer.getComponent(Clazz.class);
//        System.out.println(instance.hello("world"));
//        System.out.println(instance.hello1("world"));
//        System.out.println(instance.hello2("world"));

        PicoContainer pico = new DefaultPicoContainer(new MultiInjection());
        ((DefaultPicoContainer)pico).addComponent(Clazz.class).addComponent(Clazz1.class).addComponent(Clazz2.class);
        Clazz instance=pico.getComponent(Clazz.class);
        System.out.println(instance.hello("world"));
        System.out.println(instance.hello1("world"));
        System.out.println(instance.hello2("world"));

    }
}
