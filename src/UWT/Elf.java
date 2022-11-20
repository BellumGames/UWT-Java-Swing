package UWT;

public class Elf extends Character{
	public Elf() {
		super();
		this.name = "Elf";
		this.hp = 2500;
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
		System.out.println("As an Elf I can do triple damage if I hit a Orc");
		System.out.println(getName() + " will attack a " + other.getName());
		if(other.getName().equals("Orc")){
			System.out.println("Hehe I never miss my shoots, Orc be ready!");
			other.setHp(other.getHp() - (getDamage()*3));
			System.out.println("Damage taken: " + "-" + (getDamage()*3));
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
