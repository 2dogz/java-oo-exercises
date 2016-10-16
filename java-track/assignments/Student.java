
public class Student {
	private String FirstName;
	private int StudentID;
	private int Credits;
	private double GPA;
	private String LastName;
	
	public Student(String FirstName, String LastName, int StudentID){
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.StudentID = StudentID;
		//this.Credits = 0;
		//this.GPA = (double) 0;

	}
	public String getName(){
		return this.FirstName +' '+ this.LastName; 
	}

	public String getFirstName(){
		return this.FirstName;
	}
	public String getLastName(){
		return this.LastName;
	}
	public int getStudentID(){
		return this.StudentID;
	}
	public int getCredits(){
		return this.Credits;
	}
	public double getGPA(){
		return (double) this.GPA;
	}
	public String getClassStanding(){
		if (this.Credits >= 90){
			return "Senior";
		}else if (this.Credits >= 60 && this.Credits < 90){
			return "Junior";
		}else if (this.Credits >= 30 && this.Credits < 60){
			return  "Sophomore";
		}else {
			return "Freshman";
		}
	}
	public double computeTuition() {
		double CreditCost = this.Credits / 15 * 20000;
		double perCredit = this.Credits % 15 * 1333.33;
		double Tuition = CreditCost + perCredit; 
			return Tuition;
       }	
	public double submitGrade(double g, int c) {
		
		double qs = c * g;
		double st = this.GPA * this.Credits;
		this.Credits += c;
		this.GPA = (st + qs) / this.Credits;
		this.GPA = (double)(Math.round(this.GPA *1000)) / 1000;
		return this.GPA;
	}	
	public Student createLegacy(Student s,Student a) {
		int newID = s.getStudentID() + a.getStudentID();
		String mom = s.getName();
		String dad = a.getName();
		Student kid = new Student(mom, dad, newID);
		kid.GPA = (s.getGPA() + a.getGPA()) / 2;
		int dadCredits = a.getCredits();
		int momCredits = s.getCredits();
		if(dadCredits > momCredits){
			kid.Credits = dadCredits;
		}
		else {
			kid.Credits = momCredits;
		}
		return kid;
		
	}
	
	public String toString(){
		return ( this.FirstName + " " + this.LastName + " " + this.StudentID);
	}
	






}
