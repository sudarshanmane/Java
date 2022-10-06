package Question3;

public class Main {
	
	void messageToStudents(Evaluation evaluation) {
		
		if(evaluation instanceof DsaEvaluation) {
			System.err.println("No. of Questio in Evaluation is :" + evaluation.getNumberOfQuestions());

			System.out.println("Its a DSA Evaluation");
			
			DsaEvaluation obj = (DsaEvaluation) evaluation;
			obj.evaluationTiming();
		}else {
			System.out.println("======================================");
			System.out.println("Its a Coding Evaluation");
			System.err.println("No. of Questio in Evaluation is :" + evaluation.getNumberOfQuestions());
			CodingEvaluation obj = (CodingEvaluation) evaluation;
			obj.evaluationTiming();
		}
		
	}


	public static void main(String[] args) {
		
		Main  main = new Main();
		main.messageToStudents(new DsaEvaluation(5));
		main.messageToStudents(new CodingEvaluation(4));

		

	}

}
