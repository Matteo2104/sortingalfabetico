package alphabeticsorting;

import java.util.Arrays;
import java.util.List;

public class Sorting {
	
	public static List<String> sort(List<String> names) {
		// converto la lista in input in array di stringhe
		String[] partialVector = names.toArray(new String[0]);

		Arrays.sort(partialVector);
		
		return Arrays.asList(partialVector);
	}
}