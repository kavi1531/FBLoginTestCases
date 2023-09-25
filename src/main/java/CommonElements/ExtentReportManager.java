package CommonElements;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportManager {

    public static ExtentReports extent;
    public static ExtentHtmlReporter htmlReporter;

    public static ExtentReports getInstance() {
        if (extent == null) {
            extent = new ExtentReports();
            htmlReporter = new ExtentHtmlReporter("C:\\Users\\16124\\IdeaProjects\\Facebook\\FBExtentreport.html");
            extent.attachReporter(htmlReporter);
        }
        return extent;
    }
}
