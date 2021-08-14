package com.BridgeLabz.Gambler_Stimulation;

public class GamblerStimulation 
{
	public static int stake=100;
	public static int bet=1;
	public static int initStake=stake;
    public static final double FIFTY_PERCENT_LOSS=initStake*0.5;
    public static final double FIFTY_PERCENT_GAIN=stake*1.5;
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
	public static void ResignDay()
	{ 
		
		while(stake>(FIFTY_PERCENT_LOSS)&&stake<(FIFTY_PERCENT_GAIN))
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
		
	}
	
	public static void main(String[] args)
	{
		ResignDay();
		if(stake<100)
			System.out.println("Gambler loss and total amount = " +stake);
		else
			System.out.println("Gambler win and total amount ="+stake);
	}

}
