package UWT;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class Arena extends JFrame {
	private List<ICharacter> characters = new LinkedList<ICharacter>();

	public Arena(){
		super();
		setLayout(new GridLayout(1,1));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(1500,1500));
		//setSize(1500,1500);
		setVisible(true);
		setTitle("UWT");
	}

	public void generateGUI(String attacker, String defender, JPanel panel){
		JPanel jp = new JPanel();

		JLabel dragonFrame = new JLabel();
		JLabel elfFrame = new JLabel();
		JLabel orcFrame = new JLabel();
		JLabel vikingFrame = new JLabel();
		JLabel wizardFrame = new JLabel();
		JLabel arrowFrame = new JLabel();

		dragonFrame.setIcon(new ImageIcon("resources/dragon.png"));
		elfFrame.setIcon(new ImageIcon("resources/elf.png"));
		orcFrame.setIcon(new ImageIcon("resources/orc.png"));
		vikingFrame.setIcon(new ImageIcon("resources/viking.png"));
		wizardFrame.setIcon(new ImageIcon("resources/wizard.png"));
		arrowFrame.setIcon(new ImageIcon("resources/arrow.png"));

		if(attacker.equals("Dragon")){
			if(defender.equals("Dragon")){
				jp.add(dragonFrame);
				jp.add(arrowFrame);
				jp.add(dragonFrame);
				panel.add(jp);
			}
			if(defender.equals("Elf")){
				jp.add(dragonFrame);
				jp.add(arrowFrame);
				jp.add(elfFrame);
				panel.add(jp);
			}
			if(defender.equals("Orc")){
				jp.add(dragonFrame);
				jp.add(arrowFrame);
				jp.add(orcFrame);
				panel.add(jp);
			}
			if(defender.equals("Viking")){
				jp.add(dragonFrame);
				jp.add(arrowFrame);
				jp.add(vikingFrame);
				panel.add(jp);
			}
			if(defender.equals("Wizard")){
				jp.add(dragonFrame);
				jp.add(arrowFrame);
				jp.add(wizardFrame);
				panel.add(jp);
			}
		}
		if(attacker.equals("Elf")){
			if(defender.equals("Dragon")){
				jp.add(elfFrame);
				jp.add(arrowFrame);
				jp.add(dragonFrame);
				panel.add(jp);
			}
			if(defender.equals("Elf")){
				jp.add(elfFrame);
				jp.add(arrowFrame);
				jp.add(elfFrame);
				panel.add(jp);
			}
			if(defender.equals("Orc")){
				jp.add(elfFrame);
				jp.add(arrowFrame);
				jp.add(orcFrame);
				panel.add(jp);
			}
			if(defender.equals("Viking")){
				jp.add(elfFrame);
				jp.add(arrowFrame);
				jp.add(vikingFrame);
				panel.add(jp);
			}
			if(defender.equals("Wizard")){
				jp.add(elfFrame);
				jp.add(arrowFrame);
				jp.add(wizardFrame);
				panel.add(jp);
			}
		}
		if(attacker.equals("Orc")){
			if(defender.equals("Dragon")){
				jp.add(orcFrame);
				jp.add(arrowFrame);
				jp.add(dragonFrame);
				panel.add(jp);
			}
			if(defender.equals("Elf")){
				jp.add(orcFrame);
				jp.add(arrowFrame);
				jp.add(elfFrame);
				panel.add(jp);
			}
			if(defender.equals("Orc")){
				jp.add(orcFrame);
				jp.add(arrowFrame);
				jp.add(orcFrame);
				panel.add(jp);
			}
			if(defender.equals("Viking")){
				jp.add(orcFrame);
				jp.add(arrowFrame);
				jp.add(vikingFrame);
				panel.add(jp);
			}
			if(defender.equals("Wizard")){
				jp.add(orcFrame);
				jp.add(arrowFrame);
				jp.add(wizardFrame);
				panel.add(jp);
			}
		}
		if(attacker.equals("Viking")){
			if(defender.equals("Dragon")){
				jp.add(vikingFrame);
				jp.add(arrowFrame);
				jp.add(dragonFrame);
				panel.add(jp);
			}
			if(defender.equals("Elf")){
				jp.add(vikingFrame);
				jp.add(arrowFrame);
				jp.add(elfFrame);
				panel.add(jp);
			}
			if(defender.equals("Orc")){
				jp.add(vikingFrame);
				jp.add(arrowFrame);
				jp.add(orcFrame);
				panel.add(jp);
			}
			if(defender.equals("Viking")){
				jp.add(vikingFrame);
				jp.add(arrowFrame);
				jp.add(vikingFrame);
				panel.add(jp);
			}
			if(defender.equals("Wizard")){
				jp.add(vikingFrame);
				jp.add(arrowFrame);
				jp.add(wizardFrame);
				panel.add(jp);
			}
		}
		if(attacker.equals("Wizard")){
			if(defender.equals("Dragon")){
				jp.add(wizardFrame);
				jp.add(arrowFrame);
				jp.add(dragonFrame);
				panel.add(jp);
			}
			if(defender.equals("Elf")){
				jp.add(wizardFrame);
				jp.add(arrowFrame);
				jp.add(elfFrame);
				panel.add(jp);
			}
			if(defender.equals("Orc")){
				jp.add(wizardFrame);
				jp.add(arrowFrame);
				jp.add(orcFrame);
				panel.add(jp);
			}
			if(defender.equals("Viking")){
				jp.add(wizardFrame);
				jp.add(arrowFrame);
				jp.add(vikingFrame);
				panel.add(jp);
			}
			if(defender.equals("Wizard")){
				jp.add(wizardFrame);
				jp.add(arrowFrame);
				jp.add(wizardFrame);
				panel.add(jp);
			}
		}
	}

	public static void main(String[] args) 	{
		   Arena t = new Arena();
		   JPanel panel = new JPanel();
		   JScrollPane scroll = new JScrollPane(panel);
		   
		   VikingAdapter viking = new VikingAdapter();
		   ElfAdapter elf = new ElfAdapter();
		   DragonAdapter dragon = new DragonAdapter();
		   OrcAdapter orc = new OrcAdapter();
		   WizardAdapter wizard = new WizardAdapter();

		   t.characters.add(viking);
		   t.characters.add(dragon);
		   t.characters.add(elf);
		   t.characters.add(orc);
		   t.characters.add(wizard);
		   
		   int i = 0;
		   
		   while(i < t.characters.size()) {
			   t.characters.get(i).attack(t.characters.get((i + 1)% t.characters.size()));
			   t.generateGUI(t.characters.get(i).getName(),t.characters.get((i + 1)% t.characters.size()).getName(),panel);

			   if(t.characters.get((i + 1)% t.characters.size()).getHp() <= 0) {
				   t.characters.remove((i + 1)% t.characters.size());
			   }
			   i++;
			   if(i>=t.characters.size()) {
				   i = 0;
			   }
			   if(t.characters.size()==1) {
				   System.out.println("The winner and the ultimate champion is: " + t.characters.get(0).getName());
				   System.out.println();
			   }
		   }
		   t.add(panel);
		   System.out.println("Conclusion: You are your own enemy!");
	}
}
