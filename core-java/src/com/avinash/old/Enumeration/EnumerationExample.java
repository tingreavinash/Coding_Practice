package com.avinash.old.Enumeration;

import java.util.*;

class EnumerationExample {
	   public static void main(String[] args) {
	      List list = new ArrayList<>(Arrays.asList("Apple", "Cat", "Dog", "Rat"));
	      Vector v = new Vector(list);
	      delete(v, "Dog");
	   }
	   private static void delete(Vector v, String name) {
	      Enumeration e = v.elements();
	      while (e.hasMoreElements()) {
	         String s = (String) e.nextElement();
	         if (s.equals(name)) {
	            v.remove(name);
	         }
	      }
	      // Display the names
	      System.out.println("The names are:");
	      e = v.elements();
	      while (e.hasMoreElements()) {
	         // Prints elements
	         System.out.println(e.nextElement());
	      }
	   }
	}