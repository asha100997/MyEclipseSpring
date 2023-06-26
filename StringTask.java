package Collections1;
import java.util.ArrayList;

public class StringTask {
	public static void main(String[] args) {
		ArrayList<String>bn=new ArrayList<>();
		bn.add("ABC");
	    bn.add("DEF");
	    bn.add("AEIOU");
	    bn.add("RENOLDS");
	    bn.add("CAMLIN");
	    int max=bn.get(0).length();
	    String tem=" ";
	    bn.forEach(a->System.out.println(a));
	    for(int i=0;i<=bn.size()-1;i++) {
	    	if(max<bn.get(i).length()) {
	    	max=bn.get(i).length();
	    	tem=bn.get(i);
	    }
	}
	    System.out.println(tem);
	}

}
