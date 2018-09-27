import java.util.ArrayList;

public class ToDoList {

  private ArrayList<Item> items;

  public ToDoList() {
  }

  public ToDoList(ArrayList<Item> items) {
    this.items = items;
  }

  public ArrayList<Item> getItems() {
    return items;
  }

  public void setItems(ArrayList<Item> items) {
    this.items = items;
  }

  // Returns a count of items for given priority
  public int getPriorityCount(int priority) {
    int count = 0;

    for(Item item: this.items) {
      if(item.getPriorityLevel() == priority) {
        count++;
      }
    }

    return count;
  }

  // Returns a count of items for value of "isDone" (can be true or false)
  public int getDoneCount(Boolean isDone) {
    int count = 0;

    for(Item item: this.items) {
      if(item.getDone() == isDone) {
        count++;
      }
    }

    return count;
  }




}
