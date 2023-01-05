package com.git;

public class StringReverse {
	
	private void one() {
		System.out.println("one");
	}

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
