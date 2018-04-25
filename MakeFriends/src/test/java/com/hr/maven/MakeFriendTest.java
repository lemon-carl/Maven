package com.hr.maven;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 *@Name : MakeFriendTest
 *@Author : LH
 *@Date : 2018年4月25日下午6:39:15
 *@Version : V1.0
 * @Description:
 */
public class MakeFriendTest {
 
	  @Test
	  public void testMakeFriend() {
		   MakeFriend makeFriend = new MakeFriend();
		   String str = makeFriend.MakeFriend("wangwu");
		   assertEquals("Hey,John make a friend please.",str);
	  }
}
