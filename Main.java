import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("What is your name?");
    String name = scan.next();
    System.out.println("How many did you get wrong?");
    int numWrong = scan.nextInt();

// Call those 2 methods within your main method and print the results.
    int topScore = 100;
    int score = getScore(topScore, numWrong);
    System.out.println("Your exam score is " + score + "%");

    boolean pass =passScore(boolean numWrong);
  }
    // Create 2 methods of your choice. Your methods MUST have at least 1 parameter and must return a value.
    // Your methods have to return different types, for example: if your 1st method it is returning a boolean then maybe you'll want your 2nd method to return an int. It is up to you what you have them returning as long as they are returning 2 different types.
 static int getScore(int topScore, int numWrong)
    {
    int score = topScore - numWrong;
    return score;
    }
  static int passScore(boolean numWrong)
  {
  boolean pass = true;

  if (passScore){
    System.out.println("You passed the exam!");
  }
  else{
    System.out.println("You failed the exam. Maybe next time!");
  }
  }

     // Your methods need to be original! Please do not copy/paste the methods I've
    // created with you in different assignments and use them here.

  
  }
    // 2 points extra credit for creativity!!!!
    // Do not forget to add me as a collaborator on your Github Repository!