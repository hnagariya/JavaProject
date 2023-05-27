 package enumDemo;

public enum USStates {
   CALIFORNIA("California",true,14.5),
   ARIZONA("Arizona",false,0.0),
   TEXAS("Texas",true,12.0),
   ALBAMA("Alabama",true, 13);
   
   String nameOfState;
   boolean isTaxApplicable;
   double tax;
private USStates(String nameOfState, boolean isTaxApplicable, double tax) {
	this.nameOfState = nameOfState;
	this.isTaxApplicable = isTaxApplicable;
	this.tax = tax;
	
	
}
public String getNameOfState() {
	return nameOfState;
}
public boolean isTaxApplicable() {
	return isTaxApplicable;
}
public double getTax() {
	return tax;
}

public static USStates getStateByName(String enteredStateName) {
	for(USStates state:USStates.values()) {
		if(enteredStateName.equals(state.getNameOfState())) {
			System.out.println(state);
			return state;
		}
	}
	return null;
}
   
	
}
