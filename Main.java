import java.util.Scanner;

class Main {
  public static int size = 100;
  public static Subject[] subject = new Subject[size];
  public static int index = 0;
  public static int userSize = 0;

  public static void main(String[] args) {
  

    boolean running = false;

    Scanner scanner = new Scanner(System.in);

    running = true;
    

    while(running){

      System.out.println("Enter the category name, grade weight, and the grade in the format (x, y, z). Leave it blank and press enter to calculate");

      String input = scanner.nextLine();

      if(input.equals("")){
        running = false;
        calculate();
        break;
      }
      
      String[] splitArray = input.split(",", 0);
    
      subject[index] = new Subject(splitArray[0], Double.parseDouble(splitArray[1]), Double.parseDouble(splitArray[2]));
     
      index = index + 1;
      userSize = userSize + 1;
    }

  }

  public static void calculate(){
    double average;
    double nominator = 0;
    double denominator = 0;

    for(int i = 0; i < userSize; i++){
      nominator = nominator + subject[i].getWeight() * subject[i].getGrade();
      denominator = denominator + subject[i].getWeight();
    }

    average = nominator / denominator;

    System.out.println("Grade is: " + average);

  }
  
}