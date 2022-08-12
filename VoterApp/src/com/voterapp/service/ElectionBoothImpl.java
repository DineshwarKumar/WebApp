package com.voterapp.service;

import com.voterapp.exception.InValidVoterException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NoVoterIdException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothImpl implements IElectionBooth {

	
	String[] locatities= {"VVPuram","Shivajinagar","KRPuram","Hebbal","Nagavara"};
	@Override
	public boolean checkEligibility(int age, String locality, int voterId) throws InValidVoterException  {
		
		try {
			checkAge(age);
			checkLocality(locality);
			checkVoterId(voterId);
		} catch (InValidVoterException e) {
			throw e;
		}
		
		
		
		return true;
	}
	
	private boolean checkAge(int age) throws UnderAgeException
	{
		if(age<18) {
			throw new UnderAgeException("Age below 18");
		}
		return true;
	}
	private boolean checkLocality(String lo) throws LocalityNotFoundException
	{
		for(String locality:locatities)
		{
			if(locality.equalsIgnoreCase(lo))
			{
				return true;
			}
		}
		throw new LocalityNotFoundException("Locality not found");
	}
	private boolean checkVoterId(int voterId) throws NoVoterIdException
	{
		if(voterId<=1000 && voterId<=9999)
		{
			throw new NoVoterIdException("Invalid Voter Id");
		}
		else
		{
			return true;
		}
	}

}
