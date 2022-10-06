package Question33;

public abstract class Evaluation {
	
	private final int numberOfQuestions;
	
	public Evaluation(int number) {
		this.numberOfQuestions = number;
	}
	
	
	abstract void evaluationTiming();
	
	void printNoOfQuestions() {
		
	System.out.println("No. of Questions in Evaluation is :" + this.numberOfQuestions);
	}


}
