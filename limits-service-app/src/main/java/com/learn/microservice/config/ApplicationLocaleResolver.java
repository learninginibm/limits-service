/**
 * 
 */
package com.learn.microservice.config;

import java.util.Locale;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

/**
 * @author Sanjeev
 *
 */

@Component
public class ApplicationLocaleResolver {
	public LocaleResolver getMessageSource() {
		AcceptHeaderLocaleResolver acceptHeaderLocaleResolver = new AcceptHeaderLocaleResolver();
		acceptHeaderLocaleResolver.setDefaultLocale(Locale.US);
		return acceptHeaderLocaleResolver;
	}
}
