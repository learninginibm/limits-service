package com.learn.microservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
	
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.learn.microservice"))
				.build()
				.apiInfo(metaData());
	}
	
	@SuppressWarnings("deprecation")
	private ApiInfo metaData() {
        return new ApiInfo(
                "This is a Limits Microservices",
                "This is a Limits Microservices which holds the min and max values",
                "1.0",
                "Terms of service",
                "Apache 1.0",
                //new Contact("Sanjeev Kulkarni", "https://vzweb.verizon.com/", "sanjekul@in.ibm.com"),
                "Apache License Version 2.0",
                "https://www.apache.org/licenses/LICENSE-2.0");
    }
}
