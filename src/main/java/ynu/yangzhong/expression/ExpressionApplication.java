package ynu.yangzhong.expression;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})//配置dataSourse后删除
public class ExpressionApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ExpressionApplication.class, args);
	}
}
