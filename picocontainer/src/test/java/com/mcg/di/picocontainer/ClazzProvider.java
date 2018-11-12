package com.mcg.di.picocontainer;

import org.picocontainer.injectors.Provider;

public class ClazzProvider implements Provider {

    public Clazz provide() {
        return new Clazz();
    }
}
