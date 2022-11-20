package UWT;

public abstract class Character {
	public String name;
	public int hp;
	public int damage;

	public 	Character() {
		this.name = "A simple character";
		this.hp = 1000;
		this.damage = 100;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public void attack(Character other) {
		System.out.println("I am a " + getName() + " my hp is " + getHp() + " and my damage is " + getDamage());
		System.out.println("And I, " + getName() + ", will attack a " + other.getName() + " damage taken: -" + getDamage() + ")");
		other.setHp(other.getHp() - getDamage());
		if(other.getHp() <= 0) {
			System.out.println(getName() + " eliminated " + other.getName());
		}
		System.out.println();
	}
}
