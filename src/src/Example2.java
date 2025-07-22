package src;

import java.util.Map;
import java.util.Optional;

public class Example2 {
	
	
	public static void main(String[] args) {
		Map<Integer, String> map = Map.of(
				1, "Apple",
				2, "Banana",
				3, "Manish",
				4, "Manish"
				);
		
		String target = "Manish";
		checkValueisPresent(map, target);
	}

	private static void checkValueisPresent(Map<Integer, String> map, String target) {
		Optional<Map.Entry<Integer,String>> result = map.entrySet()
				.stream()
				.filter(entry -> entry.getValue().equals(target))
				.findFirst();
		
		result.ifPresentOrElse(entry -> System.out.println("Found The Key is:" + entry.getKey()),
				() -> System.out.println("Not found Any Key"));
		
	}
}
