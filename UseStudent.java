package Collections1;
import java.util.ArrayList;

public class UseStudent {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="rani";
		s1.age=23;
		s1.ismale=false;
		s1.marks=98;
		Student s2=new Student();
		s2.name="vani";
		s2.age=22;
		s2.ismale=false;
		s2.marks=90;
		Student s3=new Student();
		s3.name="raj";
		s3.age=25;
		s3.ismale=true;
		s3.marks=92;
		Student s4=new Student();
		s4.name="ram";
		s4.age=24;
		s4.ismale=true;
		s4.marks=88;
		Student s5=new Student();
		s5.name="kani";
		s5.age=20;
		s5.ismale=false;
		s5.marks=94;
		Student s6=new Student();
		s6.name="vijay";
		s6.age=26;
		s6.ismale=true;
		s6.marks=98;
		Student s7=new Student();
		s7.name="mani";
		s7.age=24;
		s7.ismale=true;
		s7.marks=98;
		ArrayList<Student>sd=new ArrayList<>();
		ArrayList<Student>boysDetails=new ArrayList<>();
		ArrayList<Student>girlsDetails=new ArrayList<>();
		sd.add(s1);
		sd.add(s2);
		sd.add(s3);
		sd.add(s4);
		sd.add(s5);
		sd.add(s6);
		sd.add(s7);
		System.out.println(sd);
		for(int i=0;i<=sd.size()-1;i++) {
			if(sd.get(i).ismale==true) {
				boysDetails.add(sd.get(i));
			}
		}
		System.out.println(boysDetails);
		
	for(int i=0;i<=sd.size()-1;i++) {
			if(sd.get(i).ismale!=true) {
				girlsDetails.add(sd.get(i));
			}
			
		}
		System.out.println(girlsDetails);
		
		
		
		
		
		
		
		
	}

}
