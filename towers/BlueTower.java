package jellydefense.towers;

import jellydefense.jellies.*;



public class BlueTower extends Tower {
	public BlueTower(){
		super();
		this.name = "Blue Tower";
	}

	@Override
	public int attackJelly(Jelly jelly){

		if (jelly.name.equals("Blue Jelly")){

			switch (level){
				case 1: 
				int blueLevel1Attack = 2 + (int)(Math.random() * ((5 - 2) + 1));
				//System.out.println("Jelly Health before 1: " + jelly.health + " Attack deducted: " + blueLevel1Attack);
				
				return jelly.health = jelly.health - blueLevel1Attack;	
				
				case 2: 
				int blueLevel2Attack = 5 + (int)(Math.random() * ((9 - 5) + 1));
				//System.out.println("Jelly Health before 2: " + jelly.health + " Attack deducted: " + blueLevel2Attack);
				return jelly.health = jelly.health - blueLevel2Attack;	
				
		

				case 3: 
				int blueLevel3Attack = 9 + (int)(Math.random() * ((12 - 9) + 1));
				//System.out.println("Jelly Health before 3: " + jelly.health + " Attack deducted: " + blueLevel3Attack);
				return jelly.health = jelly.health - blueLevel3Attack;	
				
		

				case 4: 
				int blueLevel4Attack = 12 + (int)(Math.random() * ((15 - 12) + 1));
				//System.out.println("Jelly Health before 4: " + jelly.health + " Attack deducted: " + blueLevel4Attack);
				return jelly.health = jelly.health - blueLevel4Attack;	
				
			
			}

		}

		else if (jelly.name.equals("Red Jelly")){

			switch (level){
				case 1: 
				int redLevel1Attack = 0;
				//System.out.println("Jelly Health before 11: " + jelly.health + " Attack deducted: " + redLevel1Attack);
				return jelly.health = jelly.health - redLevel1Attack;	
			
				case 2: 
				int redLevel2Attack = 1;
				//System.out.println("Jelly Health before 22: " + jelly.health + " Attack deducted: " + redLevel2Attack);
				return jelly.health = jelly.health - redLevel2Attack;	
			
				case 3: 
				int redLevel3Attack = 2;
			//	System.out.println("Jelly Health before 33: " + jelly.health + " Attack deducted: " + redLevel3Attack);
				return jelly.health = jelly.health - redLevel3Attack;	
			

				case 4: 
				int redLevel4Attack = 3;
			//	System.out.println("Jelly Health before 44: " + jelly.health + " Attack deducted: " + redLevel4Attack);
				return  jelly.health = jelly.health - redLevel4Attack;	
			
			}



		}
		return jelly.health;
		
 }
}
