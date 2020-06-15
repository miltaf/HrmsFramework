package com.hrms.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AnnotationsDemo {
	
		@Test 
		public void methodOne() {
			String expectedTitle="hrms";
			String actualTitle="HRMS";
	
			boolean flag=true;
			boolean flag1=false;
			
			if (expectedTitle.equals(actualTitle)) {
				Assert.assertTrue(flag);
				}else {
					Assert.assertTrue(flag1, expectedTitle);
				}

	}

}
