package Test;


import org.testng.annotations.Test;
import Base.initializeBase;
import ExtentRepo.extendReports;


public class getPostRequestTest extends extendReports {

	@Test
	public void test1() {
		report.createTest("Test1");
		initializeBase.getMethod();
	
	}

	@Test
	public void test2() {
		report.createTest("Test2");
		initializeBase.getQueryMethod();
	}

	@Test
	public void test3() {
		report.createTest("Test3");
		initializeBase.postMethod();		
		report.flush();
	}
		
}
