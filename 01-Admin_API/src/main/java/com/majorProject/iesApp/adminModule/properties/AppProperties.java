package com.majorProject.iesApp.adminModule.properties;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;




/**
 * @author Admin
 * Any messages loaded in the application those messages will be loaded  in the application property class
 *
 */
@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "admin")
@Data
public class AppProperties {

	// used to load application proprties
	private Map<String, String> messages=new HashMap<>();

}
