package alphabeticsorting;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
		names.add("matteo");
		names.add("vanessa");
		names.add("anita");
		names.add("antonio");
		names.add("cristian");
		
		Sorting.sort(names);
	}
}
