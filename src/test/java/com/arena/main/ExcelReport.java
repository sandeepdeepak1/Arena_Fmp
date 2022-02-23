package com.arena.main;

import java.io.*;
import javax.xml.parsers.*;

import org.apache.poi.xssf.usermodel.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class ExcelReport 
{
	public XSSFWorkbook book;
	
	public void generateExcelReport() throws ParserConfigurationException, SAXException, IOException,NullPointerException, InterruptedException
	{
		try
		{
		String ReportPath="../Nexa_FMP/Reports/Report_All_TestCase.xlsx";
		File FilePath = new File("../Nexa_FMP/test-output/testng-results.xml");
		DocumentBuilderFactory fact= DocumentBuilderFactory.newInstance();
		DocumentBuilder build=fact.newDocumentBuilder();
		Document doc = build.parse(FilePath);
		doc.getDocumentElement().normalize();
		
		 book= new XSSFWorkbook();
		 XSSFSheet sheet = book.createSheet("Test Report");
		 sheet.setColumnWidth(0, 12000);
		 sheet.setColumnWidth(1, 9000);
		 sheet.setColumnWidth(2, 3000);
		 sheet.setColumnWidth(3, 15000);
		 
		NodeList test_list= doc.getElementsByTagName("test");
		
		for(int i=0; i<test_list.getLength(); i++)
		{
			int r=1;
			XSSFRow rowhead = sheet.createRow((short)0);
			
			XSSFCellStyle style = book.createCellStyle();
			XSSFFont font = book.createFont();
			font.setBold(true);
			style.setFont(font); 
			
		    rowhead.createCell(0).setCellValue("Package_Name_with_TestCase");
			rowhead.createCell(1).setCellValue("Class");
			rowhead.createCell(2).setCellValue("Status");
			rowhead.createCell(3).setCellValue("Exception");
			for(int j = 0; j<=3; j++)
				rowhead.getCell(j).setCellStyle(style);
			/*
			 * sheet.autoSizeColumn(0); sheet.autoSizeColumn(1); sheet.autoSizeColumn(3);
			 */
			String status_Pass="PASS";
			String status_Fail="FAIL";
			String status_Skip="SKIPPED";
			Node test_node = test_list.item(i);
			
			NodeList class_list=((Element)test_node).getElementsByTagName("class");
			for(int j =0; j< class_list.getLength();j++)
			{
				Node class_Node =class_list.item(j);
				
				String class_name=((Element)class_Node).getAttribute("name");
				NodeList test_method_list=((Element)class_Node).getElementsByTagName("test-method");
				
				for(int k=0;k<test_method_list.getLength();k++)
				{
					Node test_method_node=test_method_list.item(k);
					
					String test_method_name=((Element)test_method_node).getAttribute("name");
					
					XSSFRow row = sheet.createRow(r++);
					XSSFCell cel_name =row.createCell(0);
					
					cel_name.setCellValue(class_name);
					
					/*if(test_method_name.equals("setup") || test_method_name.equals("pre")|| test_method_name.equals("close"))
					{
						test_method_name.valueOf(false);
					}
					else
					{	*/				
						XSSFCell cell_metho_Name=row.createCell(1);
						cell_metho_Name.setCellValue(test_method_name);
					String test_method_status=((Element)test_method_node).getAttribute("status");
					if(test_method_status.equals(status_Pass))
					{
						String key=test_method_status.replace("PASS", "0");
						XSSFCell cel_status =row.createCell(2);
						cel_status.setCellValue(key);
					}
					else if(test_method_status.equals(status_Fail))
					{
						String key=test_method_status.replace("FAIL", "1");
						XSSFCell cel_status =row.createCell(2);
						cel_status.setCellValue(key);
					}
					else if(test_method_status.equals(status_Skip))
					{
						String key=test_method_status.replace("SKIP", "2");
						XSSFCell cel_status =row.createCell(2);
						cel_status.setCellValue(key);
					}
					
					XSSFCell cel_exp;
					String exp_class;
					
					if("fail".equalsIgnoreCase(test_method_status))
					{
						
						NodeList exp_list=((Element)test_method_node).getElementsByTagName("exception");
						Node exp_node= exp_list.item(0);
						exp_class=((Element)exp_node).getAttribute("class");
						cel_exp=row.createCell(3);
						cel_exp.setCellValue(exp_class);
					}				
				}				
			}			
		}
		FileOutputStream fos = new FileOutputStream(ReportPath);
		book.write(fos);
		fos.close();
		book.close();
		System.out.println("Finally Report has been Generated");
	}
	catch (Exception e) 
		{
		System.out.println(e);
	}	
	}
	public static void main(String[] args) throws NullPointerException, ParserConfigurationException, SAXException, IOException, InterruptedException 
	{
		new ExcelReport().generateExcelReport();
		
	}
}
