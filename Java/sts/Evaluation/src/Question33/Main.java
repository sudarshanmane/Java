package Question33;

public class Main {
	
	void  messageToStudents(Evaluation evaluation) {
		
		if(evaluation instanceof CodingEvaluation) {
			
			CodingEvaluation codingEvaluation  = (CodingEvaluation) evaluation;
			System.out.println("Its a Cading Evaluation");
			evaluation.printNoOfQuestions();
			codingEvaluation.evaluationTiming();
		}
		else {
		    DsaEvaluation dsaEvaluation  = (DsaEvaluation) evaluation;
			System.out.println("Its a DSA Evaluation");
			evaluation.printNoOfQuestions();
			dsaEvaluation.evaluationTiming();

		}
		
		
	}
	

	public static void main(String[] args) {
		Main main   = new Main();
		
		main.messageToStudents(new DsaEvaluation(5));
		
		System.out.println("===========================================");
		
		main.messageToStudents(new CodingEvaluation(4));


		
	
	}

}
