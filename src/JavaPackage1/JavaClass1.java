package JavaPackage1;

public class JavaClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GasStove samsung = new GasStove();
		samsung.brandName = "Samsung";
		samsung.isAirFryer = true;
		samsung.Size = 36;
		samsung.programmableControl = "Wifi";
		samsung.price = 1299.99f;
		samsung.type = "Freestanding and Elecric";
		samsung.bake();
		samsung.convectionCooking();
		samsung.cook();
		samsung.grill();
		System.out.println("***************");
		GasStove FP = new GasStove();
		FP.brandName = "Fisher & Paykel";
		FP.isAirFryer = false;
		FP.Size = 30;
		FP.programmableControl = "timer";
		FP.type = " Slide In and Induction";
		FP.cook();
		FP.bake();
	
		
		 
		
		  

}}
