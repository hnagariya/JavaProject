package pizza;

import java.util.Scanner;

public class PizzaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pizza orderPizza = new Pizza();
		//orderPizza.pepporoni = true;
		//orderPizza.extraCheese = false;
		//orderPizza.pizzaBill();
		//System.out.println("******************");
		PizzaBillWithMethods pizzaBill = new PizzaBillWithMethods();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter pizza size");
		String size = sc.nextLine();
		pizzaBill.pizzaSize(size);
		System.out.println("Do you want extra cheese: Y/N");
		boolean extraCheese = sc.nextBoolean();
		pizzaBill.pizzaWithExtraCheese(extraCheese);
		System.out.println("Do you want to add pepporoni: Y/N");
		boolean pepporoni = sc.nextBoolean();
		pizzaBill.pizzaWithPepporoni(pepporoni, size);
		pizzaBill.finalPrizePizza();

	}
}
