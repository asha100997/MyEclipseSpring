package Collections1;
import java.util.ArrayList;

public class UsePen1 {
	public static void main(String[] args) {
		Pen1 p1=new Pen1();
		p1.brand="Camlin";
		p1.color="black";
		p1.price=20;
		Pen1 p2=new Pen1();
		p2.brand="Cello";
		p2.color="blue";
		p2.price=36;
		Pen1 p3=new Pen1();
		p3.brand="Natraj";
		p3.color="red";
		p3.price=55;
		Pen1 p4=new Pen1();
		p4.brand="apsara";
		p4.color="black";
		p4.price=70;
		ArrayList<Pen1>pens=new ArrayList<>();
		ArrayList<Pen1>bluePen=new ArrayList<>();
		pens.add(p1);
		pens.add(p2);
		pens.add(p3);
		pens.add(p4);
		pens.set(1, p4);
		pens.add(p2);
		pens.remove(2);
		pens.add(p3);
		
		System.out.println(pens.toString());
		for(int i=0;i<=pens.size()-1;i++) {
			if(pens.get(i).price%2==0) {
		
			System.out.println(pens.get(i).price);
			}
		}
		
		for(Pen1 i:pens) {
			System.out.println(i);
		}
		pens.forEach(a->System.out.println(a));
		
	for(int i=0;i<=pens.size()-1;i++) {
		if(pens.get(i).brand.startsWith("C")){
			System.out.println(pens.get(i).brand);
			
		}
	}
		for(int i=0;i<=pens.size()-1;i++) {
			if(pens.get(i).color.equals("blue")) {
				System.out.println(pens.get(i));
			}
		}
			for(int i=0;i<=pens.size()-1;i++) {
				if(pens.get(i).color.equalsIgnoreCase("blue")) {
					bluePen.add(pens.get(i));
					
				
			}
		

}
			System.out.println(bluePen);
			
}
}