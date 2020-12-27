package com.revature.eval.java.core;

//import com.revature.eval.java.core.EvaluationService;

public class EvaluateDis {
	private static EvaluationService evaluationService = new EvaluationService();
	
	public static void main(String[] args) {
		
		String newe = evaluationService.reverse("robot");
		System.out.println(newe);
	}

}
