package com.BridgeLabz.Gambler_Stimulation;

public class GamblerStimulation 
{
	public static final int Stake=100;
	public static final int Bet=1;
	public static String WinOrLoss()
	{
		double Random=Math.random();
		if(Random>0.5)
			return "Winning";
		else
			return "Lossing";
	}
	public static void main(String[] args)
	{
		String Result = WinOrLoss();
		System.out.println("Gambler is "+Result);
	}

}
