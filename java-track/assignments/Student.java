package pset9;


public class Student {
	private String Name;
	private int StudentID;
	private int Credits;
	private double GPA;
	
	public Student(String Name, String LastName, Integer StudentID){
		this.Name = Name;
		this.StudentID = StudentID;
		this.Credits = 0;
		this.GPA = (double) 0;
	}
	
	public String getName(){
		return this.Name;
	}

	public int getStudentID(){
		return this.StudentID;
	}
	public int getCredits(){
		return this.Credits;
	}
	public float getGPA(){
		return (float) this.GPA;
	}
	
	public String getClassStanding(){
		
		//System.out.println(this.Credits);

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
	


	public Object computeTuition() {
		// TODO Auto-generated method stub
		double CreditCost = 1333.33;
		T = CreditCost * Credits;
		return T;
		
		
	}

	public void submitGrade(double g, int c) {
		// TODO Auto-generated method stub
		this.Credits += c;
		double qs = c * g;
		this.GPA = ((this.GPA * this.Credits) + qs) /(Credits + this.Credits);
		this.GPA = (double)(Math.round(this.GPA *1000)) / 1000;
		
	}
/*
	public void submitGrade(double Grade, int Credit){
        double q = Grade * Credit;
        double g = this.Credits + Credit;
        this.GPA =(q +g) / this.Credits;
        this.GPA = (double)(Math.round(this.GPA *1000)) / 1000;
    }
	*/
	
	public void createLegacy(Student s,Student a) {
		// TODO Auto-generated method stub
		
	}

}
