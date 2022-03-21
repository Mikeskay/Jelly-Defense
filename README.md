# Task Title: Jelly Defense 

# Task Description: 
The following essential and optional exercises are based on the game Jelly Defense (for
IPhone/Andriod). It is a game where there are different kinds of Towers and Jellies. Through the game, Towers can attack Jellies and cause damage to them.


- Inheritance to represent the two different kinds of Jellies, i.e., a subclass for
BlueJelly and RedJelly.

- Information hiding and access control methods. Ensure that the health of a Jelly is between 100 and 0.

- Implement suitable constructors for the classes which initialize the health with 100. Implement a second constructor which takes an initial health score as a
parameter 

- Also provide a method: boolean isAlive(), that checks to see if a Jelly is alive or dead (health of 0 indicates a Jelly is dead).

Write an appropriate JellyTest class which creates one Jelly of each type one with
health 100 and one with health 0. Print for each of them if they are alive.

Add a method to Tower: int attackJelly(). 
This method should have no implementation in Tower, but should force all child classes to implement it. This
method should:

- Print out the type of tower and the damage done to a Jelly (depending on the
type of Tower: BlueTower and RedTower have 2 points damage, BlueRedTower
has 1 point damage).

- Return the value of damage done (BlueTower and RedTower have 2 points
damage, BlueRedTower has 1 point damage)

- Code attackJelly so that it attacks in a Jelly (Hint: it needs the information on what Jelly
is attacked as a parameter).

Create a new test file TowerAttack.java that creates an ArrayList of 10 different
types of Jellies, an ArrayList of 5 different towers of random power levels. After that
you allow all the towers to attack the Jellies until they are dead.

All tower types can attack all Jellies with the following rules:

![image](https://user-images.githubusercontent.com/47972946/159370557-d252ac3e-d97c-4aec-8087-b9a3620aeee1.png)





