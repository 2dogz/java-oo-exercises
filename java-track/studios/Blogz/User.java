package Blogz;
import java.util.regex.*;
import java.util.ArrayList;


public class User {
	private static ArrayList<User> users = new ArrayList<>();
	private String username;
	private String hashPass;
	
	//constructor
	public User(String username, String password) {
		this.username = username;
		this.hashPass = hashPassword(password);
		if (this.username)
		
	}
	//get
	
	public String getUsername(){
		return this.username;
	}
	public String getPassword(){
		return this.password;
	}
	//methods
	private static String hashPassword(String password){
		return password;
	}
	public boolean isValidUsername (String username){
		String patternmatch = "[a-zA-Z][a-zA-Z0-9_-]{4,11}";
		boolean x = Pattern.matches(patternmatch, username);
		return x;
	}
	public boolean isValidPassword (String password) {
		if (this.hashPass == password){
			return true;
		}else return false;
	}

	//ends user
}
