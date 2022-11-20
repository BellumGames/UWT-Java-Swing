package UWT;

public class VikingAdapter extends Viking implements ICharacter {
	
	public VikingAdapter() {
		super();
	}
	
	@Override
	public void attack(ICharacter other) {
		super.attack((Character) other);
	}
}
