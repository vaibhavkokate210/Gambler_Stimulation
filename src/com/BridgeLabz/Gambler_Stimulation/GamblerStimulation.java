package com.BridgeLabz.Gambler_Stimulation;

public class GamblerStimulation 
{
	public static int stake=100;
	public static int bet=1;
	public static int totalAmount=0;
	
	public static String WinOrLoss()
	{
		double random=Math.random();
		if(random>0.5)
		{
			return "Winning";
		}
		else
		{
			return "Lossing";
		}
	}
	public static void ResignDay(int i)
	{
		int initialStackOfDay=stake;
	    double FIFTY_PERCENT_LOSS=stake*0.5;
	    double FIFTY_PERCENT_GAIN=stake*1.5;
		while(stake>(FIFTY_PERCENT_LOSS) && stake<(FIFTY_PERCENT_GAIN))
		{
			
			if(WinOrLoss()=="Winning")
			{
				stake+=bet;
		
			}
			else
			{
				stake-=bet;
			
			}
		}
		if(initialStackOfDay<stake)
		{
			int win=stake-initialStackOfDay;
			System.out.println("Day "+i+" win = "+win);
		}
		else
		{
			int loss=initialStackOfDay-stake;
			System.out.println("Day "+i+" loss = "+loss);
		}
		
	}
	public static void DayAmountWinOrLoss()
	{
		for(int i=0;i<20;i++)
			ResignDay(i+1);
		
	}
	public static void main(String[] args)
	{
		DayAmountWinOrLoss();
		if(stake>100)
			System.out.println("Gambler win and total amount = " +stake);
		else
			System.out.println("Gambler loss and total amount ="+stake);
	}

}
