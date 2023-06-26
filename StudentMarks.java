package Collections1;
import java.util.ArrayList;

public class StudentMarks {
	public static void main(String[] args) {
		ArrayList<Integer>sm=new ArrayList<>();
		sm.add(35);
		sm.add(45);
		sm.add(55);
		sm.add(65);
		sm.add(67);
		sm.add(69);
		sm.add(89);
		sm.add(98);
		sm.add(96);
		sm.add(60);
		System.out.println(sm.get(9));
		System.out.println(sm.set(6, 99));
		System.out.println(sm);
		System.out.println(sm.size());

		
	}

}
