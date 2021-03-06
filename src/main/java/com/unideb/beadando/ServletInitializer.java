package com.unideb.beadando;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * class  initialize servlets.
 * @author gagyi.norbert
 *
 */
public class ServletInitializer extends SpringBootServletInitializer {

	/**
	 * this method build this application add to application source.
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Main.class);
	}

}
