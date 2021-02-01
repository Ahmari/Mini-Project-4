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
    boolean exam = studentScore(score);
    int studentLevel = studentLevel(score);
    System.out.println("Congrats! You are a level 5!");

  }
  // Create 2 methods of your choice. Your methods MUST have at least 1 parameter

  // and must return a value.
  // Your methods have to return different types, for example: if your 1st method
  // it is returning a boolean then maybe you'll want your 2nd method to return an
  // int. It is up to you what you have them returning as long as they are
  // returning 2 different types.
  // Your methods need to be original! Please do not copy/paste the methods
  // I've created with you in different assignments and use them here.

  static int getScore(int topScore, int numWrong) {
    int score = topScore - numWrong;
    return score;
  }

  static boolean studentScore(int studentScore){
    boolean exam = true;
    if(studentScore >= 60){
   System.out.println("You passed the exam!");
   return true;
    }
   else{
   System.out.println("You failed the exam...Maybe next time");
   return false;
   }
  }
  static int getLevel(int studentLevel){
   if(studentLevel >= 90);{
    return studentLevel;
   }
    }
  }
// 2 points extra credit for creativity!!!!
// Do not forget to add me as a collaborator on your Github Repository!