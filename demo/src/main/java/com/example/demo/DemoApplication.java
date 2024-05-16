package com.example.demo;

import ch.qos.logback.core.model.conditional.ElseModel;
import com.example.demo.Repositories.*;

import com.example.demo.models.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println(" Hibernateproject is running .... ");
	}
//@Bean
//	CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository, CompanyRepository companyRepository, ProductRepository productRepository, ProducerRepository producerRepository , CustomerRepository customerRepository,TransactionRepository transactionRepository){
//		return  args ->{
//			//this is for company
//			Company company1=new Company("Facebook","+207828282","facebook@gmail.com");
//			Company company2=new Company("Instagram","+23456756","mukamaloui@gmail.com");
//			Company company3=new Company("Rangurura","+23456786","rangururaproj@gmail.com");
//			Company company4=new Company("Google","+123456789","google@gmail.com");
//			Company company5=new Company("Vubavuba","+123456785","vubavuba@gmail.com");
//			List<Company> ps=new ArrayList<Company>();
//			ps.add(company1);
//			ps.add(company2);
//			ps.add(company3);
//			ps.add(company4);
//			ps.add(company5);
//			companyRepository.saveAll(ps);
//
//
//			//this is for employee
//			Employee employee1 = new Employee(
//					new Contacts("SIBOMANA", "Edouard", "sibomanaedouard@gmail.com", "+1234567890"),
//					company1,
//					1000000000000.0
//			);
//			employeeRepository.save(employee1);
//
//			//this is for producer
//			Producers producer1 = new Producers(
//					new Contacts("Praise", "song", "praise@gmail.com", "+1234567891"),
//					company1
//
//			);
//			producerRepository.save(producer1);
//
//			//this is for the product
//			Products product1 = new Products("Chat",producer1);
//			productRepository.save(product1);
//
//
//			//this is for customers
//			Customers customer1=new Customers(
//					"Chat",
//					"RANGURURA",
//					new Contacts("Edd", "pro", "eddpro@gmail.com", "+1234567823")
//			);
//			customerRepository.save(customer1);
//
//			//this is for transactions
//
//			Transaction transaction1=new Transaction(company3,"0447c75a-b4d3-4e98-8404-cc8cddffb623");
//			transactionRepository.save(transaction1);
////
////			List<Employee>ps1=employeeRepository.findByContactsLastname("Edouard");
////			for(Employee employee:ps1){
////				System.out.println(employee);
////			}
//			System.out.println("The employees are:");
//			List<Employee> employees = employeeRepository.findBySalaryGreaterThan(1000);
//			for(Employee employee: employees){
//				System.out.println(employee);
//			}
//
//
//
//
//
//
//
//
//		};
//	}

}
