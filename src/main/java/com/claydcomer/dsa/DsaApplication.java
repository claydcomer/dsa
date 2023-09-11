package com.claydcomer.dsa;

import com.claydcomer.dsa.datastructure.stack.ArrayStack;
import com.claydcomer.dsa.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsaApplication.class, args);

		ArrayStack stack = new ArrayStack(10);

		stack.push(new Employee("Jane", "Jones", 123));
		stack.push(new Employee("John", "Doe", 4567));
		stack.push(new Employee("Mary", "Smith", 22));
		stack.push(new Employee("Mike", "Wilson", 3245));
		stack.push(new Employee("Bill", "End", 78));

//		System.out.println(stack.peek());
		System.out.println("Popped: " + stack.pop());
		System.out.println(stack.peek());
	}

}
