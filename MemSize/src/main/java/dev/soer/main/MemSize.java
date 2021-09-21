package dev.soer.main;

import java.util.Scanner;

public class MemSize {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		StringBuilder sb = new StringBuilder();
		
		StringBuilder val = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i))) {
				sb.append(input.charAt(i));
			}
			else if(Character.isLetter(input.charAt(i))){
				if (input.charAt(i) == 'G') {
					val.append("GB");
				}
				else if(input.charAt(i) == 'M') {
					val.append("MB");
				}
			}
		}

		double ms = Double.parseDouble(sb.toString()) * .93;
		if(ms > 1) {
			System.out.println(ms + val.toString());
		}
		else {
			System.out.println(ms * 1000 + "MB");
		}
	}
	
}
