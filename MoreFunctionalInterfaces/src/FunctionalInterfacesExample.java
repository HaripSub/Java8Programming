import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalInterfacesExample {
	public static void main(String[] args) {
		Supplier<String> supplier = () -> "Hello World";
		System.out.println(supplier.get());
		
		Supplier<Integer> integer_supplier = () -> 5;
		System.out.println(integer_supplier.get());
		
		
		Supplier<Integer> randomNumberSupplier = () -> (int) (Math.random() * 100);
		System.out.println("Random number: " + randomNumberSupplier.get());
		
		Consumer<String> consumer = message -> System.out.println("Message: " + message);
		consumer.accept("Welcome");
		
		Predicate<Integer> predicate_is_even = n -> n%2==0;
		
		System.out.println(predicate_is_even.test(8));
		
		System.out.println(predicate_is_even.test(5));
		
		Function<Integer, String> function = n -> "Number: " + n;
		System.out.println(function.apply(10)); 
		
		
		Function<String, String> toUpperCase = String::toUpperCase;

        Function<String, String> addPrefix = s -> "Hello " + s;

        Function<String, String> chainedFunction = addPrefix.andThen(toUpperCase);

        String result = chainedFunction.apply("world");

        System.out.println(result);
        
        BiFunction<Integer, Integer, Integer> product = (a, b) -> a * b;
        System.out.println("Result of product: " + product.apply(5, 3)); 
		
        UnaryOperator<Double> cube = n -> Math.pow(n, 3);
        System.out.println("Cube of 5: " + cube.apply(5.0));
        
        
        BinaryOperator<Integer> min = Integer::min;
        System.out.println("Minimum of 10 and 20: " + min.apply(10, 20)); 
        
        List<String> citrus_fruits = Arrays.asList("Mandarin", "Clementine", "Orange");
        Consumer<String> printfruitnames = System.out::println;
        citrus_fruits.forEach(printfruitnames);


		
	}
	}


