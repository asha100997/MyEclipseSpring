package Collections1;

import java.util.ArrayList;

public class Name {
	public static void main(String[] args) {
		ArrayList<String>ps=new ArrayList<>();
		
		ps.add("rani");
		ps.add("vani");
		ps.add("kani");
		ps.add("mani");
		ps.add("uma");
		ps.add("raja");
		ps.add("vijay");
		ps.add("vini");
		ps.add("ram");
		ps.add("raj");
		int max=ps.get(0).length();
		for(int i=0;i<=ps.size()-1;i++) {
			if(max<ps.get(i).length()) {
				max=ps.get(i).length();
			}
			}
			System.out.println(max);
		
		for(String i:ps) {
			System.out.println(i);
		}

}
}