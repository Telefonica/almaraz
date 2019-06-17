/*
 * Copyright (c) Telefonica I+D. All rights reserved.
 */

package com.elevenpaths.almaraz.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import com.elevenpaths.almaraz.AlmarazConfiguration;

/**
 * Spring {@link Configuration} extending {@link AlmarazConfiguration} to include the default middlewares
 * in the server.
 *
 * @author Jorge Lorenzo <jorge.lorenzogallardo@telefonica.com>
 *
 */
@Configuration
public class ApplicationConfiguration extends AlmarazConfiguration {

	public ApplicationConfiguration(@Value("${almaraz-example.base-path}") String basePath) {
		super(basePath);
	}

}
