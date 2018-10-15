package com.aironman;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TestStreaming {

	private static List<Product> productsList = new ArrayList<Product>();

	public static void main(String[] args) {
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		// filtering by price, creating a map with filtered prices.
		List<Float> listPrices = productsList.stream().filter(aProduct -> aProduct.getPrice() <= 28000f)
				.map(aProduct -> aProduct.getPrice()).collect(Collectors.toList());

		// iterating over list
		listPrices.forEach(System.out::println);

		// This is more compact approach for filtering data
		productsList.stream().filter(product -> product.getPrice() == 30000)
				.forEach(product -> System.out.println(product.getPrice()));

		// Using Collectors's method to sum the prices.
		double totalPrice3 = productsList.stream().collect(Collectors.summingDouble(product -> product.getPrice()));
		System.out.println("total sum is " + totalPrice3);

		// max() method to get max Product price
		Product productA = productsList.stream()
				.max((product1, product2) -> product1.getPrice() > product2.getPrice() ? 1 : -1).get();

		System.out.println("max product price is " + productA.getPrice());
		// min() method to get min Product price
		Product productB = productsList.stream()
				.max((product1, product2) -> product1.getPrice() < product2.getPrice() ? 1 : -1).get();
		System.out.println("min product price is " + productB.getPrice());

		// Converting product List into Set
		Set<Float> productPriceSet = productsList.stream().filter(product -> product.getPrice() < 30000)
				.map(product -> product.getPrice()).collect(Collectors.toSet());
		System.out.println("productPriceSet is " + productPriceSet);

		// Converting Product List into a Map
		Map<Integer, String> productPriceMap = productsList.stream()
				.collect(Collectors.toMap(p -> p.getId(), p -> p.getName()));
		System.out.println("productPriceMap is " + productPriceMap);

		List<Float> productPriceList = productsList.stream().filter(p -> p.getPrice() > 30000)// filtering data
				.map(Product::getPrice) // fetching price by referring getPrice method
				.collect(Collectors.toList()); // collecting as list
		System.out.println("productPriceList is " +productPriceList);

	}

}
