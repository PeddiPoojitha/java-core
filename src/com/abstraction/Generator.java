package com.abstraction;

abstract class ReportGenerator{
	String title;
	
	public ReportGenerator(String title) {
		super();
		this.title = title;
	}
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
	
	
	public PDFReport(String title, String blockText) {
		super(title);
		this.blockText = blockText;
	}


	@Override
	public void generateContent() {
		System.out.println("Generating PDF content with block text.");
	}
}
class ExcelReport extends ReportGenerator{
	String TabularData;
	
	public ExcelReport(String title, String tabularData) {
		super(title);
		TabularData = tabularData;
	}

	@Override
	public void generateContent() {
		System.out.println( "Generating Excel content with tabular data.");
	}	
}
class HTMLReport extends ReportGenerator{
	String markupContent;
	
	public HTMLReport(String title, String markupContent) {
		super(title);
		this.markupContent = markupContent;
	}

	@Override
	public void generateContent() {
		System.out.println("Generating HTML content with markup.");
	}	
	
}

public class Generator {

	public static void main(String[] args) {
		ReportGenerator rep=new PDFReport("sample Report","This is a sample block text.");
		rep.generateContent();
		rep.openFile();
		rep.writeContent();
		rep.saveFile();
		System.out.println("--------------------------");
		ReportGenerator rep1=new ExcelReport("Sample Report","[name,Age],[puji,24],[pooji,25]");
		rep1.generateContent();
		rep1.openFile();
		rep1.writeContent();
		rep1.saveFile();
		System.out.println("--------------------------");
		ReportGenerator rep12=new HTMLReport("Sample Report", "<h1>Sample Report</h1> <p>This is a sample report.</p>");
		rep12.generateContent();
		rep12.openFile();
		rep12.writeContent();
		rep12.saveFile();
	}

}
