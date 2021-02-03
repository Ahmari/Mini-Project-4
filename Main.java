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
    System.out.println(studentLvl(score));

  }
  // Create 2 methods of your choice. Your methods MUST have at least 1 parameter and must return a value.
  // Your methods have to return different types, for example: if your 1st method
  // it is returning a boolean then maybe you'll want your 2nd method to return an int.
  // It is up to you what you have them returning as long as they are returning 2 different types
  // Your methods need to be original! Please do not copy/paste the methods I've created with you in different assignments and use them here.

  //methods
  //This method gives the student their exam score when they enter the number they got wrong; Returns an int
  static int getScore(int topScore, int numWrong) {
    int score = topScore - numWrong;
    return score;
  }
 //This method lets the student know if they passed the exam or not; Returns a boolean
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
//Gives the student level based on their score
  static String studentLvl(int studentLvl){
    if(studentLvl >= 90){
      return "Congrats...you are a level 5!";
    }else if(studentLvl >= 80){
      return "Congrats...you are a level 4!";
    }else if(studentLvl >= 70){
      return "Congrats...You are a level 3!";
    }else if(studentLvl >= 60){
    return "You are a level 2...Maybe next time!";
    }else if(studentLvl >= 50){
    return "You are a level 1...Maybe next time!";
    }else{
    return "You are a level 0...Maybe next time!";
    }
  }
}
// 2 points extra credit for creativity!!!!
// Do not forget to add me as a collaborator on your Github Repository!