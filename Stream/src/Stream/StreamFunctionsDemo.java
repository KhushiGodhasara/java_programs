package streamapi;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFunctionsDemo {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Nashik","","Banglore","","Chennai","Mumbai","Pune");
		System.out.println("List of Cities is " + strList);
		
		//retrieve the stream
		Stream <String> stream = strList.stream();
		
		//Counting the empty strings
		long count = StreamFunctions.countEmptyStrings(stream);
		System.out.printf("List %s has %d empty strings \n", strList, count);
		//System.out.println("List" + strList + " has " + count+ "empty strings");
		
		//counting string with length more than 8*
		count = StreamFunctions.countStrings(strList.stream(), 8);
		System.out.printf("List %s has %d strings of length more than 8 \n",strList, count);
		
		//Remove all empty strings from list*
		List<String> filteredList = StreamFunctions.nonEmptyStringList(strList.stream());
		System.out.printf("Original List : %s, List without Empty Strings : %s \n", strList,filteredList);
		
		 // Strings with length more than 6
		filteredList = StreamFunctions.getStrings(strList.stream(),6);
		System.out.printf("Original List : %s, Cities length more than 6: %s %n", strList, filteredList);

		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		 // retrieve the stream
		Stream<Integer> stream1 = numbers.stream();

		 // List of square of all distinct numbers
		List<Integer> filteredNumberList = StreamFunctions.getSquareList(stream1);
		System.out.printf("Original List : %s, Square Without duplicates : %s %n", numbers, filteredNumberList);

		 // Get count, min, max, sum, and average for numbers
		StreamFunctions.showStatistics(numbers.stream());
		
		
	}

}

class StreamFunctions
{

	//method to count empty string
	public static long countEmptyStrings(Stream<String> stream) {
		return stream.filter(String::isEmpty).count();
	}


	//method to count string longer than a given length
	public static long countStrings(Stream<String> stream, int length) {
		return stream.filter(s -> s.length() > length).count();
	}

	// Method to get a list of non-empty strings
	public static List<String> nonEmptyStringList(Stream<String> stream) {
		return stream.filter(s -> !s.isEmpty()).collect(Collectors.toList());
	}
	
	// Method to get a list of strings longer than a given length
	public static List<String> getStrings(Stream<String> stream, int length) {
		return stream.filter(s -> s.length() > length).collect(Collectors.toList());
		
	}
	
	// Method to get a list of squares of distinct numbers
	public static List<Integer> getSquareList(Stream<Integer> stream1) {
		return stream1.map(n -> n * n).distinct().collect(Collectors.toList());
	}

	// Method to show statistics (count, min, max, sum, average) for a list of numbers
	public static void showStatistics(Stream<Integer> stream) {
		IntSummaryStatistics stats = stream.mapToInt(Integer::intValue).summaryStatistics();
        System.out.printf("Count: %d, Min: %d, Max: %d, Sum: %d, Average: %.2f \n",
                stats.getCount(), stats.getMin(), stats.getMax(), stats.getSum(), stats.getAverage());
	}
	
}
