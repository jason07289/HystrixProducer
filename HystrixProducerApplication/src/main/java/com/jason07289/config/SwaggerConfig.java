package com.jason07289.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
	@Bean
	public Docket api() {
		ApiInfo apiinfo = new ApiInfoBuilder()
				.title("Hystrix Producer")
				.description("Producer application to test Hystrix")
				.version("1.0")
				.build();
		
		Docket docket = new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiinfo)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.springcloud"))
				.paths(PathSelectors.any())
				.build();
		
		return docket;
	}
}
