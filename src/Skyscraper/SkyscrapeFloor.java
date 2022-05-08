package Skyscraper;

import java.util.Scanner;
import java.util.Stack;

import java.lang.Integer;

public class SkyscrapeFloor {

	 private static int i;

	 int floor;
	 int temp = floor;
	 
	 
	 public static void main(String[] args) {
		 
		 Scanner scan = new Scanner(System.in);
		 
		 Stack<Integer> stack = new Stack<>();
		 
		 System.out.println("enter the total no of floors in the building");
		 
		 int n = scan.nextInt();
		 constructedFloors( scan, stack, n ); 
				
		 	 
	 }
	
	private static void constructedFloors(Scanner scan, Stack<Integer> stack, int n ) {
		
		int floor = n;
		for (int i = 1; i<= n; i++) {
			
			System.out.println("enter the floor size given on day : "+ i);
			
			int floorSize = scan.nextInt();
			stack.push(floorSize);
			if (floorSize == floor) {
				
				while(!stack.isEmpty()) {
					
					Integer poppedVal = stack.pop();
					
					if(poppedVal == floor) {
						
						System.out.println("Day: " + i);
						
						System.out.println(poppedVal);
						
						floor--;
			}
			
					else {
						 
						stack.push(poppedVal);
						break;
					}	
				}
			}
			
			else {
				
				System.out.println("Day : " + i);
				System.out.println(" ");
				
			}
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
