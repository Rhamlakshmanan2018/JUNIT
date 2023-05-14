package org.junitsuit;

import java.lang.constant.Constable;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.suwite.Baseclass;
import org.suwite.fblogin;

public class sample extends Baseclass {
	@Test
	public void tc1() throws InterruptedException {
		System.out.println("Test case 1");
		launchurl("https://en-gb.facebook.com/");
		String title = Pagetitle();
		String url = Pageurl();
		fblogin f = new fblogin();
		Passtext("rhamlakshmanan@gmail.com",f.getEmail());
		Assert.assertTrue("to check title",title.contains("facebbok")); 
		Passtext("12345", f.getPassword());
	}

	@Before
	public void startdate() {
		Date d = new Date();
		System.out.println(d);
	}

	@Test
	@Ignore
	public void tc2() {
		System.out.println("Test case 2");
	}

	@After
	public void enddate() {
		Date d = new Date();
		System.out.println(d);

	}

	@Test
	public void tc3() {
		System.out.println("Test case 3");
	}

	@BeforeClass
	public static void launch_Browser() {
		launchBrowser();
		windowmaximize();
	}

	@AfterClass
	public static void EndtheBrowser() {
		//closeEntireBrowse();
	}

	@Test
	public void tc4()  {
		System.out.println("Test case 4");
		launchurl("https://www.flipkart.com/");
	}

	@Test
	public void tc5() {
		System.out.println("Test case 2");
		launchurl("https://www.amazon.com/");
	}
}