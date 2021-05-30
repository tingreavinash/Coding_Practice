package com.avinash.InterviewProblems;

class Reference{
    public int value = 5;
    
    public static void testmsg() throws Exception{
    	System.out.println("test");
    }
}

class TestClass4 {
	static final int a;
	static {
		a=33;
		System.out.println("Hello");
	}
	
    public static void main( String args[] ) throws Exception {
    	
    	
      final Reference example = new Reference(); //declaration
      example.value = 6; // Modifying the object creates no disturbance
      Reference.testmsg();
      //Reference another = new Reference();
      //example = another; // Attempting to change the object it refers to, creates an error
      	
      System.out.println(TestClass4.a);
         }
}