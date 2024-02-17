package BasicLearning_TestNG;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderWithExcel {

	WebDriver driver;

	@BeforeMethod
	public void setup() {

		WebDriverManager.chromedriver().getDownloadedDriverVersion();
		driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

	}	


	@Test(dataProvider = "searchDataProvider")
	public void searchKeyWord(String keyword) {
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys(keyword);
		searchbox.sendKeys(Keys.ENTER);
	}

	@DataProvider(name = "searchDataProvider")
	public Object[][] searchDataProviderMethod() {

		//String fileName = "C:\\Users\\Shashikant\\OneDrive\\Desktop\\ExcelFiles\\SearchData.xlsx";
		String fileName = "C:\\Users\\Shashikant\\OneDrive\\Desktop\\ExcelFiles\\kbook.xlsx";


		Object[][] SearchData = getExcelData( fileName  ,"Sheet1");

		/*
		 * Object[][] SearchData = new Object[2][1]; //2 rows & 1 coloumn
		 * SearchData[0][0] = "Taj Mahal" ; //row =1 , col=1 
		 * SearchData[1][0] =  "India Gate" ; //row=2, col=1
		 */		
		return SearchData; 
	}


	public String [][] getExcelData(String fileName, String sheetName) {

		//declare array
		String[][] data = null;

		//open file in read open
		try {
			FileInputStream inputStream = new FileInputStream(fileName);

			//create XSSFWorkBook Class object for Excel File
			XSSFWorkbook workBook = new XSSFWorkbook(inputStream);
			XSSFSheet excelSheet = workBook.getSheet(sheetName);

			//get total no. of rows
			int ttlRows = 	excelSheet.getLastRowNum() + 1 ;

			//get totoal no of cells
			int ttlCells = excelSheet.getRow(0).getLastCellNum();

			//initialize array
			data = new String[ttlRows-1][ttlCells];


			for (int currentRow = 1 ; currentRow<ttlRows ; currentRow++) {

				for(int currentCell = 0 ; currentCell<ttlCells ; currentCell++  ) {

					data[currentRow-1][currentCell] = excelSheet.getRow(currentRow).getCell(currentCell).getStringCellValue();
				}

			}

			workBook.close();


		} catch(Exception e) { e.printStackTrace(); }

		return data;
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
