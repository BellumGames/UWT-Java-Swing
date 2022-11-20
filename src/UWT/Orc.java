package UWT;

public class Orc extends Character {
	public Orc() {
		super();
		this.name = "Orc";
		this.hp = 3500;
		this.damage = 350;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int getHp() {
		return hp;
	}
	@Override
	public void setHp(int hp) {
		this.hp = hp;
	}
	@Override
	public int getDamage() {
		return damage;
	}
	@Override
	public void setDamage(int damage) {
		this.damage = damage;
	}
	@Override
	public void attack(Character other) {
		System.out.println("I am a " + getName() + " my hp is " + getHp() + " and my damage is " + getDamage());
		System.out.println("As an Orc I can do double damage if I hit a Viking");
		System.out.println(getName() + " will attack a " + other.getName());
		if(other.getName().equals("Viking")){
			System.out.println("Mrrrrr... Viking prepare to die!");
			other.setHp(other.getHp() - (getDamage()*2));
			System.out.println("Damage taken: " + "-" + (getDamage()*2));
		}
		else{
			other.setHp(other.getHp() - getDamage());
			System.out.println("Damage taken: " + "-" + getDamage());
		}

		if(other.getHp() <= 0) {
			System.out.println(getName() + " eliminated " + other.getName());
		}
		System.out.println();
	}
}
