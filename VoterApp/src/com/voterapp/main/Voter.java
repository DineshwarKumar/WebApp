package com.voterapp.main;

import java.util.Scanner;

import com.voterapp.exception.InValidVoterException;
import com.voterapp.service.ElectionBoothImpl;
import com.voterapp.service.IElectionBooth;

public class Voter {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Age ");
		int age=scanner.nextInt();
		System.out.println("Enter Locality");
		String locality=scanner.next();
		System.out.println("Enter VoterId Number");
		int voterId=scanner.nextInt();
		
		IElectionBooth electionBooth=new ElectionBoothImpl();
		
		try {
			boolean result=electionBooth.checkEligibility(age, locality, voterId);
			if(result)
				System.out.println("Your Eligible");
			else
				System.out.println("Your not Eligible");
		} catch (InValidVoterException e) {
			System.out.println(e);
		}
		scanner.close();
	}

}
