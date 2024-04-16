package variableTypes;

public class Candidate {
	
	//below are instance variables. They are also known as "non-static" variables.
		int candidateNo;
		String candidateName;
		static String recruiter = "A1 Recruitment Pvt. Ltd.";

		public void displayCandidateDetails() {
			
			System.out.println("Candidate details are as follows: ");
			System.out.println("Candidate Number: " + candidateNo);
			System.out.println("Candidate Name: " + candidateName);
			System.out.println("Recruiter Name is: " + recruiter);
			System.out.println();
		}
		
		public static void myMethod() {
			System.out.println("This method is a static method which is at the class level......");
		}
		
		public static void main(String[] args)
		{
			Candidate can1 = new Candidate();
			can1.candidateNo = 101;
			can1.candidateName = "Robert";
			can1.displayCandidateDetails();
			
			Candidate can2 = new Candidate();			
			can2.candidateNo = 78;
			can2.candidateName = "David";
			can2.displayCandidateDetails();
			
			recruiter = "Professional Recruiters";
			can1.displayCandidateDetails();
			can2.displayCandidateDetails();
			recruiter = "Best Recruiters";
			can1.displayCandidateDetails();
			can2.displayCandidateDetails();
			
			myMethod();
		}
}