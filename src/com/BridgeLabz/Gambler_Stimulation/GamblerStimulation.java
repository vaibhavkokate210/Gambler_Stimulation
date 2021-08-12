package com.BridgeLabz.Gambler_Stimulation;

public class GamblerStimulation 
{
	public static int Stake=100;
	public static int Bet=1;
	public static String WinOrLoss(int Bet)
	{
		double random=Math.random();
		if(random>0.5)
		{
			Stake+=Bet;
			return "Winning";
		}
		else
		{
			Stake-=Bet;
			return "Lossing";
		}
	}
	public static void main(String[] args)
	{
		String result = WinOrLoss(Bet);
		System.out.println("Gambler is "+result+" "+Bet+" $");
	}

}
