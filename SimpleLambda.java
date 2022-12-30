package com.preethi.example;

/**
*
* https://www.linkedin.com/feed/update/urn:li:activity:7013857691861176320?utm_source=share&utm_medium=member_desktop
*/
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class SimpleLambda {
	public static void main(String... strings) {
		List<Integer> list = Arrays.asList(1,7,8,9,5,2,36,4,78,222,24,9);
		//Return sum
		int sum = list.stream().mapToInt(i -> i).sum();
		//Return average
		OptionalDouble average = list.stream().mapToInt(i -> i).average();
		double avg = average.getAsDouble();
		//Return square numbers
		list.stream().mapToInt(i -> i * i).forEach(System.out::println);
		//Return cube numbers
		list.stream().mapToInt(i -> i * i * i).forEach(System.out::println);
		//Return even
		list.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
		//Return odd
		list.stream().filter(i -> i % 2 != 0).forEach(System.out::println);
		//Filter numbers > 10
		list.stream().filter(i -> i > 10).forEach(System.out::println);
	} 
}
