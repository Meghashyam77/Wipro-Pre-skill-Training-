package com;


class Student{
	String name;
	int id;
	String status;
	void display() {
		System.out.print(this.name+"\t");
		System.out.print(this.id+"\t");
		System.out.println(this.status);
		
	}
	Student(String name, int id, String status){
		this.name=name;
		this.id=id;
		this.status=status;
		
	}
	//Polymorphism
	void display(int id) {
		System.out.println(id);
	}
	void display(String name) {
		System.out.println(name);
	}
	void display(String name,int id) {
		System.out.println(name+" "+id);
	}
}

	
public class Oopsworld {
	public static void main(String[] args) {
		Student s1=new Student("Shyam",100,"Pass");
		Student s2=new Student("Yashu",101,"Pass");
		
		s1.display(s1.id);
		s2.display();
		s1.display(s1.name,s1.id);
		
	}

}
