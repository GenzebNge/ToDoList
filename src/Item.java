import java.util.Random;

public class Item {
  private String name;
  private String category;
  private int priorityLevel;
  private Boolean isDone;

  public Item() {
  }

  public Item(String name, String category, int priorityLevel, Boolean isDone) {
    this.name = name;
    this.category = category;
    this.priorityLevel = priorityLevel;
    this.isDone = isDone;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public int getPriorityLevel() {
    return priorityLevel;
  }

  // Generate random number between 1 and 3 for priority level
  public void setPriorityLevel() {
    Random rand = new Random();
    int priority = rand.nextInt(3) + 1;
    this.priorityLevel = priority;
  }

  public Boolean getDone() {
    return isDone;
  }

  public void setDone(Boolean done) {
    isDone = done;
  }

}
