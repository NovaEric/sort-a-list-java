import java.util.*;

class Sort extends Lista{

  public Sort(Scanner scanner){

    super(scanner);
    

  }

  public void sorted(){

    Collections.sort(super.list);

    String[] print = list.toArray(new String[list.size()]); 
    display("Sorted List: \n");
    for (String sorted : print) {
      display(sorted);
    }

  }
  

}

//to sort list from our ArrayList