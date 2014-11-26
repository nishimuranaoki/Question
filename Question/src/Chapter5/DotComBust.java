import java.util.*;
public class DotComBust {
  		private GameHelper helper = new GameHelper();
		private ArrayList<DotCom>dotComsList = new ArrayList<DotCom>();
		private int numOfguesses = 0;


		private void setUpGame(){
			DotCom one = new DotCom ();
			one.setName("Pets.com");
			DotCom two = new DotCom ();
			one.setName("eToys.com");
			DotCom three = new DotCom ();
			one.setName("Go2.com");

			dotComList.add(one);
			dotComList.add(two);
			dotComList.add(three);

			System.out.println("Your goal is to sink three dot coms.");

			System.out.println("Pets.com , eToys.com , Go2.Com");

			System.out.println("Try to sink them all in the fewest number of guesses");
			for (DotCom dotComToSet : dotComsList){
				ArrayList<String> newLocation = helper.placeDotCom(3);
				dotComToSet.setLocationCells(newLocation);
	}
}

		private void startPlaying() {

			while(!dotComsList.isEmpty()){
				String userGuess = helper.getUserInput("Enter a guess");
				
				checkUserGuess(userGuess);
			}
				finishGame();
		}
}