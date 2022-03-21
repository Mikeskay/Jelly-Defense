package jellydefense.jellies;

public class BlueJelly extends Jelly {

    public BlueJelly(int health) {
        super(health);
        super.name = "Blue Jelly";
        //TODO Auto-generated constructor stub
    }

    public String getName() {
        return name;
      }


      public String toString(){
          
        return "Jellyfish name: " + name + " Jellyfish health: " + health;
      }

   

} 
    
