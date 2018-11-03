package com.seeyoo.bd;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

@SpringBootApplication
public class WxappApplication extends SpringBootServletInitializer {

	private static ImmutableMap<String, String> errorCodeMap = null;
	static {
		try {
			Properties prop = PropertiesLoaderUtils.loadAllProperties("error_code.properties");
			errorCodeMap = Maps.fromProperties(prop);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		SpringApplication.run(WxappApplication.class, args);
	}
	@Bean
	public ImmutableMap<String, String> errorCodeMap(){
		return errorCodeMap;
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {return application.sources(WxappApplication.class);}
}
