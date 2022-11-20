package UWT;

public class Viking extends Character {	
	public Viking() {
		super();
		this.name = "Viking";
		this.hp = 2000;
		this.damage = 400;
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
		System.out.println("As an Viking I can do quadruple damage if I hit a Dragon");
		System.out.println(getName() + " will attack a " + other.getName());
		if(other.getName().equals("Dragon")){
			System.out.println("Aaaaaaahhh!!! Going BERSERKER!!!");
			other.setHp(other.getHp() - (getDamage()*4));
			System.out.println("Damage taken: " + "-" + (getDamage()*4));
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


