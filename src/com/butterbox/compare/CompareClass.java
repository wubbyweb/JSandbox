package com.butterbox.compare;

import java.util.Comparator;

public class CompareClass{
	public static void main(String args[]){
		//Student[] student = new Student[1];
		Student student1 = new Student();
		Student student2 = new Student();
		
		/*student[0].id = 1;
		student[0].name = "Rajesh";
		
		student[1].id = 2;
		student[1].name = "Sindhu";
		*/
		student1.id = 1;
		student1.name = "Rajesh";
		
		student2.id = 2;
		student2.name = "Sindhu";
		
	
		
		Comparer comp = new Comparer();
		System.out.println(comp.compare(student1, student2));
		
	}

}

class Comparer implements Comparator, Comparable{
	
	

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}


	public int compare(Object o1, Object o2) {
		Student o1_ = (Student) o1;
		Student o2_ = (Student) o2;
		return (o1_.id==o2_.id)?0:(o1_.id<o2_.id)?1:-1;
	}



}

class Student{
	int id;
	String name;
}
