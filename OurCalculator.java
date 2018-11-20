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
