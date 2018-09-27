import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // Create new ToDoList object, initialized with ArrayList returned from
    // getUserInput() method
    ToDoList toDoList = new ToDoList(getUserInput());
    printList(toDoList);

  }

  private static ArrayList<Item> getUserInput(){
    Scanner in = new Scanner(System.in);
    String name, category, quit;
    int priority;
    Boolean isDone;

    ArrayList<Item> toDoList = new ArrayList<>();

    System.out.println("Let's create your To Do List!\n");

    do {
      // Create new item
      Item item = new Item();

      System.out.print("Enter name of item: ");
      name = in.nextLine();

      System.out.print("Enter category of item: ");
      category = in.nextLine();

      // Call setPriorityLevel() method to randomly generate priority level
      item.setPriorityLevel();
      priority = item.getPriorityLevel();
      System.out.println("Your assigned priority level is: " + priority);

      System.out.print("Is the item done (true or false)? ");
      isDone = Boolean.valueOf(in.nextLine());

      item = new Item(name, category, priority, isDone);
      toDoList.add(item);

      System.out.print("Add more items Y(yes) or Q(quit)? ");
      quit = in.nextLine();

      System.out.println();

    } while(!quit.equalsIgnoreCase("quit") && !quit.equalsIgnoreCase("q"));
    // Loop terminates when user enters "quit" or "q"

    return toDoList;
  }

  private static void printList(ToDoList toDoList) {
    String priority = "";

    System.out.println("=======================TO DO " +
            "LIST=======================");

    System.out.println("Item Name\t\tCategory\t\tPriority\t\tDone");

    for(Item item : toDoList.getItems()) {

      // Print priority as low, medium, or high
      switch(item.getPriorityLevel()){
        case 1:
          priority = "low";
          break;
        case 2:
          priority = "medium";
          break;
        case 3:
          priority = "high";
          break;
		default:
		  priority = "";
		  break;
      }

      System.out.println(item.getName() + "\t\t\t" + item.getCategory() + "\t" +
              "\t\t" + priority + "\t\t\t" + item.getDone() );
    }

    System.out.println("\nLow-level: " + toDoList.getPriorityCount(1) + " " +
            "Medium-level: " + toDoList.getPriorityCount(2) + " High-level: " + toDoList.getPriorityCount(3));

    System.out.println("# of items completed: " + toDoList.getDoneCount(true));
    System.out.println("# of items NOT completed: " + toDoList.getDoneCount(false));
  }
}
