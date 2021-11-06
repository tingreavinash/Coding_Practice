package io.github.tingreavinash.JavaConcepts.Immutability;

class Student {
	private final int rollNo;

	Student(int rollNo) {
		this.rollNo = rollNo;
	}

	public Student modify(int i) {
		if (this.rollNo == i) {
			return this;
		} else {
			return new Student(i);
		}
	}

}

public class Runner {

	public static void main(String[] args) {

		Student s1 = new Student(10);
		s1.modify(40);
		Student s2 = s1.modify(100);
		Student s3 = s1.modify(10);

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
	}

}
