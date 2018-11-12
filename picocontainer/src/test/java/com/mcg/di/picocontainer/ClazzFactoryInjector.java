package com.mcg.di.picocontainer;

import org.picocontainer.PicoContainer;
import org.picocontainer.injectors.FactoryInjector;

import java.lang.reflect.Type;

public class ClazzFactoryInjector extends FactoryInjector<Clazz> {
    @Override
    public Clazz getComponentInstance(PicoContainer container, Type into) {
        return new Clazz();
    }
}
