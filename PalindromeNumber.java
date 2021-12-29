package week1.day2.ass1;

public class PalindromeNumber {

	public static void main(String[] args) {
		int n=454;
		   int temp = n, sum = 0, r;
	        while (n > 0) {
	            r = n % 10; // getting remainder=>454%10=>4
	            sum = (sum * 10) + r; // 0+4=>4, 4*10+5=>45,
	            //sum=1454
	            n = n / 10;//45
	        }
	        if (temp == sum)
	            System.out.println("palindrome number ");
	        else
	            System.out.println("not palindrome");
	    }

	}

