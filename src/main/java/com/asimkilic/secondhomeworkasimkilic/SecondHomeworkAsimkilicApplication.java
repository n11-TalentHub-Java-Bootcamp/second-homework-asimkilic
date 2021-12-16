package com.asimkilic.secondhomeworkasimkilic;

import com.asimkilic.secondhomeworkasimkilic.entity.Category;
import com.asimkilic.secondhomeworkasimkilic.entity.Product;
import com.asimkilic.secondhomeworkasimkilic.service.entityservice.CategoryEntityService;
import com.asimkilic.secondhomeworkasimkilic.service.entityservice.ProductEntityService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class SecondHomeworkAsimkilicApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SecondHomeworkAsimkilicApplication.class, args);

		CategoryEntityService categoryEntityService = applicationContext.getBean(CategoryEntityService.class);
		ProductEntityService productEntityService = applicationContext.getBean(ProductEntityService.class);


		// findAndPrintAllCategories(categoryEntityService);
		// findAndPrintAllProducts(productEntityService);

	}

	private static void findAndPrintAllCategories(CategoryEntityService categoryEntityService) {
		List<Category> categoryList = categoryEntityService.findAll();
		for (Category category : categoryList) {
			System.out.println(category.getName());
		}
	}
private static void findAndPrintAllProducts(ProductEntityService productEntityService){
	List<Product> productList = productEntityService.findAll();
	for (Product product : productList) {
		System.out.println(product.getName());
	}
}
}
