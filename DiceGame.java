package dicegame;
import javax.swing.JOptionPane;

public class DiceGame {

    public static void main(String[] args) {
        String play = "yes";
        String actualRoll;
        int roundsPlayed = 0;
        int wins = 0;
        double winPercent;
        double evenPercent;
        double oddPercent;
        
    while (play.equalsIgnoreCase("yes")){
        roundsPlayed++;
        
    // Computer will roll the dice and determine if it is odd or even    
        int diceRoll = 1 + (int) (Math.random() * 6);
            
            if (diceRoll == 1 || diceRoll == 3 || diceRoll == 5)
                actualRoll = "odd"; 
            else 
                actualRoll = "even";
            
    // Prompt user to guess if it will be odd or even and store value
        String userGuess = JOptionPane.showInputDialog("You're about to roll a 6-sided dice. "
                + "\nDo you think it will be odd or even?");
       
    // Compare the user's guess and the actual dice roll and print result
        if ((userGuess.equals("odd") && actualRoll.equals("odd")) 
                || (userGuess.equals("even")) && (actualRoll.equals("even"))){
            wins++;
            
            String correctGuess = String.format("You guessed right! "
                    + "\nYou rolled a %d, which is %s.", diceRoll, actualRoll);
            JOptionPane.showMessageDialog(null, correctGuess);
        }
        else {
            String wrongGuess = String.format("You guessed wrong. "
                    + "\nYou rolled a %d, which is %s.", diceRoll, actualRoll);
            JOptionPane.showMessageDialog(null, wrongGuess);
        }
        
    // Calculate the player's statistics
        winPercent = ((wins*100)/roundsPlayed);
    // Display statistics and ask if the user if they want to play again
        String playerStats = String.format("You have played %d games."
                + "\nYou've won %f percent of your games.", roundsPlayed, winPercent);
        JOptionPane.showMessageDialog(null, playerStats);
  
        play = JOptionPane.showInputDialog("Would you like to play again? (Yes/No)");
    }
        
    }
    
}
    
