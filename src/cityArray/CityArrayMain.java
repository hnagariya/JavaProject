package cityArray;

public class CityArrayMain {

	public static void main(String[] args) {
		CityArray cityArray = new CityArray();
		cityArray.isCityPresentInArray();
		System.out.println("*******************");
		cityArray.findCityEndWithTon();
		System.out.println("*********************");
		cityArray.replaceTonWithFunInCityName();
		System.out.println("********************");
		cityArray.getAddress();
	}
}

