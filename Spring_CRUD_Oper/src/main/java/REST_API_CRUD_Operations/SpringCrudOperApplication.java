package REST_API_CRUD_Operations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCrudOperApplication {

	public static void main(String[] args) {
	
		ConfigurableApplicationContext context =
		SpringApplication.run(SpringCrudOperApplication.class, args);
		
		System.out.println(" These is Deva Ram ");
	}
}
//spring.datasource.url=jdbc:mysql://localhost:3306/your_database
//spring.datasource.username=root
//spring.datasource.password=your_password
//spring.datasource.driver-class-nam   ne=com.mysql.cj.jdbc.Driver


//# HikariCP settings (optional)
//spring.datasource.hikari.minimum-idle=5
//spring.datasource.hikari.maximum-pool-size=20
