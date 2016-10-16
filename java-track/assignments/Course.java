
public class Course {
	private String Name;
	private int Credits;
	private int EmptySeats;
	private Student[] Roster;
	
	
	public Course(String Name, int EmptySeats, int NumStudents){
		this.Name = Name;
		this.EmptySeats = EmptySeats;
		this.Credits = 0;
		this.Roster = new Student[EmptySeats];
				
	}
	
	public String getName(){
		return this.Name;
	}
	public int getCredits(){
		return this.Credits;
	}
	public int getRemainingSeats(){
		return this.EmptySeats;
	}
	public Student[] getRoster() {
		return this.Roster;
	}
	 
	public boolean addStudent(Student s2) {
		//check if there is room
		if(getRemainingSeats() == 0){
			return false;
		}
		//make sure student is not enrolled already
		for (int i = 0; i < Roster.length; i++);
			if (Roster.equals(s2.getName())){
				return false;
			}
		//update seats
		Roster[Roster.length - this.EmptySeats] = s2;
		this.EmptySeats -= 1;
			return true;
		}
	public double averageGPA(){
		
		//Initialize gpasum
		double gpasum = 0.00;
		//find out how many students in course + omit EmptySeats
		int students = this.Roster.length - this.EmptySeats;
		//add all gpas together
		for (int i = 0;i < students; i++){
			gpasum += this.Roster[i].getGPA();
		}
		//Divide all gpas by num of students to get avg
		double avgGPA = gpasum / students;
		return avgGPA;	
	}			
	public String toString(){
		return "Course Name : " + this.Name +"Course Credits : " + " " + this.Credits +"Empty Seats : " + " " + this.EmptySeats;
	}

}
