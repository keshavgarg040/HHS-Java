/* Alien.java
 * Cooper Cross
 * 9/21/21
 */
package chapter10Programs;

public class Alien {
    protected int eyeAmount;
    protected int armsAmount;
    protected int legsAmount;
    protected String description;

    public int getEyeAmount() {
	return eyeAmount;
    }

    public void setEyeAmount(int eyeAmount) {
	this.eyeAmount = eyeAmount;
    }

    public int getArmsAmount() {
	return armsAmount;
    }

    public void setArmsAmount(int armsAmount) {
	this.armsAmount = armsAmount;
    }

    public int getLegsAmount() {
	return legsAmount;
    }

    public void setLegsAmount(int legsAmount) {
	this.legsAmount = legsAmount;
    }

    public Alien(int eyeAmount, int armsAmount, int legsAmount) {
	setEyeAmount(eyeAmount);
	setArmsAmount(armsAmount);
	setLegsAmount(legsAmount);
    }

    public String toString() {
	description = "The Alien has " + getEyeAmount() + " eyes, " + getArmsAmount() + " arms, and " + getLegsAmount()
		+ " legs.";
	return description;
    }
}
