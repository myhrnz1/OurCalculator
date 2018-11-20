public class OurCalculator {

  private static void add(){
   answer = firstNumber + secondNumber;
  }
  
  private static void sub(){
    answer = firstNumber - secondNumber;
  }

  private static void mult(){
    answer = firstNumber * secondNumber;
  }

  private static void div(){
    answer = firstNumber / secondNumber;
  }

  private static double enterDouble(){
    double input = 0;
    boolean error = true;
    System.out.print("Enter number: ");
    while(error) {
      try {
        input = scan.nextDouble();
        error = false;
      }
      catch (InputMismatchException e) {
        System.out.println("Input is not a double");
        scan.next(); // clear scanner
      }
    }
  return input;
  }

  private static void enterOperator(){
    while(!(operator.equals("+") || operator.equals("-") || 
             operator.equals("*") || operator.equals("/"))) {
      System.out.print("Enter operator: ");
      operator = scan.next();
    }
  }

  private static void printResult(){
    System.out.println("The answer is: " + answer);
  }

  private static void printInstructions(){
    System.out.println("Step 1: Enter a number.");
    System.out.println("Step 2: Enter an operator.");
    System.out.println("Step 3: Enter a number.");
  }
  
public static void main(String[] args){
  printInstructions();
  String quit = "n";
  while(!quit.equals("y")){
    firstNumber = enterDouble();
    enterOperator();
    secondNumber = enterDouble();
    if (!(operator.equals("/") && secondNumber == 0)){
      if ( operator.equals("+") ) {
        add();
      }else if (operator.equals("-") ){
        sub();
      }else if (operator.equals("*") ){
        mult();
      }else if (operator.equals("/") ){
        div();
    }
    printResult();
  } else {
    System.out.println("You are dividing by Zero! Try agin!: ");
  }
    System.out.println("Qiut? 'Y' for Yes");
    quit = scan.next();
    operator = "-1";

  }
 }
}
