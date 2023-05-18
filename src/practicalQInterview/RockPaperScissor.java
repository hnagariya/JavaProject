package practicalQInterview;


public class RockPaperScissor {

	public void playerWin(String userInput, String computerInput) {

		if (userInput.equals("rock") && computerInput.equals("scissors")
				|| userInput.equals("paper") && computerInput.equals("rock")
				|| userInput.equals("scissors") && computerInput.equals("paper")) {
			System.out.println("player wins");
		} else if (userInput.equals(computerInput)) {
			System.out.println("Draw");
		} else {
			System.out.println("Computer wins");
		}

	}
}
