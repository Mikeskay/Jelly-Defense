package jellydefense.test;

import jellydefense.jellies.*;
import jellydefense.towers.*;
import java.util.ArrayList;
import java.util.Collections;


public class TowerCompare {
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
		BlueTower blueTower3 = new BlueTower();
		blueTower3.increaseLevel(); 
		blueTower3.increaseLevel();
		towerList.add(blueTower2);
		towerList.add(new RedTower());
		RedTower redTower1 = new RedTower();
		redTower1.increaseLevel();
		towerList.add(redTower1);
		
		Collections.sort(towerList);

		for (Tower t: towerList) System.out.println(t.name + " " + t.level);
	}
}
