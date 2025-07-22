package src;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {

	public static void main(String [] args) {
		List<Integer> input = Arrays.asList(25);
		double avg = calculatAverage(input);
		System.out.println(avg);
	}
	
	public static double calculatAverage(List<Integer> numbers) {
		
		List<Double> filtered = numbers.stream()
//				.map(n -> Math.sqrt(n))
				.map(Math::sqrt)
				.map(sqrt -> sqrt * sqrt)
				.filter(val -> val > 50)
				.collect(Collectors.toList());
		
		Double sum = filtered.stream().mapToDouble(Double::doubleValue).sum();
		
		
		
		return sum / filtered.size();
	}
}
