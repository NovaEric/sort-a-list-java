import java.util.*;
public abstract class UserInput implements Data {

  String input; 

  int option;

  Scanner scanner;

  public UserInput(Scanner scanner){

    this.scanner = scanner;
    
  }
  public void data(){

    try{
      
      if(scanner.hasNextInt()){

        option = scanner.nextInt();
        input = "";
        
      }else{

        input = scanner.nextLine();
        option = 0;   

      }
      
      scanner = new Scanner(System.in);
      
    }catch (Exception e){

      e.getMessage();

    }

  };

  public abstract void display(String input);

}

//Function to collect user input