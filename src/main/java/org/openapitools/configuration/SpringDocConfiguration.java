package org.openapitools.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "org.openapitools.configuration.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Stream Management API for OpenID Shared Security Events")
                                .description("[OpenID Spec](https://openid.net/specs/openid-sse-framework-1_0.html#management)  HTTP API to be implemented by Event Transmitters. This API can be used by Event Receivers to query and update the Event Stream configuration and status, to add and remove subjects, and to trigger verification. ")
                                .license(
                                        new License()
                                                .name("MIT")
                                                .url("http://unlicense.org")
                                )
                                .version("1.0.0")
                )
                .components(
                        new Components()
                                .addSecuritySchemes("BearerAuth", new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                )
                )
        ;
    }
}