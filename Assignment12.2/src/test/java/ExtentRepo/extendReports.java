package ExtentRepo;



import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Utils.utils;

public class extendReports {

	public static ExtentReports report;

	@BeforeSuite
	public static ExtentReports getReport() {
		String reportpath = System.getProperty("user.dir") + "\\extendreports\\API_Report_"+utils.getCurrentDateTime()+".html";
		ExtentHtmlReporter assginment = new ExtentHtmlReporter(reportpath);
		assginment.config().setReportName("Assignment-12.2");
        
		report = new ExtentReports();
		report.attachReporter(assginment);
		
		return report;
		
	}
}