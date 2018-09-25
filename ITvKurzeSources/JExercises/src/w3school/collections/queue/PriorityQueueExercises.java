package w3school.collections.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExercises {

	public static void main(String[] args) {

		// 1. create queue, add elements, print queue
		Queue<String> fronta = new PriorityQueue<String>();
		fronta.add("mindza");
		fronta.add("frndza");
		fronta.add("pizda");
		System.out.println("Exercise 1");
		System.out.println(fronta);

		// 2. iterate through all emelents

		Iterator<String> iterator = fronta.iterator();
		System.out.println("Exercise 2");

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// 3. add all elemente into another priority queue
		System.out.println("Exercise 3");
		Queue<String> fronta2 = new PriorityQueue<String>();
		fronta2.addAll(fronta);
		System.out.println(fronta2);

		// 4. insert element into priority queue
		System.out.println("Exercise 4");
		fronta.offer("ringla");
		System.out.println(fronta);

		// 5. remove all elements from priority queue
		System.out.println("Exercise 5");
		fronta2.clear();
		System.out.println(fronta2);

		// 6. count number of elements in priority queue
		System.out.println("Exercise 6");
		System.out.println(fronta.size());

		// 7.compare two priority queues
		fronta2.add("frndza");
		System.out.println("Exercise 7");

		for (String string : fronta) {

			if (fronta2.contains(string)) {
				System.out.println("fronta 2 contains " + string);
			} else {
				System.out.println("fronta 2 not contains " + string);
			}
		}

		// 8. retrieve first element of priority queue
		System.out.println("Exercise 8");
		System.out.println(fronta.peek());
		System.out.println(fronta);

		// 9. retrieve and remove first element of priority queue
		System.out.println("Exercise 9");
		System.out.println(fronta.poll());
		System.out.println(fronta);

		// 10. convert to array
		System.out.println("Exercise 10");
		String[] pole = fronta.toArray(new String[fronta.size()]);
		for (String string : pole) {
			System.out.println(string);
		}

		// 11. convert to string
		System.out.println("Exercise 11");
		System.out.println(fronta.toString());

		// 12. convert to maximum priority queue
		System.out.println("Exercise 12");
		PriorityQueue<Integer> pq1 = new PriorityQueue<>(10);
		pq1.offer(10);
		System.out.println(pq1);
		pq1.offer(14);
		System.out.println(pq1);
		pq1.offer(9);
		System.out.println(pq1);
		pq1.offer(100);
		System.out.println(pq1);
		pq1.offer(104);
		System.out.println(pq1);
		pq1.poll();
		System.out.println(pq1);
		pq1.poll();
		System.out.println(pq1);
		pq1.poll();
		System.out.println(pq1);
		pq1.poll();
		System.out.println(pq1);
		pq1.poll();
		System.out.println(pq1);
	}

}
