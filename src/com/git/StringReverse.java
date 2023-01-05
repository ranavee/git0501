package com.git;

public class StringReverse {
	
//<<<<<<< HEAD
//	
//=======
private void two() {
	System.out.println("two");
}
	private void one() {
		System.out.println("one");
	}
//>>>>>>> 67604889be8db21dc01fbea995f155dcefcc38ec

	public static void main(String[] args) {
		String s = "New Code";
		String out = "";
		String[] split = s.split(" ");
		for (String a : split) {
			String rev = "";
			for (int i = a.length() - 1; i >= 0; i--) {
				rev = rev + a.charAt(i);
			}
			System.out.print(out = rev + " ");
		}
	}
}
