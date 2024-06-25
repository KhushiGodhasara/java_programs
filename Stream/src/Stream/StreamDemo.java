package Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		//create a stream from set of values
		Stream<Integer> stream = Stream.of(10,20,30,40,50,60,70);
		
		//counting the values
		System.out.println(stream.count());
		//stream.forEach(System.out::println);//printing stream values
		
		
		//creating array
		Integer[] values = new Integer[] {10,20,30,13,10,11,12,13};
		//creating  the stream from array
		stream = Arrays.stream(values);
		
		//map
		System.out.println("Square of " + Arrays.toString(values) + " is as follows: ");
		
		//1)stream.map(num -> num * num).forEach(System.out::println);
		//2)
		stream = stream.map(n->n*n);
		stream.forEach(System.out::println);
		
		//limit to get values
		System.out.println("First two elements are: " );
		Arrays.stream(values).limit(2).forEach(System.out::println);
		
		//skip
		System.out.println("Elements excepts first 4: ");
		Arrays.stream(values).skip(4).forEach(System.out::println);
		
		//distinct
		System.out.println("Distinct elements are : ");
		Arrays.stream(values).distinct().forEach(System.out::println);//distinct->remove the duplicate
		
		List<String> words = Arrays.asList("Hello","Stream","Learning");
		//words.add("Happy");//immutable list
		
		//create a stream from List
		//toUpperCase
		//toLowerCase
		//Collect--->collectors--->Applicable in list and set
		
		Stream<String> stream1 = words.stream();
		System.out.println(words);
	}

}
