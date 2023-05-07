package composition;

public class CarDealershipMain {

	public static void main(String[] args) {
		Car hondaCivic = new Car("Honda", "White", 5, 24000);
		Car kiaSeltos =new Car("Kia","Blue",5,20000);
		Car nissanMurano=new Car("Nissan","Golden",5,30000);
		Dealership ds = new Dealership();
		//ds.addCarToDealership(hondaCivic);
		//ds.addCarToDealership(kiaSeltos);
		ds.addCarToDealership(hondaCivic, kiaSeltos,nissanMurano);
	}

}
