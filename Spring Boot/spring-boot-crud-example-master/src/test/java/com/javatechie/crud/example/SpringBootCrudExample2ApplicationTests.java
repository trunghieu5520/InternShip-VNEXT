package com.javatechie.crud.example;

import com.javatechie.crud.example.repository.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.javatechie.crud.example.entity.Product;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


import java.util.List;


@SpringBootTest
class SpringBootCrudExample2ApplicationTests {

	@Autowired
	ProductRepository repo;


	@Test
	public void testCreate(){
		Product p = new Product();
		p.setId(1);
		p.setName("Head Phone");
		p.setQuantity(1);
		p.setPrice(10000);
		repo.save(p);
		assertNotNull(repo.findById(1).get());

	}

	@Test
	public void testGetAll(){
		List<Product> list = repo.findAll();
		assertThat(list).size().isGreaterThan(0);
	}

	@Test
	public void testUpdate(){
		Product p = repo.findById(10).get();
		p.setPrice(16000);
		repo.save(p);
		assertEquals(15000, repo.findById(10).get().getPrice());

	}
	@Test
	public void testDelete () {
		repo.deleteById(10);
		assertThat(repo.existsById(10)).isFalse();
	}
}
