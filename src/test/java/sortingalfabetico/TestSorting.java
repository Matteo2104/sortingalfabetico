package sortingalfabetico;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import alphabeticsorting.Sorting;

public class TestSorting {
	
	@Test
	public void testSorting() {
		List<String> unorderedList = new ArrayList<>();
		unorderedList.add("matteo");
		unorderedList.add("vanessa");
		unorderedList.add("anita");
		unorderedList.add("antonio");
		unorderedList.add("cristian");
		
		List<String> orderedList = new ArrayList<>();
		unorderedList.add("anita");
		unorderedList.add("antonio");
		unorderedList.add("cristian");
		unorderedList.add("matteo");
		unorderedList.add("vanessa");
		
		List<String> resultList = Sorting.sort(unorderedList);

		assertTrue(resultList.containsAll(orderedList));
	}
}
