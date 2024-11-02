package vn.hoidanit.laptopshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LaptopshopApplication {

	public static void main(String[] args) {

		// container
		ApplicationContext locnht = SpringApplication.run(LaptopshopApplication.class, args);
		for (String s: locnht.getBeanDefinitionNames()) {
			System.err.println(s);
		}
	}
}
