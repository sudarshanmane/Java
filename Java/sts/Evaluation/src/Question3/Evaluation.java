package Question3;

public abstract class Evaluation {
	
	private final int numberOfQuestions ;
	
	Evaluation(int number){
		
		this.numberOfQuestions  =  number;
		
	}
	
	
	
	
	public int getNumberOfQuestions() {
		return numberOfQuestions;
	}

	abstract void evaluationTiming();
	
	void printNoOfQuestions() {
	System.out.println("No. of Questions in Evaluation is :" +numberOfQuestions);
	}

	
	

}
