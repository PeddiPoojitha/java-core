package _7_1_26_exam;


class SalesEmployee{
	private String EmployeeName;
	private int EmployeeId;
	public SalesEmployee(String employeeName, int employeeId) {
		EmployeeName = employeeName;
		EmployeeId = employeeId;
		
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	
}
class PerformanceEmployee extends SalesEmployee{
	private double[] enties;
	private int count;
	private double TotalSales;
	private long AverageSales;
	private String PerformanceGrade;
	public PerformanceEmployee(String employeeName, int employeeId, double[] enties, double totalSales,
			long averageSales, String performanceGrade) {
		super(employeeName, employeeId);
		this.enties = enties;
		TotalSales = totalSales;
		AverageSales = averageSales;
		PerformanceGrade = performanceGrade;
	}
	public double[] getEnties() {
		return enties;
	}
	public void setEnties(double[] enties) {
		this.enties = enties;
	}
	public double getTotalSales() {
		return TotalSales;
	}
	public void setTotalSales(double totalSales) {
		TotalSales = totalSales;
	}
	public long getAverageSales() {
		return AverageSales;
	}
	public void setAverageSales(long averageSales) {
		AverageSales = averageSales;
	}
	public String getPerformanceGrade() {
		return PerformanceGrade;
	}
	public void setPerformanceGrade(String performanceGrade) {
		PerformanceGrade = performanceGrade;
	}
	public void AddSales(double amount) {
		if(amount<=0) {
			System.out.println("invalid sales add");	
		}
		else {
			
			count++;
		}
		
	}
	
	
	
	
}

public class EmployeeSalesManagement {

	public static void main(String[] args) {
		

	}

}
