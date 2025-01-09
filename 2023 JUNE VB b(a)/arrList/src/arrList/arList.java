package arrList;

import java.util.ArrayList;
import java.util.Scanner;

public class arList {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter numbers  : ");
		
		
		while(true) {
			int num = scanner.nextInt();
			
			if(num == 0) {
				break;
			}
			al.add(num);
			
		}
		
		for(int i=0; i<al.size(); i++) {
			
			if(al.get(i) % 2 == 0) {
				al.remove(i);
				i--;
			}
			
		}
		System.out.println("Odd Number : "+al);

	}

}


/*This question is based on the Collection Framework and Generics.

a) Write a program that takes input from the user and creates an ArrayList of integers. The
program should then remove all the even numbers from the ArrayList and display only the
odd numbers in the ArrayList.

i) Create an empty ArrayList of integers using the ArrayList class. Then prompt the
user to enter numbers, one at a time, until they enter 0. Each number the user enters
must be added to the ArrayList.         
                                                                 
ii) Once the  user has  entered  all the numbers, remove  any  even numbers  from the
ArrayList.

iii) Display the remaining odd numbers in the ArrayList

Hint:  Refier to the sanple output given below.

Save the project as Question02A */