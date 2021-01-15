/**
 * To implement methods into the code.
 *
 * @author (Rienzi Fernandez)
 * @version (1.0)
 */

import java.util.Scanner;

public class Grid_Game
{
    static void clearScreen() {
        System.out.print('\u000C');
    }
    static void end() 
    {
        System.out.println(" ");
        System.out.println("Game Over.");
        System.out.println("Do you want to play again?");
        System.out.println("Type yes or no.");
        System.out.print("Your choice was:  ");
    }
    static void cont() 
    {
        System.out.println(" ");
            System.out.println("Would you like to continue? Type (1) for yes or (2) for no. ");
    }
    static String[][] buildBoard() {
        String[][] MyStringArray = { {"Card", "Card", "Card", "Card"}, {"Card", "Card", "Card", "Card"} };
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++){
                MyStringArray[i][j] = "Card";
            }
        }
        
        return MyStringArray;
    }
    static void printBoard(String[][] board) {
        int row;
        int row2;
        int decision;
        int decision2;
        Scanner myScanner = new Scanner(System.in);
        String[][] answerKey = { {"Turtle", "Wolf", "Turtle", "Dog"}, {"Cat", "Wolf", "Cat", "Dog"} };
        String[][] myStringArray = { {"Card", "Card", "Card", "Card"}, {"Card", "Card", "Card", "Card"} };
        String I = answerKey[0][0];
        String II = answerKey[0][1];
        String III = answerKey[0][2];
        String IV = answerKey[0][3];
        String V = answerKey[1][0];
        String VI = answerKey[1][1];
        String VII = answerKey[1][2];
        String VIII = answerKey[1][3];
        String one = myStringArray[0][0];
        String two = myStringArray[0][1];
        String three = myStringArray[0][2];
        String four = myStringArray[0][3];
        String five = myStringArray[1][0];
        String six = myStringArray[1][1];
        String seven = myStringArray[1][2];
        String eight = myStringArray[1][3];
        
        System.out.println("There are two rows of four cards labeled 1 2 3 4, 1 2 3 4. Have fun matching!");
        
        // Prompts user to choose first card.
        System.out.println("Please choose two cards.");
        System.out.println("Name the row of the card that you would like to choose by entering either 1 or 2."); 
        System.out.print("The row that you chose was row #");
        row = myScanner.nextInt();
        System.out.println("Now choose a card between 1-4)");
        System.out.print("The card that you chose was card #");
        decision = myScanner.nextInt();
            // Prompts user to choose second card.
        System.out.println("Name the row of the card that you would like to choose by entering either 1 or 2."); 
        System.out.print("The row that you chose was row #");
        row2 = myScanner.nextInt();
        System.out.println("Now choose a card between 1-4)");
        System.out.print("The card that you chose was card #");
        decision2 = myScanner.nextInt();
        
        if(row == 1) {
            if (decision == 1){
                System.out.println("The first card you chose had a " + I + ".");
            }
            if (decision == 2){
                System.out.println("The first card you chose had a " + II + ".");
            }
            if (decision == 3){
                System.out.println("The first card you chose had a " + III + ".");
            }
            if (decision == 4){
                System.out.println("The first card you chose had a " + IV + ".");
            }
        }
        if (row == 2) {
            if (decision == 1){
                System.out.println("The first card you chose had a " + V + ".");
            }
            if (decision == 2){
                System.out.println("The first card you chose had a " + VI + ".");
            }
            if (decision == 3){
                System.out.println("The first card you chose had a " + VII + ".");
            }
            if (decision == 4){
                System.out.println("The first card you chose had a " + VIII + ".");
            }
        }
        if (row2 == 1) {
            if (decision2 == 1){
                System.out.println("The second card you chose had a " + I + ".");
            }
            if (decision2 == 2){
                System.out.println("The second card you chose had a " + II + ".");
            }
            if (decision2 == 3){
                System.out.println("The second card you chose had a " + III + ".");
            }
            if (decision2 == 4){
                System.out.println("The second card you chose had a " + IV + ".");
            }
        }
        if (row2 == 2) {
            if (decision2 == 1){
                System.out.println("The second card you chose had a " + V + ".");
            }
            if (decision2 == 2){
                System.out.println("The second card you chose had a " + VI + ".");
            }
            if (decision2 == 3){
                System.out.println("The second card you chose had a " + VII + ".");
            }
            if (decision2 == 4){
                System.out.println("The second card you chose had a " + VIII + ".");
            }
        }
        if (row == 1) {//Turtle
         if (decision == 3){
            if (decision2 == 1){
                System.out.println("Great job! It was a match!");
            }
         }
         if(decision2 == 3){
            if(decision == 1){
               System.out.println("Great job! It was a match!");
            }
         }
        }  
        if (row == 2) {//Cat
         if (decision == 3){
            if (decision2 == 1){
            System.out.println("Great job! It was a match!");
            }
         }
         if(decision2 == 3){
            if(decision == 1){
            System.out.println("Great job! It was a match!");
            }
         }
        }  
        if (row == 1){//Wolf
         if (decision == 2){
            if(row2 == 2) {
             if(decision2 == 2){
                System.out.println("Great job! It was a match!");
             }
           }
         }
        }
        else if (row == 2){
         if(decision == 2){
           if(row2 == 1) {
            if(decision2 == 2){
                System.out.println("Great job! It was a match!");
            }
           }
         } 
        }  
        if (row == 1){//Dog
         if (decision == 4){
            if(row2 == 2) {
             if(decision2 == 4){
                System.out.println("Great job! It was a match!");
            }
           }
         }
        }
        else if (row == 2){
         if(decision == 4){
           if(row2 == 1) {
            if(decision2 == 2){
                System.out.println("Great job! It was a match!");
            }
           }
         } 
        }
        if (row == 1) {//Turtle
          if (decision == 3){
            if (decision2 == 1){
                int printRow = row + 1; // Adds one to the index.
                int printNumber = decision + 1;
                System.out.print("Enter a new value for element " + row + ", " + decision + ": ");
                myStringArray[row - 1][decision - 1] = myScanner.next(); 
        
                int printRow2 = row2 + 1; // Adds one to the index.
                int printNumber2 = decision2 + 1;
                System.out.print("Enter a new value for element " + row2 + ", " + decision2 + ": ");
                myStringArray[row2 - 1][decision2 - 1] = myScanner.next(); 
                for (int t = 0;t < 2; t++) {
                  for (int e = 0; e < 4; e++){
                      int numberPlusOne = t + 1;
                      int number2PlusOne = e + 1; 
                      System.out.print("    " + myStringArray[t][e] + "    ");
                  }
                  System.out.println();
                }
            }
         }
         if(decision2 == 3){
             if(decision == 1){
                int printRow = row + 1; // Adds one to the index.
                int printNumber = decision + 1;
                System.out.print("Enter a new value for element " + row + ", " + decision + ": ");
                myStringArray[row - 1][decision - 1] = myScanner.next(); 
        
                int printRow2 = row2 + 1; // Adds one to the index.
                int printNumber2 = decision2 + 1;
                System.out.print("Enter a new value for element " + row2 + ", " + decision2 + ": ");
                myStringArray[row2 - 1][decision2 - 1] = myScanner.next(); 
                for (int t = 0; t < 2; t++) {
                  for (int e = 0; e < 4; e++){
                    System.out.print("    " + myStringArray[t][e] + "    ");
                  }
                  System.out.println();
                }
            }
         }
         if (decision == 3){
            if (decision2 != 1){
                for (int t = 0; t < 2; t++) {
                   for (int e = 0; e < 4; e++){
                    System.out.print("    " + myStringArray[t][e] + "    ");
                   }
                   System.out.println();
                }
            }
         }
         if(decision2 == 3){
            if(decision != 1){
                for (int t = 0; t < 2; t++) {
                   for (int e = 0; e < 4; e++){
                    System.out.print("    " + myStringArray[t][e] + "    ");
                   }
                   System.out.println();
                }
            }
         }
        }
        if (row == 2) {//Cat
         if (decision == 3){
            if (decision2 == 1){
                int printRow = row + 1; // Adds one to the index.
                int printNumber = decision + 1;
                System.out.print("Enter a new value for element " + row + ", " + decision + ": ");
                myStringArray[row - 1][decision - 1] = myScanner.next(); 
        
                int printRow2 = row2 + 1; // Adds one to the index.
                int printNumber2 = decision2 + 1;
                System.out.print("Enter a new value for element " + row2 + ", " + decision2 + ": ");
                myStringArray[row2 - 1][decision2 - 1] = myScanner.next(); 
                for (int c = 0; c < 2; c++) {
                  for (int a = 0; a < 4; a++){
                      int numberPlusOne = c + 1;
                      int number2PlusOne = a + 1; 
                      System.out.print("    " + myStringArray[c][a] + "    ");
                  }
                  System.out.println();
                }
            }
         }
         if(decision2 == 3){
            if(decision == 1){
                int printRow = row + 1; // Adds one to the index.
                int printNumber = decision + 1;
                System.out.print("Enter a new value for element " + row + ", " + decision + ": ");
                myStringArray[row - 1][decision - 1] = myScanner.next(); 
        
                int printRow2 = row2 + 1; // Adds one to the index.
                int printNumber2 = decision2 + 1;
                System.out.print("Enter a new value for element " + row2 + ", " + decision2 + ": ");
                myStringArray[row2 - 1][decision2 - 1] = myScanner.next(); 
                for (int c = 0; c < 2; c++) {
                  for (int a = 0; a < 4; a++){
                      int numberPlusOne = c + 1;
                      int number2PlusOne = a + 1; 
                      System.out.print("    " + myStringArray[c][a] + "    ");
                  }
                  System.out.println();
                }
            }
         }
         if (decision == 3){
            if (decision2 != 1){
                for (int c = 0; c < 2; c++) {
                   for (int a = 0; a < 4; a++){
                    System.out.print("    " + myStringArray[c][a] + "    ");
                   }
                   System.out.println();
                }
            }
         }
         if(decision2 == 3){
            if(decision != 1){
                for (int c = 0; c < 2; c++) {
                   for (int a = 0; a < 4; a++){
                    System.out.print("    " + myStringArray[c][a] + "    ");
                   }
                   System.out.println();
                }
            }
         }
        } 
        if (row == 1){//Wolf
         if (decision == 2){
            if(row2 == 2) {
              if(decision2 == 2){
                
                int printRow = row + 1; // Adds one to the index.
                int printNumber = decision + 1;
                System.out.print("Enter a new value for element " + row + ", " + decision + ": ");
                myStringArray[row - 1][decision - 1] = myScanner.next(); 
        
                int printRow2 = row2 + 1; // Adds one to the index.
                int printNumber2 = decision2 + 1;
                System.out.print("Enter a new value for element " + row2 + ", " + decision2 + ": ");
                myStringArray[row2 - 1][decision2 - 1] = myScanner.next(); 
                for (int w = 0; w < 2; w++) {
                  for (int f = 0; f < 4; f++){
                      int numberPlusOne = w + 1;
                      int number2PlusOne = f + 1; 
                      System.out.print("    " + myStringArray[w][f] + "    ");
                  }
                  System.out.println();
                }
              }
            }
         }
        }
        else if (row == 2){
         if(decision == 2){
           if(row2 == 1) {
              if(decision2 == 2){
                
                int printRow = row + 1; // Adds one to the index.
                int printNumber = decision + 1;
                System.out.print("Enter a new value for element " + row + ", " + decision + ": ");
                myStringArray[row - 1][decision - 1] = myScanner.next(); 
        
                int printRow2 = row2 + 1; // Adds one to the index.
                int printNumber2 = decision2 + 1;
                System.out.print("Enter a new value for element " + row2 + ", " + decision2 + ": ");
                myStringArray[row2 - 1][decision2 - 1] = myScanner.next(); 
                for (int w = 0; w < 2; w++) {
                  for (int f = 0; f < 4; f++){
                      int numberPlusOne = w + 1;
                      int number2PlusOne = f + 1; 
                      System.out.print("    " + myStringArray[w][f] + "    ");
                  }
                  System.out.println();
                }
              }
            }
         } 
        }  
        if (row == 1){//Wolf
         if (decision == 2){
            if(row2 != 2){
              if(decision2 != 2){
                for (int w = 0; w < 2; w++) {
                   for (int f = 0; f < 4; f++){
                    System.out.print("    " + myStringArray[w][f] + "    ");
                   }
                   System.out.println();
                }
              }
            }
         }
        }
        else if (row == 2){
         if(decision == 2){
           if(row2 != 2){
             if(decision2 != 2){
                for (int w = 0;w < 2; w++) {
                   for (int f = 0; f < 4; f++){
                    System.out.print("    " + myStringArray[w][f] + "    ");
                   }
                   System.out.println();
                }
             }
            }
         } 
        }  
        if (row == 1){//Dog
         if (decision == 4){
            if(row2 == 2) {
              if(decision2 == 4){
                
                int printRow = row + 1; // Adds one to the index.
                int printNumber = decision + 1;
                System.out.print("Enter a new value for element " + row + ", " + decision + ": ");
                myStringArray[row - 1][decision - 1] = myScanner.next(); 
        
                int printRow2 = row2 + 1; // Adds one to the index.
                int printNumber2 = decision2 + 1;
                System.out.print("Enter a new value for element " + row2 + ", " + decision2 + ": ");
                myStringArray[row2 - 1][decision2 - 1] = myScanner.next(); 
                for (int d = 0; d < 2; d++) {
                  for (int g = 0; g < 4; g++){
                      int numberPlusOne = d + 1;
                      int number2PlusOne = g + 1; 
                      System.out.print("    " + myStringArray[d][g] + "    ");
                  }
                  System.out.println();
                }
              }
            }
         }
        }
        else if (row == 2){
         if(decision == 4){
           if(row2 == 1) {
             if(decision2 == 4){
                
                int printRow = row + 1; // Adds one to the index.
                int printNumber = decision + 1;
                System.out.print("Enter a new value for element " + row + ", " + decision + ": ");
                myStringArray[row - 1][decision - 1] = myScanner.next(); 
        
                int printRow2 = row2 + 1; // Adds one to the index.
                int printNumber2 = decision2 + 1;
                System.out.print("Enter a new value for element " + row2 + ", " + decision2 + ": ");
                myStringArray[row2 - 1][decision2 - 1] = myScanner.next(); 
                for (int d = 0; d < 2; d++) {
                  for (int g = 0; g < 4; g++){
                      int numberPlusOne = d + 1;
                      int number2PlusOne = g + 1; 
                      System.out.print("    " + myStringArray[d][g] + "    ");
                  }
                  System.out.println();
                }
              }
            }
         } 
        }
        if (row == 1){//Dog
         if (decision == 4){
            if(row2 != 2){
              if(decision2 != 4){
                for (int d = 0; d < 2; d++) {
                   for (int g = 0; g < 4; g++){
                    System.out.print("    " + myStringArray[d][g] + "    ");
                   }
                   System.out.println();
                }
              }
            }
         }
        }
        else if (row == 2){
         if(decision == 4){
           if(row2 != 1){
             if(decision2 != 4){
                for (int d = 0; d < 2; d++) {
                   for (int g = 0; g < 4; g++){
                    System.out.print("    " + myStringArray[d][g] + "    ");
                   }
                   System.out.println();
                }
             }
           }
         }
        }
    }   
    public static void main(String[] args) {
        // Initialize Booleans to allow repetition of tasks.
        String playAgain = "yes";
        int notAgain;
        boolean playAgain1 = true;
        boolean fillAnElement = true;
        // Initialize an array
        String[][] myStringArray = { {"Card", "Card", "Card", "Card"}, {"Card", "Card", "Card", "Card"} };
        String[][] answerKey = { {"Turtle", "Wolf", "Turtle", "Dog"}, {"Cat", "Wolf", "Cat", "Dog"} };
        String[][] boardValues = { {"Card", "Card", "Card", "Card"}, {"Card", "Card", "Card", "Card"} };
        
        //values for cards
        String Turtle = answerKey[0][0] + answerKey[0][2];  
        String Wolf = answerKey[0][1] + answerKey[1][1];
        String Dog = answerKey[0][3] + answerKey[1][3];
        String Cat = answerKey[1][0] + answerKey[1][2];
        //values for grid
        String one = myStringArray[0][0];
        String two = myStringArray[0][1];
        String three = myStringArray[0][2];
        String four = myStringArray[0][3];
        String five = myStringArray[1][0];
        String six = myStringArray[1][1];
        String seven = myStringArray[1][2];
        String eight = myStringArray[1][3];
        String Done = "Done";
        // Scanners and decisions
        int row; 
        int row2;
        int rowValue = 4;
        int decision;
        int decision2; 
        int codeCont;
        int w, f;
        int t, e;
        int c;
        int d, g;
        int notAgain1;
        int notAgain2;
        int notAgain3;
        int notAgain4;
        Scanner myScanner = new Scanner(System.in);
        Scanner inputScanner = new Scanner(System.in);
        do {
            clearScreen();
            System.out.println("There are two rows of four cards labeled 1 2 3 4, 1 2 3 4.");
            System.out.println("You have three chances to find a match. Have fun matching!");
            System.out.println("Here is the board: ");
            for (int i = 0; i < 2; i++) {
                   for (int j = 0; j < 4; j++){
                    System.out.print("     " + myStringArray[i][j] + "     ");
                   }
                   System.out.println();
            }
            printBoard(boardValues);
            cont();
            notAgain1 = inputScanner.nextInt();
            if (notAgain1 == 1){
               boardValues = buildBoard();
               printBoard(boardValues);
               cont();
               notAgain2 = inputScanner.nextInt();
               if (notAgain2 == 1){
                  boardValues = buildBoard();
                  printBoard(boardValues);
                  cont();
                  notAgain3 = inputScanner.nextInt();
                  if (notAgain3 == 1){
                     boardValues = buildBoard();
                     printBoard(boardValues);
                     System.out.println("This was your last match :)");
                  }
                  else if (notAgain3 == 2){
                  }
               }
               else if (notAgain2 == 2){
               }
            }
            else if (notAgain1 == 2){
            }
            end();
            playAgain = inputScanner.next();
        }while (playAgain.equals("yes") || playAgain.equals("Yes"));
    }
}