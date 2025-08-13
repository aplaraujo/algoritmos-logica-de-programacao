package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		Stream<Integer> st1 = list.stream().map(element -> element * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		int sum = list.stream().reduce(0,(x, y) -> x + y);
		System.out.println("Sum = " + sum);
		
		List<Integer> newList = list.stream().filter(el -> el % 2 == 0).map(el -> el * 10).collect(Collectors.toList());
		System.out.println(Arrays.toString(newList.toArray()));
	}

}
