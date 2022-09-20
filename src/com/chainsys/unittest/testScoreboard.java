package com.chainsys.unittest;

import com.chainsys.classandmethods.TtwentyScoreboard;

public class testScoreboard {
	public static void testRCBMatch() {
		TtwentyScoreboard sb=new TtwentyScoreboard(129);
		System.out.println("Target:"+sb.getTarget());
		System.out.println("Max Overs:"+TtwentyScoreboard.max_overs);
		sb.setCurrentScore(86);
		sb.setCompleted_overs(10);
		System.out.println("CurrentScore:"+sb.getCurrentScore());
		System.out.println("Overs completed:"+sb.getCompleted_overs());
		System.out.println("CurrentRR:"+sb.getRunRate());
		System.out.println("RequiredRR:"+sb.getRequiredRunrate());
		}

}
