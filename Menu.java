import java.util.*;

class Menu extends Sort{

  public Menu(Scanner scanner){

    super(scanner);
  
  }

  public void menu(){

    while(option != 4){

    display("\n***********************");  
    display("Enter 1. To make a list");
    display("Enter 2. To sort and print list");  
    display("Enter 3. To print list");
    display("Enter 4. to exit");
    display("***********************\n");
    
    data();

    switch (option){
      case 1: {
      
        list.clear();//added this since i realized i wasnt able to keep making another list.
        makeList();
        break;

      }
      case 2: {
        
        sorted();
        break;

      }
      case 3: {
        
        String[] li = list.toArray(new String[list.size()]);
        display("List as entered: \n");
        for (String print : li) {
          display(print);
        }

        break;
        
      }
      case 4: {

          display("\nBye! Thanks!");
          break;
      }
    }
    }
    scanner.close();
  }
}

//menu to give users options on what to do