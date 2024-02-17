package DataDrivenTestingDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DataDrivenTestingExample {

	public static void main(String[]args) {
		
		XSSFWorkbook ExcelWBook = null;
		XSSFSheet ExcelWSheet;
		//XSSFRow Row;
		//XSSFCell Cell;
		
		//create an object of File class to open file

		File excelFile = new File("C:\\Users\\Shashikant\\OneDrive\\Desktop\\ExcelFiles\\TestDataFile.xlsx");
		
		
		
		FileInputStream inputStream = null ;
		
		//create an object of FileInputStread to read data from file
		
		try {
			 inputStream = new FileInputStream(excelFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		try {
			ExcelWBook = new XSSFWorkbook(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
			
			//to access workbook sheet
			ExcelWSheet = ExcelWBook.getSheetAt(0);
			
			//get total row count
			int ttlRows = ExcelWSheet.getLastRowNum() + 1; 
				
			//get total number of cells in a row
			int ttlCells = ExcelWSheet.getRow(0).getLastCellNum() ;
			
			
			for (int currentRow = 1 ; currentRow<ttlRows ; currentRow++ ) {          //to read the rows
				
				//Launch the browser 
				WebDriverManager.chromedriver().getDownloadedDriverVersion();
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.saucedemo.com/");
				
				//enter user name
				driver.findElement(By.id("user-name")).sendKeys(ExcelWSheet.getRow(currentRow).getCell(0).toString());
			
				//enter password
				driver.findElement(By.id("password")).sendKeys(ExcelWSheet.getRow(currentRow).getCell(1).toString());

				//click on login button
				driver.findElement(By.id("login-button")).click();

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				/*
				 * for(int currentCell = 0 ; currentCell<ttlCells ; currentCell++) //to read the
				 * cells {
				 * System.out.print(ExcelWSheet.getRow(currentRow).getCell(currentCell).toString
				 * ());
				 * 
				 * System.out.print("\t"); } 
				 * System.out.println();
				 */
				
				driver.quit();
			}
			
		try {
			ExcelWBook.close();
		} catch (IOException e) {
		e.printStackTrace();
		}
	}
}
	
	