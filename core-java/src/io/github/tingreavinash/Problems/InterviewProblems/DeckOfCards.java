package io.github.tingreavinash.Problems.InterviewProblems;


public class DeckOfCards {

	public static void main(String[] args) {
		
		String[] suits = {"foo","bar","baz"};
		String[] ranks = {"10","11","12","13","14","15","16","17"};
		long k = 9;
		
		String result = solution(suits,ranks,k);
		System.out.println("Result: "+result);
		
	}
	
	/**
	 * 
	 * @param suits suits[]={"foo","bar","baz"}
	 * @param ranks ranks[]={"10","11","12","13","14","15","16","17"}
	 * @param k k=9
	 * @return 11-of-bar
	 */
	public static String solution(String[] suits, String[] ranks, long k) {
		
		int rank_len, suit_no;
		String output;
		suit_no=0;
		rank_len = ranks.length -1;
		
		while(k > rank_len) {
			k = k-rank_len -1;
			suit_no++;
		}
		
		output= ranks[(int) k]+"-of-"+suits[suit_no];
		//System.out.println(ranks[(int) k]+"-of-"+suits[suit_no]);
		
		return output;
	}
}
