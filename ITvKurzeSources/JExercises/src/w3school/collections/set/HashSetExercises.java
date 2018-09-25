package w3school.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExercises {

	public static void main(String[] args) {

		HashSet<String> cars = new HashSet<>();

		// 1. add specified element to the end of a hashset
		System.out.println("Exercise 1");
		cars.add("volvo");
		cars.add("bmw");
		System.out.println(cars);

		// 2. iterate through all elements in hashset
		System.out.println("Exercise 2");
		Iterator<String> iterator = cars.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();

		for (String string : cars) {
			System.out.print(string + " ");
		}
		System.out.println();

		// 3. get number of elements in hash set
		System.out.println("Exercise 3");
		System.out.println("number of elements: " + cars.size());

		// 4. empty a hashset
		System.out.println("Exercise 4");
		cars.clear();
		System.out.println(cars);

		// 5. test hashset ifEmpty or not
		System.out.println("Exercise 5");
		System.out.println("isEmpty? " + cars.isEmpty());

		// 6. clone hashset
		System.out.println("Exercise 6");
		cars.add("mercedes");
		cars.add("jaguar");
		HashSet<String> cars2 = new HashSet<>();
		cars2 = (HashSet<String>) cars.clone();
		System.out.println(cars);
		System.out.println(cars2);

		// 7. convert hash set to array
		System.out.println("Exercise 7");
		String[] cars3 = cars.toArray(new String[cars.size()]);
		for (String string : cars3) {
			System.out.print(string + " ");
		}

		System.out.println();

		// 8. convert hash set to tree set
		System.out.println("Exercise 8");
		Set<String> cars4 = new TreeSet<>(cars);
		System.out.println(cars4);

		// 9. convert hash set to list/arraylis
		System.out.println("Exercise 9");
		List<String> cars5 = new ArrayList<>(cars);
		System.out.println(cars5);

		// 10. compare hash sets
		System.out.println("Exercise 10");
		cars2.add("mercedes");
		cars.add("bmw");

		System.out.println(cars);
		System.out.println(cars2);

		for (String string : cars) {
			if (cars2.contains(string)) {
				System.out.println("cars2 contains " + string);
			} else {
				System.out.println("cars2 not contains " + string);
			}
		}

		// 11. compare hash sets and retain same elements
		System.out.println("Exercise 11");
		System.out.println("before compare and retainAll");
		System.out.println(cars);
		System.out.println(cars2);
		cars.retainAll(cars2);
		System.out.println("after compare and retainAll");
		System.out.println(cars);
		System.out.println(cars2);

		// 12. remove all elements from hash set
		System.out.println("Exercise 12");
		System.out.println("before removal");
		System.out.println(cars);
		cars.clear();
		System.out.println("after removal");
		System.out.println(cars);

	}

}
