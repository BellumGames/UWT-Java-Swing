package UWT;

public class OrcAdapter extends Orc implements ICharacter {
	
	public OrcAdapter() {
		super();
	}
	
	@Override
	public void attack(ICharacter other) {
		super.attack((Character) other);
	}
}
