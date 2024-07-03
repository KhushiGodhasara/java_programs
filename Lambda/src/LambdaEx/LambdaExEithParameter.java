package lambdaEx;

import java.util.function.Function;
import java.util.stream.Stream;

public class LambdaExEithParameter {

	public static void main(String[] args) {
		
		// using Lambda Expression
				//Message
				Message m1 = (name) -> 
				{
					System.out.println("Hello " + name);
				};
				m1.greet("Shivani");
				
				//Cube
				Cube c = (a) -> {
					return (a*a*a);
				};
				System.out.println("Cube of 5 is: "+ c.calculate(5));
				
				Cube c1 = (a) -> a * a * a;
				System.out.println("Cube of 4 is "+c1.calculate(4));
				
				//Stream
				Stream<Integer> stream = Stream.of(10,20,30,40,50,60);
				Function<Integer, Integer> sqr=(n)->n * n;
				stream.map(sqr).forEach(System.out::println);

				//IsOdd
				IsOdd o = (a) -> a % 2 != 0 ? true:false;
				System.out.println("Is 7 odd number? :  "+ o.checkOdd(7));
				System.out.println("Is 8 odd number? :  "+ o.checkOdd(8));
	}

}
