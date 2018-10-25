package com.aironman;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class TestStreaming {

	private static List<Product> productsList = new ArrayList<Product>();

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
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
		System.out.println("productPriceList is " + productPriceList);

		// parallel
		System.out.println("Now parallelizing...");

		// filtering by price, creating a map with filtered prices.
		List<Float> listPricesP = productsList.parallelStream().filter(aProduct -> aProduct.getPrice() <= 28000f)
				.map(aProduct -> aProduct.getPrice()).collect(Collectors.toList());

		// iterating over list
		listPricesP.forEach(System.out::println);

		// This is more compact approach for filtering data
		productsList.parallelStream().filter(product -> product.getPrice() == 30000)
				.forEach(product -> System.out.println(product.getPrice()));

		// Using Collectors's method to sum the prices.
		double totalPrice3P = productsList.parallelStream()
				.collect(Collectors.summingDouble(product -> product.getPrice()));
		System.out.println("total sum is " + totalPrice3P);

		// max() method to get max Product price
		Product productA_P = productsList.parallelStream()
				.max((product1, product2) -> product1.getPrice() > product2.getPrice() ? 1 : -1).get();

		System.out.println("max product price is " + productA_P.getPrice());
		// min() method to get min Product price
		Product productB_P = productsList.parallelStream()
				.max((product1, product2) -> product1.getPrice() < product2.getPrice() ? 1 : -1).get();
		System.out.println("min product price is " + productB_P.getPrice());

		// Converting product List into Set
		Set<Float> productPriceSet_P = productsList.parallelStream().filter(product -> product.getPrice() < 30000)
				.map(product -> product.getPrice()).collect(Collectors.toSet());
		System.out.println("productPriceSet is " + productPriceSet_P);

		// Converting Product List into a Map
		Map<Integer, String> productPriceMap_P = productsList.parallelStream()
				.collect(Collectors.toMap(p -> p.getId(), p -> p.getName()));
		System.out.println("productPriceMap is " + productPriceMap_P);

		List<Float> productPriceList_P = productsList.parallelStream().filter(p -> p.getPrice() > 30000)// filtering
																										// data
				.map(Product::getPrice) // fetching price by referring getPrice method
				.collect(Collectors.toList()); // collecting as list
		System.out.println("productPriceList is " + productPriceList_P);

		// Creating stream from collection, set or array

		System.out.println("Creating stream from collection, set or array...");
		Collection<String> collection = Arrays.asList("JAVA", "J2EE", "Spring", "Hibernate");
		Stream<String> stream2 = collection.stream();
		stream2.forEach(System.out::println);
		List<String> list = Arrays.asList("JAVA", "J2EE", "Spring", "Hibernate");
		Stream<String> stream3 = list.stream();
		stream3.forEach(System.out::println);
		Set<String> set = new HashSet<>(list);
		Stream<String> stream4 = set.stream();
		stream4.forEach(System.out::println);

		// Array can also be a source of a Stream
		System.out.println("Array can also be a source of a Stream...");
		Stream<String> streamOfArray = Stream.of("a", "b", "c");
		streamOfArray.forEach(System.out::println);
		// creating from existing array or of a part of an array:
		String[] arr = new String[] { "a", "b", "c" };
		Stream<String> streamOfArrayFull = Arrays.stream(arr);
		streamOfArrayFull.forEach(System.out::println);
		Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
		streamOfArrayPart.forEach(System.out::println);

		// from streamBuilder
		System.out.println("from streamBuilder...");
		Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").add("c").build();
		streamBuilder.forEach(System.out::println);

		// From Stream.generate()...
		System.out.println("From Stream.generate()...");
		Stream<String> streamGenerated = Stream.generate(() -> "element").limit(10);
		streamGenerated.forEach(System.out::println);

		// From Stream.iterate()
		System.out.println("From Stream.iterate()...");
		Stream<Integer> streamIterated = Stream.iterate(1, n -> n + 2).limit(5);
		streamIterated.forEach(System.out::println);

		// Stream of File
		System.out.println("Stream of File...");
		// absolut path...
		Path path = Paths.get("//Users/aironman//pmd-eclipse.log");
		Stream<String> streamOfStrings;
		try {
			streamOfStrings = Files.lines(path);
			Stream<String> streamWithCharset = Files.lines(path, Charset.forName("UTF-8"));
			streamOfStrings.forEach(System.out::println);
			streamWithCharset.forEach(System.out::println);
			streamOfStrings.close();
			streamWithCharset.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Stream of Primitives
		System.out.println("Stream of Primitives...");
		IntStream intStream = IntStream.range(1, 3);
		intStream.forEach(System.out::println);
		LongStream longStream = LongStream.rangeClosed(1, 3);
		longStream.forEach(System.out::println);
		Random random = new Random();
		DoubleStream doubleStream = random.doubles(3);
		doubleStream.forEach(System.out::println);
		
		// sorting a hashMap by value
		Map<String, Integer> map = new HashMap<String, Integer>();
		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		map.put("a", 21);
		map.put("b", 10);
		map.put("c", 12);
		map.put("d", 20);
		map.entrySet().stream()
					  .sorted((o1, o2) -> o1.getValue().compareTo(o2.getValue()))
					  .map(e -> e.getKey())
					  .collect(Collectors.toList())
					  .forEach(k -> sortedMap.put(k, map.get(k)));
		System.out.println(sortedMap);
	}

}
