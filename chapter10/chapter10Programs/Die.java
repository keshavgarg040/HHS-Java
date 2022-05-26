/* Die.java
 * Cooper Cross
 * 9/27/21
 */
package chapter10Programs;

public class Die {
    protected int value;

    public Die() {
	value = ((int) (Math.random() * 100) % 6 + 1);
    }

    public int getValue() {
	return value;
    }
}
