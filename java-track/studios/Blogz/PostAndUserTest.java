package Blogz;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

public class PostAndUserTest {
	public Date created;
	User kw = new User("kyle","password123");
	Post n = new Post("newpost","test", created);
}
	

	@Test
	public void testUserName(){
		assertEquals(kw.getUsername(),"kyle");
	}
	