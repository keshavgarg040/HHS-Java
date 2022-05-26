package chapter11Test;

import javax.swing.JOptionPane;

public class SuperHeroDemo {
    public static void main(String[] args) {
	String powerHeroName = JOptionPane.showInputDialog("Super power hero's name: ");
	int powerHeroAge = Integer.parseInt(JOptionPane.showInputDialog("Super power hero's age: "));
	SuperPowerHero powerHero = new SuperPowerHero(powerHeroName, powerHeroAge);
	String weaponHeroName = JOptionPane.showInputDialog("Super weapon hero's name: ");
	int weaponHeroAge = Integer.parseInt(JOptionPane.showInputDialog("Super weapon hero's age: "));
	SuperWeaponHero weaponHero = new SuperWeaponHero(weaponHeroName, weaponHeroAge);
	JOptionPane.showMessageDialog(null, powerHero.toString());
	JOptionPane.showMessageDialog(null, weaponHero.toString());
    }
}
