package Set_B;

 class StockHandler{
	 private String HandlerName;
	 private int HandlerId;
	 public StockHandler(String handlerName, int handlerId) {
		super();
		HandlerName = handlerName;
		HandlerId = handlerId;
	 }
 }
 class StockPerformance extends StockHandler{
	 private int ListofStockQuantities;
	 private double TotalStockHandled;
	 private double AverageStockPerEntry;
	 private String HandlingGrade;
	 public StockPerformance(String handlerName, int handlerId, int listofStockQuantities, double totalStockHandled,
			double averageStockPerEntry, String handlingGrade) {
		super(handlerName, handlerId);
		ListofStockQuantities = listofStockQuantities;
		TotalStockHandled = totalStockHandled;
		AverageStockPerEntry = averageStockPerEntry;
		HandlingGrade = handlingGrade;
	 }
	 public void addstockEntery(double quantity) {
		 if(quantity>0) {
			 ListofStockQuantities+=quantity;
			 System.out.println("stock entry add sucessfully"); 
		 }
		 else {
			 System.out.println("invalid stock quantity");
		 }
		 
	 }
	 public void CalculatePerformance(){
		 if(ListofStockQunatities.isEmpty()) {
			 System.out.println("no stock entries available");
		 }
 }

public class StockMointoring {

	public static void main(String[] args) {
		

	}

}
