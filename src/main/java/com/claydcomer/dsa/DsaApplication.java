package com.claydcomer.dsa;

import com.claydcomer.dsa.datastructure.stack.ArrayStack;
import com.claydcomer.dsa.datastructure.stack.LinkedStack;
import com.claydcomer.dsa.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsaApplication.class, args);

		Employee e1 = new Employee("Jane", "Jones", 123);
		Employee e2 = new Employee("John", "Doe", 4567);
		Employee e3 = new Employee("Mary", "Smith", 22);
		Employee e4 = new Employee("Mike", "Wilson", 3245);
		Employee e5 = new Employee("Bill", "End", 78);
	}

}
