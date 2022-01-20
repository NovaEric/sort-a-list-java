import java.util.*;

class Lista extends Display{

  ArrayList<String> list = new ArrayList<String>();

  public Lista(Scanner scanner){

    super(scanner);
    
  }

  public void makeList(){

    display("Enter words. Type 'eric' when done");

    boolean sw = false; //moved from being global to just within the method since i realized i wasnt able to keep making another list.

    while (!sw){

      data();
      
      if (input.equals("eric")){

        sw = true;
  
      }else{

       list.add(input);

      }
    
    }
  }

}

//class to fill up our array list/data