package DataStructure.Array;

public class LinkedListMain{
	public static void main(String[] args){
		LinkedList numbers = new LinkedList();
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);

		LinkedList.ListIterator i = numbers.listIterator();
		i.remove();
		
		
		
	}
}
