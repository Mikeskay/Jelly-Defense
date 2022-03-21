package jellydefense.towers;

import jellydefense.jellies.*;


public class BlueRedTower extends Tower {
	
	public BlueRedTower(){
		super();
		this.name = "Blue Red Tower";
	}
	@Override
	public int attackJelly(Jelly jelly){

			switch (level){
				case 1: 
				int Level1Attack = 2 ;
				//System.out.println("Jelly Health before 1: " + jelly.health + " Attack deducted: " + Level1Attack);
				
				return jelly.health = jelly.health - Level1Attack;	
				
				case 2: 
				int Level2Attack = 2 + (int)(Math.random() * ((4 - 2) + 1));
				//System.out.println("Jelly Health before 2: " + jelly.health + " Attack deducted: " + Level2Attack);
				return jelly.health = jelly.health - Level2Attack;	
				
		

				case 3: 
				int Level3Attack = 4 + (int)(Math.random() * ((6 - 4) + 1));
				//System.out.println("Jelly Health before 3: " + jelly.health + " Attack deducted: " + Level3Attack);
				return jelly.health = jelly.health - Level3Attack;	
				
		

				case 4: 
				int Level4Attack = 6 + (int)(Math.random() * ((8 - 6) + 1));
			//	System.out.println("Jelly Health before 4: " + jelly.health + " Attack deducted: " + Level4Attack);
				return jelly.health = jelly.health - Level4Attack;	
				
			
			}

	
		
		return jelly.health;
		
 }
	
}
