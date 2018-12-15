package Selenium;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;

public class CsvExporter {
	
	ArrayList<String> Arrays = new ArrayList<String>();
	
	String TestStepStatus;
	
	String TestStatus[] = new String[100]; 
	
	ChromeDriver cdriver = new ChromeDriver();
	
	Arrays.add(TestStatus, TestStepStatus);

    void SetUpCSV() throws FileNotFoundException{
    	
    String[] TestStepsRowsArray = {"T01_FO01001", "T02_OP0301", "T03_OP0601", "T04_OP0901", "T05_CD00078", "T06_OC0101", "T09_OC0101", "T15_IP01001", "T15a_IP01005", "T15b_IP01005", "T16_IP07001", "T17_CD00029", "T21_TH0301", "T24_TH0699", "T25_TH0603", "T26_TH0717", "T27_TH0903", "T28_IP07005", "T29_OP0601", "T33_CD00149", "T34_OP1108", "T35_BP0101"};
    String[] TestStepsColumnsArray = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
    
    PrintWriter pw = new PrintWriter(new File("/Users/Grant/eclipse-workspace/SeleniumPractice/csv/CSVExportFile.csv"));
    StringBuilder sb = new StringBuilder();

    for (String TestStepRows : TestStepsRowsArray) {
    	sb.append('\n');
    	sb.append(TestStepRows);
    }

    for (String TestStepColumns : TestStepsColumnsArray) {
    	
    	sb.append(',');
        sb.append(TestStepColumns);
    }
    
    
    
    
    
    
    
    
    
    
    
    pw.write(sb.toString());
    pw.flush();
    pw.close();
    }

    void SendTestStepResults(String flag) throws FileNotFoundException {

     PrintWriter pw = new PrintWriter(new File("/Users/Grant/eclipse-workspace/SeleniumPractice/csv/CSVExportFile.csv"));
     StringBuilder sb = new StringBuilder();
     
     if (flag == "T01_FO01001") {

         int x = 1;
         while (x > 0) {
                sb.append('\n');
                x--;
         }
    }

    else if (flag == "T02_OP0301") {

         int x = 2;
         while (x > 0) {
                sb.append('\n');
                x--;
         }
    }

    else if (flag == "T03_OP0601") {

         int x = 3;
         while (x > 0) {
                sb.append('\n');
                x--;
         }
    }

    else if (flag == "T04_OP0901") {

         int x = 4;
         while (x > 0) {
                sb.append('\n');
                x--;
         }
    }

    else if (flag == "T05_CD00078") {

         int x = 5;
         while (x > 0) {
                sb.append('\n');
                x--;
         }
    }

    else if (flag == "T06_OC0101") {
   	 
         int x = 6;
         while (x > 0) {
                sb.append('\n');
                x--;
         }
    }

    else if (flag == "T09_OC0101") {

         int x = 7;
         while (x > 0) {
                sb.append('\n');
                x--;
         }
    }

    else if (flag == "T15_IP01001") {

         int x = 8;
         while (x > 0) {
                sb.append('\n');
                x--;
         }
    }

    else if (flag == "T15a_IP01005") {

         int x = 9;
         while (x > 0) {
                sb.append('\n');
                x--;
         }
    }

    else if (flag == "T15b_IP01005") {

         int x = 10;
         while (x > 0) {
                sb.append('\n');
                x--;
         }
    }

    else if (flag == "T16_IP07001") {

         int x = 11;
         while (x > 0) {
                sb.append('\n');
                x--;
         }
    }

    else if (flag == "T17_CD00029") {
         int x = 12;
         while (x > 0) {
                sb.append('\n');
                x--;
         }
    }

    else if (flag == "T21_TH0301") {

         int x = 13;
         while (x > 0) {
                sb.append('\n');
                x--;
         }
    }

    else if (flag == "T24_TH0699") {
   	 
         int x = 14;
         while (x > 0) {
                sb.append('\n');
                x--;
         }
    }

    else if (flag == "T25_TH0603") {

         int x = 15;
         while (x > 0) {
                sb.append('\n');
                x--;
         }
    }

    else if (flag == "T26_TH0717") {

         int x = 16;
         while (x > 0) {
                sb.append('\n');
                x--;
         }
    }

    else if (flag == "T27_TH0903") {

         int x = 17;
         while (x > 0) {
                sb.append('\n');
                x--;
         }
    }

    else if (flag == "T28_IP07005") {

         int x = 18;
         while (x > 0) {
                sb.append('\n');
                x--;
         }
    }

    else if (flag == "T29_OP0601") {

         int x = 19;
         while (x > 0) {
                sb.append('\n');
                x--;
         }
    }

    else if (flag == "T33_CD00149") {

         int x = 20;
         while (x > 0) {
                sb.append('\n');
                x--;
         }
    }

    else if (flag == "T34_OP1108") {

         int x = 21;
         while (x > 0) {
                sb.append('\n');
                x--;
         }
    }

    else if (flag == "T35_BP0101") {

         int x = 22;
         while (x > 0) {
                sb.append('\n');
                x--;
         }
    }

     sb.append(',');
     sb.append(TestStepStatusID);
     pw.write(sb.toString());
     System.out.println(TestStepStatusID + " " + "Successfully exported");
     pw.flush();
     pw.close();
	}
	
}
