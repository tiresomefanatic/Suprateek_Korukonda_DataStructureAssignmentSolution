package com.driverQ1;

import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

import com.service.Services;

class Driver {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the total no of floors in the building");
		
		int noOfFloor = sc.nextInt();

	    int[] floors = new int[noOfFloor];
		
	   
		for(int i=0; i<noOfFloor; i++)  
		{  
		System.out.println("enter the floor size given on day : "+(i+1));
		floors[i] = sc.nextInt(); 
		}  
		System.out.println();
		
		Services service = new Services();
		service.printConstructionTable(floors, noOfFloor);
	}
}