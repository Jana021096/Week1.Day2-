package week1.day3;

public class palindrome {

	public static void main(String[] args) {
		int a=121;
		int b=12345;
	
		checkPalindrome(b);
		checkPalindrome(a);
	}
	
	 public static void checkPalindrome(int num) {
	        int original = num;
	        int reversed = 0;

	        for (int i = num; i > 0; i /= 10)
	        {
	            int rem = i % 10;
	            reversed = reversed * 10 + rem;
	        }

	        if (original == reversed)
	        {
	            System.out.println(original +"->"+ "It is a Palindrome");
	        } else {
	            System.out.println(original +"->"+ "It is not a Palindrome");
	        }
	    }
}
