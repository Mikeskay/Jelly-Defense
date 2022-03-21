package jellydefense.test;

import jellydefense.jellies.*;
import jellydefense.towers.*;
import java.util.ArrayList;

public class TowerTest {
	public static void main (String[] args){
		ArrayList<Tower> towerList = new ArrayList<Tower>();
		
		towerList.add(new BlueRedTower());
		BlueTower blueTower1 = new BlueTower();
		blueTower1.increaseLevel();
		towerList.add(blueTower1);
		BlueTower blueTower2 = new BlueTower();
		blueTower2.increaseLevel(); 
		blueTower2.increaseLevel();
		blueTower2.increaseLevel();

		towerList.add(blueTower2);
		towerList.add(new RedTower());
		
		
		for (Tower t: towerList) System.out.println(t);
	}
}
