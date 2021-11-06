package io.github.tingreavinash.JavaConcepts.Immutability;

class Test{
	private final int i;
	
	Test(int i){
		this.i = i;
	}
	
	public Test modify(int i) {
		if(this.i == i) {
			return this;
		}else {
			return new Test(i);
		}
	}
	
}

public class MyImmutableClass {

	public static void main(String[] args) {
		
		Test t1 = new Test(10);
		t1.modify(40);
		Test t2 = t1.modify(100);
		Test t3 = t1.modify(10);
		
		System.out.println(t1==t2);
		System.out.println(t1==t3);
	}

}
