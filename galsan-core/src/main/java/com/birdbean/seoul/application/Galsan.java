/*
 * Copyright (C) 2021 the original author or authors.
 *
 * Licensed under the ecowren.
 * you may not use this file except in compliance with the License.
 */
package com.birdbean.seoul.application;

import ro.pippo.core.Application;
import ro.pippo.core.Pippo;
import ro.pippo.core.PippoFilter;
import ro.pippo.core.WebServer;

/**
 * @author Dahuin Choi
 */
public class Galsan extends Pippo {

    public class GalsanFilter extends PippoFilter{
    }

    public GalsanFilter createFilter(Application application){
        return (GalsanFilter) super.createPippoFilter(application);
    }

    public Galsan (Application application) {
        super(application);
    }

    public Galsan() {
        super();
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public Application getApplication() {
        return super.getApplication();
    }

    @Override
    @SuppressWarnings("rawtypes")
    public WebServer getServer() {
        return super.getServer();
    }
}
