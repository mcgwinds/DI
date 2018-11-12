package com.mcg.di.guice;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;


/**
 * module 配置
 * @author mcg
 */
public class GuiceModule extends AbstractModule {

    @Override

    protected void configure() {

        bind(Interface.class).to(Clazz.class);
        //bind(Interface.class).toProvider(ClazzProvider.class);
        //bindInterceptor(Matchers.any(), Matchers.annotatedWith(GuiceAop.class),new GuiceMethodInterceptor());
       // bindInterceptor(Matchers.any(),Matchers.any(),new GuiceMethodInterceptor());
    }


}
