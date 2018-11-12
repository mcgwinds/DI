package com.mcg.di.guice;

import com.google.inject.ProvidedBy;

@ProvidedBy(ClazzProvider.class)
public interface Interface {

    public String  hello(String world);
}
