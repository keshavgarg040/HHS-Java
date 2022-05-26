package chapter11Test;

public abstract class SuperHero implements Transportation {
    private String name;
    private int age;
    protected int coolness;
    protected String transportation;

    public SuperHero(String nam, int ag) {
	setName(nam);
	setAge(ag);
	setCoolness();
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }

    public int getCoolness() {
	return coolness;
    }

    public abstract void setCoolness();

}
