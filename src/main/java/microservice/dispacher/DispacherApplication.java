package microservice.dispacher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import microservice.dispacher.controller.SimpleFilter;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class DispacherApplication {

	public static void main(String[] args) {
		SpringApplication.run(DispacherApplication.class, args);
	}
	

	 @Bean
	  public SimpleFilter simpleFilter() {
	    return new SimpleFilter();
	  }

	 
}
