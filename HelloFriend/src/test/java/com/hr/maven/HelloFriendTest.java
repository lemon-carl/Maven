package com.hr.maven;

import static junit.framework.Assert.*;

import org.junit.Test;

import com.hr.maven.Hello;

public class HelloFriendTest {

     
	 @Test
	 public void testHelloFriend(){
	           
			  HelloFriend helloFriend = new HelloFriend();
			  String results = helloFriend.sayHelloToFriend("CarlLing");
	          assertEquals("Hello CarlLing! I am John",results);
	 }

}