package UWT;

public class DragonAdapter extends Dragon implements ICharacter {
	
	public DragonAdapter() {
		super();
	}
	
	@Override
	public void attack(ICharacter other) {
		super.attack((Character) other);
	}
}
