package com.dhyanyog.common;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;


@Listeners(IInvokedListnerimpl.class)
public class BaseSelenium {
	
	
	@DataProvider(name="loginData")
	public String [][] getArray(){ 
	String [][] loginData= {{"admin","admin"},{"admin111","admin111"}};
	
	return loginData;
	}
	
	@DataProvider(name="loginDataFromCsv")
public String [][] getDataFromCsv()  {
	String csvFile = "C:\\selenium\\temp.csv";
	BufferedReader br = null;
	String line = "";
	String cvsSplitBy = ";";
	String[][] loginData=new String [2][2];
	int i=0;
		
		try {
				
				FileReader fr = new FileReader(csvFile);
				br = new BufferedReader(fr);
				while((line = br.readLine()) != null )
				{
					
					String[] Data=line.split(cvsSplitBy);
					loginData[i]=Data;
					System.out.println(line);
					i=i+1;
				}
				
				br.close();
				
		}catch(Exception e)	{
			e.printStackTrace();
			
		}
		
		return loginData;
			
}
}
