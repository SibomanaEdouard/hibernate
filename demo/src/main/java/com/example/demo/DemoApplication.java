package com.example.demo;

import com.example.demo.Repositories.EmployeeRepository;
import com.example.demo.Repositories.PersonRepository;
import com.example.demo.models.Person;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
@Bean
	CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository){
		return  args ->{
//			Person person=new Person("Muhire","Lambert","muhirelambert@gmail.com");
//			Person person1=new Person("Mukama","John","mukamaloui@gmail.com");
//			Person person2=new Person("kamali","Jean","kamalijohn@gmail.com");
//			Person person3=new Person("Kagabo","John","kagabo@gmail.com");
//			List<Person> ps=new ArrayList<Person>();
//			ps.add(person1);
//			ps.add(person2);
//			ps.add(person3);
//			ps.add(person);
//			personRepository.saveAll(ps);



		};
	}

}
