package com.hr.maven;

/**
 *@Name : MakeFriend
 *@Author : LH
 *@Date : 2018年4月25日下午6:37:45
 *@Version : V1.0
 * @Description:
 */
public class MakeFriend {

	public String MakeFriend(String name) {
		
		 HelloFriend friend = new HelloFriend();
		 friend.sayHelloToFriend("Wangwu");
		 String str = "Hey," + friend.getMyName()+" make a friend please.";
	     System.out.println(str);
	   
	      return str;
	}
}
