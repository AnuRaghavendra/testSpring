package startspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartSpringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(StartSpringDemo.class, args);
		GitTest.testGit();
		System.out.println("Hello Anu");
	}

}
