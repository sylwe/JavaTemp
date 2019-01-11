package com.swlodyga.JavaTemp;

import com.swlodyga.JavaTemp.config.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan({"com.swlodyga.JavaTemp","controller"})
@Import({SecurityConfig.class})
public class JavaTempApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaTempApplication.class, args);
	}

}

