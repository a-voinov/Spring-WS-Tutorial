package com.tutorial.ws.config;

import org.springframework.ws.transport.http.support.AbstractAnnotationConfigMessageDispatcherServletInitializer;

/**
 * Java config Spring-WS initializer
 */
public class WSInitializer extends AbstractAnnotationConfigMessageDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{HRConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/*"};
    }
}
