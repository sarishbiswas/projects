package com.cognizant.spring_demo.reftypes;

public class Student {
	private Scores score;

	public Scores getScore() {
		return score;
	}

	public void setScore(Scores score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [score=" + score.getMats()+" "+score.getPhysics()+" " +score.getChemistry()+ "]";
	}
	
	
}
