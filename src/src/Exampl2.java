package src;

import java.util.Map;

public class Exampl2 {
	
	public static void main(String[] args) {
	
		Map<Integer, String> map = Map.of(
				1, "Apple",
				2, "Banana",
				3, "Manish"
				);
		
		String target = "Manish";
		checkValueisPresent(map, target);
	}

	private static void checkValueisPresent(Map<Integer, String> map, String target) {
		boolean found = false;
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			if(entry.getValue().equals(target)) {
				System.out.println("Found The Key is:" + entry.getKey());
				found =true;
				break;
			}
		}
		
		if(!found) {
			System.out.println("Not found Any Key");
		}
		
	}
}
