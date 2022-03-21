package jellydefense.towers;

import jellydefense.jellies.*;

import java.util.*;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Tower implements Comparable<Tower> {

	public static final int LEVEL_1 = 1;
	public static final int LEVEL_2 = 2;
	public static final int LEVEL_3 = 3;
	public static final int LEVEL_4 = 4;

	public int level;
	public String name;



	public Tower(){
		this.level = LEVEL_1;
		name = "Generic Tower";
	}

	public void increaseLevel(){
		if (this.level != LEVEL_4) this.level++;
		else System.out.println("Tower at maximum level");
	}

	@Override
	public int compareTo(Tower other) {
    	if(this.level > other.level)
				return 1;
			else if(this.level < other.level)
				return -1;
			else
				return 0;
	}

/*	public void attacks( Collection <Tower> towers, Jelly jelly){  

			for (int i = 0; i < towers.size(); i++){

				for (int j = 0; jelly.health > 0; j++){

					towers.get(i).attackJelly(jelly);

				   System.out.println("\n" + jelly.name + ": " + jelly.health);
				   System.out.println("attacks: " + j);

					
				}

				

				}
	} */
	

	public abstract int attackJelly(Jelly j);

	public String toString(){
		
		return name + " : Level " + level;
	}


}
