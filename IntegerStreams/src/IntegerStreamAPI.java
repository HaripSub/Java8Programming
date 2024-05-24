import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * usage of stream API for integer array
 * 
 */

public class IntegerStreamAPI {
	public static void main(String[] args) {

		System.out.println("filters the array for even numbers, doubles the filtered value and sorts the values "
				+ "and collects the value in a list using java streams API ");

		System.out.println("-------------------------------------------------------------------------");

		Predicate<Integer> isEven = n -> n % 2 == 0;
		List<Integer> numbers = Arrays.asList(56, 78, 34, 23, 45, 67, 18, 89);
		List<Integer> doubledevennumbers = numbers.stream().filter(isEven).map(NumberUtils::doubleValue).sorted()
				.collect(Collectors.toList());

		System.out.println(doubledevennumbers);

		System.out.println("-------------------------------------------------------------------------");

		System.out.println("count of the even numbers doubled using stream API ");

		long count = doubledevennumbers.stream().filter(n -> n % 2 == 0).count();
		System.out.println(count);

		System.out.println("-------------------------------------------------------------------------");

		System.out.println("Sum of the elements in a array using stream API ");

		int sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println(sum);

		System.out.println("-------------------------------------------------------------------------");

		System.out.println("array sorted in descending order ");
		List<Integer> sortedNumbers = numbers.stream().sorted((n1, n2) -> n2 - n1).collect(Collectors.toList());
		sortedNumbers.stream().forEach(System.out::println);
	}

}
