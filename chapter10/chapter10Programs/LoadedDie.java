/* LoadedDie.java
 * Cooper Cross
 * 9/28/21
 */
package chapter10Programs;

public class LoadedDie extends Die {
    public LoadedDie() {
	value = ((int) (Math.random() * 100) % 6 + 2);
    }
}
