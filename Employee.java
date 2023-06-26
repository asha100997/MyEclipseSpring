package Collections1;
import java.util.ArrayList;

public class Employee {
	public static void main(String[] args) {
		ArrayList<Integer>li=new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(35);
		li.add(45);
		System.out.println(li);
		System.out.println(li.get(3));
		System.out.println(li.set(3, 56));
		System.out.println(li.remove(2));
		System.out.println(li.size());
	}

}
