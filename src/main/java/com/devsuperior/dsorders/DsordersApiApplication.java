package com.devsuperior.dsorders;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.dsorders.entities.Client;
import com.devsuperior.dsorders.entities.Order;
import com.devsuperior.dsorders.entities.OrderStatus;
import com.devsuperior.dsorders.entities.Product;
import com.devsuperior.dsorders.repositories.ClientRepository;
import com.devsuperior.dsorders.repositories.OrderRepository;
import com.devsuperior.dsorders.repositories.ProductRepository;

@SpringBootApplication
public class DsordersApiApplication implements CommandLineRunner {
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DsordersApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Client c1 = new Client(null, "Alex Green", "alex@email.com");
		
		clientRepository.save(c1);
		
		
		Product p1 = new Product(null, "TV", 1000.0);
		Product p2 = new Product(null, "Mouse", 40.0);
		Product p3 = new Product(null, "PC", 1200.0);
		
		productRepository.saveAll(Arrays.asList(p1, p2, p3));
		
		Order o1 = new Order(null, Instant.parse("2021-04-18T11:25:09Z"), OrderStatus.PAID, c1);
		Order o2 = new Order(null, Instant.parse("2021-04-20T13:30:00Z"), OrderStatus.CANCELED, c1);
		
		orderRepository.saveAll(Arrays.asList(o1, o2));
		
	}

}
