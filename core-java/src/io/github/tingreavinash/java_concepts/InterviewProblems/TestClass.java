package io.github.tingreavinash.java_concepts.InterviewProblems;

class Parent { 
	int i=10;
    void show() 
    { 
        System.out.println("Parent's show()"); 
    } 
} 
  
// Inherited class 
class Child extends Parent { 
	int i=30;
    // This method overrides show() of Parent 
	@Override
    void show() 
    { 
        System.out.println("Child's show()"); 
    } 
} 
  
// Driver class 
class TestClass { 
    public static void main(String[] args) 
    { 
        Parent obj1 = new Parent(); 
        obj1.show(); 
        System.out.println(obj1.i);
        
        Parent obj2 = new Child(); 
        obj2.show(); 
        System.out.println(obj2.i);
        
        Child obj3 = new Child();
        obj3.show();       
        System.out.println(obj3.i);
    } 
} 