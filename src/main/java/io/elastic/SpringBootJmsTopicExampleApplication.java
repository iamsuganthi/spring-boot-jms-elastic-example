package io.elastic;

import co.elastic.apm.attach.ElasticApmAttacher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJmsTopicExampleApplication {
	public static void main(String[] args) {
		ElasticApmAttacher.attach();
		SpringApplication.run(SpringBootJmsTopicExampleApplication.class, args);
	}
}
