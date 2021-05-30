/*
 * Copyright (C) 2021 the original author or authors.
 *
 * Licensed under the ecowren.
 * you may not use this file except in compliance with the License.
 */
package com.birdbean.seoul;

import com.birdbean.seoul.application.BirdbeanApplication;
import com.birdbean.seoul.application.Galsan;

/**
 * Launcher for bridbean backend service.
 *
 * @author ecowren Team
 */
public class BirdbeanLauncher {
    public static void main(String[] args){
        Galsan galsan = new Galsan(new BirdbeanApplication());
        galsan.start();
    }
}
