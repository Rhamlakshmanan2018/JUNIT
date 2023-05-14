package org.junitsuit;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

//import org.junit.runner.RunWith;
//import org.junit.runners.Suite;
//import org.junit.runners.Suite.SuiteClasses;

//@RunWith(Suite.class)
//@SuiteClasses({B.class,sample.class,A.class})

public class Runnerclass {
@Test
public void tc() {
	Result rc = JUnitCore.runClasses(B.class,sample.class,A.class);
	System.out.println("Total test cast run time:"+rc.getRunCount());
System.out.println("Total test case run time:"+rc.getRunTime());
System.out.println("Total test case failed count:"+rc.getFailureCount());
System.out.println("Total Ignore test case count:"+rc.getIgnoreCount());
List<Failure> f = rc.getFailures();
for (Failure failes : f) {
	System.out.println(failes);
}
}

}
