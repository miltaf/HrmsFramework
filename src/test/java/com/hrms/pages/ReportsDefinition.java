package com.hrms.pages;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.Constants;
import com.hrms.utils.ExcelUtility;

public class ReportsDefinition extends CommonMethods{

	@Test(groups="regression", dataProvider = "getDataExcel")
	
	public void DefiningReport(String reportName, String selection, String selected, String fieldgroup, String displayfields) {
		test.info("Entering Valid Admin credentials");
		login.login();
		
		test.info("navigating to reports");
		dashboard.navigateToReports();
		
		test.info("defining 3 reports");
		reports.addReports.click();
		reports.reportName.sendKeys(reportName);
		
		selectDdValue(reports.selectioncriteria, selection);
		selectDdValue(reports.selectedcriteriainclude,selected);
		
		wait(3);
		selectDdValue(reports.displayFGgroups, fieldgroup);
		selectDdValue(reports.displayFields, displayfields);
		
		reports.addDisplayField.click();
		reports.btnsave.click();
		scrollDown(250);
			
	}
	
	@DataProvider
	public Object[][] getDataExcel(){
		return ExcelUtility.excelToArray(Constants.TESTDATA_FILEPATH, "Sheet5");
	}
}
