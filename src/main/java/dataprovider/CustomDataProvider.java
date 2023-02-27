package dataprovider;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {

	@DataProvider(name = "Logindetails")
	public static Object[][] getData() {
		Object[][] arr = Excelreadercorrect.getDataFromSheet("Sheet2");
		return arr;
	}

	/*
	 * @DataProvider(name="LoginDataSet") public static Object[][] getData1() {
	 * Object[][]arr=ExcelReader.getDataFromSheet("Login"); return arr; }
	 * 
	 */

}
