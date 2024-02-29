package com.tus.usermanagement.swagger;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class OpenAPIConfig {

	@Value("${openapi.dev-url}")
	private String devServerUrl;

	@Value("${openapi.prod-url}")
	private String prodServerUrl;

	@Bean
	public OpenAPI openApi() {
		
		Server serverDev = new Server();
		serverDev.setUrl(devServerUrl);
		serverDev.setDescription("Server URL for Development Environment");
		
		Server serverProd = new Server();
		serverProd.setUrl(prodServerUrl);
		serverProd.setDescription("Server URL for Production Environment");
		
		Contact contact = new Contact();
		contact.setName("Ashin Jimmy");
		contact.setUrl("http://www.printechs.com");
		contact.setEmail("ashinj54@gmail.com");
		
		License license = new License().name("Printechs").url("https://printechs.com/liscense/mit");
		
		Info info = new Info();
		info.title("User Management")
		.version("1.0")
		.contact(contact)
		.description("This API exposes endpoints to manage user")
		.license(license);
		
		return new OpenAPI().info(info).servers(List.of(serverDev, serverProd));
		
	}
}
