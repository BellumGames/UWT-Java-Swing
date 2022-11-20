package UWT;

public class WizardAdapter extends Wizard implements ICharacter {

    public WizardAdapter() {
        super();
    }

    @Override
    public void attack(ICharacter other) {
        super.attack((Character) other);
    }
}
