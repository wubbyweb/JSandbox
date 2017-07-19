package com.butterbox.hashmap;

import java.util.HashMap;

public class ClassHashMap {

	public static HashMap<Integer, Student> buildMap(Student[] students) {
		HashMap<Integer, Student> map = new HashMap<Integer, Student>();
		for (Student s : students) {
			map.put(s.getId(), s);
		}
		return map;
	}

	public static void main(String args[]) {
		HashMap<Integer, Student> localMap = new HashMap<Integer, Student>();
		Student[] localStudent = new Student[4];
		localMap = buildMap(populateStudent(localStudent));
		
		//Verify the output here
		System.out.println(localMap.get(2).getName());

	}

	static Student[] populateStudent(Student[] localStudent) {
		int i = 0;
		
		for (int j = 0; j < 4; j++) {
			localStudent[j] = new Student();
		}
		
		localStudent[i].setId(i);
		localStudent[i].setName("Rajesh Zero");
		i++;

		System.out.println(i);

		localStudent[i].setId(i);
		localStudent[i].setName("Rajesh One");
		i++;

		System.out.println(i);

		localStudent[i].setId(i);
		localStudent[i].setName("Rajesh Two");
		i++;

		System.out.println(i);

		localStudent[i].setId(i);
		localStudent[i].setName("Rajesh Three");
		
		return localStudent;

	}

}

class Student {
	int id;
	String name;

	int getId() {
		return id;
	}

	String getName() {
		return name;
	}

	void setId(int id) {
		this.id = id;
	}

	void setName(String name) {
		this.name = name;
	}
}
