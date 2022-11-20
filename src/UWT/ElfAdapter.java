package UWT;

public class ElfAdapter extends Elf implements ICharacter {
	
	public ElfAdapter() {
		super();
	}
	
	@Override
	public void attack(ICharacter other) {
		super.attack((Character) other);
	}
}
