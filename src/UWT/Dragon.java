package UWT;

public class Dragon extends Character{
	public Dragon() {
		super();
		this.name = "Dragon";
		this.hp = 5000;
		this.damage = 1000;
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
		System.out.println("As an Dragon I can heal myself with a quarter of life of a Elf if I hit him");
		System.out.println(getName() + " will attack a " + other.getName());
		if(other.getName().equals("Elf")){
			System.out.println("Uaaaghhhh! Come at me little pointy ear!");
			other.setHp(other.getHp() - getDamage());
			setHp(getHp() + other.getHp()/4);
			System.out.println("Damage taken: " + "-" + getDamage());
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
