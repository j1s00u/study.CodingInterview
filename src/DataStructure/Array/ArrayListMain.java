package DataStructure.Array;

public class ArrayListMain {

	public static void main(String[] args) {
		ArrayList numbers = new ArrayList();
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
		numbers.add(1, 15);
		numbers.addFirst(5);
		numbers.remove(1);
		System.out.println(numbers);
		System.out.println(numbers.get(0));
		System.out.println(numbers.indexOf(20));
		ArrayList.ListIterator li = numbers.listIterator();
		
		li.previous();
	}

}
