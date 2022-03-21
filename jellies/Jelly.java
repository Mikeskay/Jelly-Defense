package jellydefense.jellies;

/*
 * The Jelly class model
 */
public abstract class Jelly {

  // The Protected instance variables
// to indicate which colour the Jelly is.
  public int health; // health of the Jelly (max health is 100, minimum health is 0).
  public String name;
  

  // The constructor
  public Jelly(int health) {
     this.health = this.setHealth(health);
     this.name = "Generic Jelly";
  }

  // The public getters and setters for the private instance variables.
  // No setter for name and gender as they are not designed to be changed.

  public int getHealth() {
      return health;
	}

  public String getName() {
    return name;
}

  public int setHealth(int health){
      if (health < 0)
          return 0;
      else if (health > 100)
          return 100;
      else
          return health;

}

public boolean isAlive() {
   
  boolean alive;

   if (this.health > 0  ){
      System.out.println("This Jellyfish is alive");
      alive = true;
   } else {
      System.out.println("This Jellyfish is dead");
      alive = false;
   }

 return alive;
}


  // The toString() describes itself
  public String toString() {
     return   " Health:" + health;
  }
}
