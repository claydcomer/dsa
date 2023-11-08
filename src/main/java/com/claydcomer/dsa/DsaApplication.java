package com.claydcomer.dsa;

import com.claydcomer.dsa.datastructure.Heap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsaApplication.class, args);

		Heap heap = new Heap(10);

		heap.insert(80);
		heap.insert(75);
		heap.insert(60);
		heap.insert(68);
		heap.insert(55);
		heap.insert(40);
		heap.insert(52);
		heap.insert(67);

		heap.printHeap();
		System.out.println("Peek: " + heap.peek());

		heap.delete(0);
		System.out.println("Peek: " + heap.peek());
	}

}
