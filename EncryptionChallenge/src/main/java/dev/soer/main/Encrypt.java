package dev.soer.main;

import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if(c >= 'a' && c <= 'm') {
				c += 13;
				sb.append(c);
			}
			else if(c >= 'A' && c <= 'M') {
				c += 13;
				sb.append(c);
			}
			else if(c >= 'n' && c <= 'z') {
				c -= 13;
				sb.append(c);
			}
			else if(c >= 'N' && c <= 'Z') {
				c -= 13;
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
	}
}
