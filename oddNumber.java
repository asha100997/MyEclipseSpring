package Collections1;
import java.util.ArrayList;

public class oddNumber {
	public static void main(String[] args) {
		ArrayList<Integer>ps=new ArrayList<>();
		ps.add(4);
		ps.add(5);
		ps.add(6);
		ps.add(8);
		ps.add(9);
		for(int i=0;i<=ps.size()-1;i++) {
			if(ps.get(i)%2!=0) {
				System.out.println(ps.get(i));
			}
		}
	}

}
