package Collections1;
import java.util.ArrayList;

public class Pen {
	public static void main(String[] args) {
		ArrayList<Integer>ps=new ArrayList<>();
		
		ps.add(35);
		ps.add(45);
		ps.add(55);
		ps.add(65);
		ps.add(67);
		ps.add(69);
		ps.add(89);
		ps.add(98);
		ps.add(96);
		ps.add(60);
		int max=ps.get(0);
		for(int i=0;i<ps.size()-1;i++) {
			if(max<(ps.get(i))) {
				max=ps.get(i);
			}
		}
			System.out.println(max);
		
		
		for(Integer i:ps) {
			if(max<i) {
				max=i;
			}
		}
			System.out.println(max);
		}
		
	

}

