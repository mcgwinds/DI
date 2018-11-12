package com.mcg.di.guice;

import com.google.inject.Provider;

public class ClazzProvider implements Provider<Interface> {
    @Override
    public Interface get() {
        return new Clazz();
    }
}
