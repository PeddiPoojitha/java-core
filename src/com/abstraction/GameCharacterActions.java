package com.abstraction;

abstract class  GameCharacter{
	String name ;
	String level;
	String healthPoints;
	public GameCharacter(String name, String level, String healthPoints) {
		super();
		this.name = name;
		this.level = level;
		this.healthPoints = healthPoints;
	}
	public abstract void attack();
	public void chooseTarget() {
		System.out.println("Target selected.");
	}
	public void animateAttack() {
		System.out.println( "Attack animation played.");
	}
}
class Warrior extends GameCharacter{
	String WeaponType;

	public Warrior(String name, String level, String healthPoints, String weaponType) {
		super(name, level, healthPoints);
		WeaponType = weaponType;
	}
	@Override
	public void attack() {
		System.out.println( "Performing melee attack with Sword.");
		
	}
}
class Mage extends GameCharacter{
	String spellType;

	public Mage(String name, String level, String healthPoints, String spellType) {
		super(name, level, healthPoints);
		this.spellType = spellType;
	}
	@Override
	public void attack() {
		System.out.println("Casting spell: Fireball.");
		
	}	
}
class Archer extends GameCharacter{
	String arrowType;

	public Archer(String name, String level, String healthPoints, String arrowType) {
		super(name, level, healthPoints);
		this.arrowType = arrowType;
	}
	public void attack() {
		System.out.println("Shooting arrow: Elven Arrow.");
		
	}
	
}

public class GameCharacterActions {

	public static void main(String[] args) {
		GameCharacter game=new Warrior("Conan", "5"," 100", "Sword");
		game.attack();
		game.chooseTarget();
		game.animateAttack();
		System.out.println("=============================================");
		GameCharacter game1=new Mage("puji"," 7", "120", "Fireball");
		game1.attack();
		game1.chooseTarget();
		game1.animateAttack();
		System.out.println("=============================================");
		GameCharacter game2=new Archer("Legolas", "8", "110", "Elven Arrow");
		game2.attack();
		game2.chooseTarget();
		game2.animateAttack();

	}

}
