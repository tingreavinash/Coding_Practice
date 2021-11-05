package io.github.tingreavinash.java_concepts.InterviewProblems;

public class MealCost {

	public static void main(String[] args) {
		solve(12.00,20,8);
	}
	
	public static void solve(double meal_cost, int tip_percent, int tax_percent) {
		
		double totalCost;
		
		double tip_amount = meal_cost*((double)tip_percent/100.0);
		double tax_amount =meal_cost*((double)tax_percent/100.0) ;
		
		if (tip_percent ==0)		tip_amount =0;
		if (tax_percent ==0) tax_amount = 0;
		
		totalCost = meal_cost +tip_amount+tax_amount;
		
		System.out.println((Math.round(totalCost)));

    }

}
