package com.abstraction;

abstract class ReportGenerator{
	public abstract void generateContent();
	public void openFile() {
		System.out.println("Opening PDF file.");
	}
	public void writeContent() {
		System.out.println( "Writing content to PDF file.");
	}
	public void saveFile() {
		System.out.println("Saving PDF file.");
	}

}
class PDFReport extends ReportGenerator{
	String blockText;
	@Override
	public void generateContent() {
		System.out.println("Generating PDF content with block text.");
	}
}
class ExcelReport extends ReportGenerator{
	String TabularData;
	@Override
	public void generateContent() {
		System.out.println( "Generating Excel content with tabular data.");
	}	
}
class HTMLReport extends ReportGenerator{
	String markupContent;
	@Override
	public void generateContent() {
		System.out.println("Generating HTML content with markup.");
	}	
	
}

public class Generator {

	public static void main(String[] args) {
		ReportGenerator rep=new PDFReport();
		rep.generateContent();
		rep.openFile();
		rep.writeContent();
		rep.saveFile();
		System.out.println("--------------------------");
		ReportGenerator rep1=new ExcelReport();
		rep1.generateContent();
		rep1.openFile();
		rep1.writeContent();
		rep1.saveFile();
		System.out.println("--------------------------");
		ReportGenerator rep12=new HTMLReport();
		rep12.generateContent();
		rep12.openFile();
		rep12.writeContent();
		rep12.saveFile();
	}

}
