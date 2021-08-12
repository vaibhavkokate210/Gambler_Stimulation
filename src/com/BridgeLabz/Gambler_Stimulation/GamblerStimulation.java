package com.BridgeLabz.Gambler_Stimulation;

public class GamblerStimulation 
{
	public static int stake=100;
	public static int bet=1;
	public static String WinOrLoss(int bet)
	{
		double random=Math.random();
		if(random>0.5)
		{
			stake+=bet;
			return "Winning";
		}
		else
		{
			stake-=bet;
			return "Lossing";
		}
	}
	public static void main(String[] args)
	{
		//String result = WinOrLoss(bet);
		//System.out.println("Gambler is "+result+" "+bet+" $");
		int initStake=stake;
		while(stake>(initStake*0.5)&&stake<(initStake*1.5))
		{
			double random=Math.random();
			if(random>0.5)
			{
				stake+=bet;
			}
			else
			{
				stake-=bet;
			}
		}
		if(stake>(initStake*0.5))
		{
			System.out.println("Gambler loss 50%");
		}
		else
			System.out.println("Gambler gain 50%");
	}

}
