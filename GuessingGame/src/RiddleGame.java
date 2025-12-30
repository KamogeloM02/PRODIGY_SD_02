import javax.swing.JOptionPane;

public class RiddleGame {
    public static void main(String[] args) {
        // Show the riddle
        JOptionPane.showMessageDialog(null,
            "Riddle:\nI am a one-digit number.\n" +
            "If you square me, the result is the same\n" +
            "as adding me to myself.\n" +
            "What number am I?");
        
        int k  = 0;
        
        // Loop for guessing
        while (k < 3) {
            k++;
            
            String input = JOptionPane.showInputDialog(
                "Attempt " + k + "/3\n" +
                "Enter your guess (0-9):");
            
            if (input == null) {
                break;
            }
            
            try {
                int guess = Integer.parseInt(input);
                
                if (guess == 2) {
                    JOptionPane.showMessageDialog(null,
                        "Correct! The number is 2!\n" +
                        "Because: 2² = 4 and 2 + 2 = 4" +"\nCongratulations!! You have completed the Riddle Game.");
                    break;
                } else {
                    JOptionPane.showMessageDialog(null,
                        "Wrong! Try again.");
                }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                    "Please enter a number!");
                k--;
            }
        }
        
        // If didn't guess correctly
        if (k == 3) {
            JOptionPane.showMessageDialog(null,
                "The answer is 2!\n" +
                "2 × 2 = 4 and 2 + 2 = 4" );
        }
    }
}
