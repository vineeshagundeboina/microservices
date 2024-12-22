package __welcome_api.ashokit.singleton;

import java.util.HashMap;
import java.util.Map;

public class Singleton {
//	

	public static void main(String[] args) {
		
		
		String input="adaaddarsc";
		findCharacterFrequency(input);

	}
	
	public static void findCharacterFrequency(String input) {
		Map<Character, Integer> frequencyMap=new HashMap<>();
	//this for loop counts the occurances of each character
		for(char c:input.toCharArray()) {
			frequencyMap.put(c, frequencyMap.getOrDefault(c,0)+1);
		}
	//below will filter and print characters whose occurrence is greater than 2	
		for(Map.Entry<Character, Integer> entry:frequencyMap.entrySet()) {
			if(entry.getValue()>2) {
				System.out.println(entry.getKey()+" - "+entry.getValue());
			}
		}
		
	}

}



