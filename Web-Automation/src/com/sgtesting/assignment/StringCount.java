package com.sgtesting.assignment;

public class StringCount {
public static void main(String[] args) {
	String str = "NaveenAutomationLabs";
	//1
	
	int count = 0;
	for (int i=0; i<str.length(); i++) {
		if (str.charAt(i) >='A' && str.charAt(i)<='Z') {
			count++;
		
	}
}

System.out.println(count);

int count1 = 0;
for (int i=0; i<str.length(); i++) {
	if (str.charAt(i) >=65 && str.charAt(i)<=90) {
		count1++;
	
}
}
System.out.println(count1);

int count2 = 0;
for (int i=0; i<str.length(); i++) {
	if (Character.isUpperCase(str.charAt(i))) {
		count2++;
	
}
}
System.out.println(count2);

}
}
