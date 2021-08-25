package com.avinash.java_concepts.InterviewProblems;

interface In2{
	
}
interface In3{
	
}

interface In1 extends In2,In3
{ 
    // public, static and final 
    int a = 10; 
    
    // public and abstract  
    void display();
    
    static void printMsg() {
    	System.out.println("Hello!");
    }
} 
  
// A class that implements the interface. 
class TestClass2 implements In1 
{ 
    // Implementing the capabilities of 
    // interface. 
    public void display()  
    { 
        System.out.println("Geek"); 
    } 
    
    public void testmsg() {
    	System.out.println("test");
    }
  
    // Driver Code 
    public static void main (String[] args) 
    { 
        In1 t = new TestClass2(); 
        t.display();
        
        In1.printMsg();
        System.out.println(a);
        
        int a=30;
        double b = a;
        System.out.println(b);
        
  } 
} 