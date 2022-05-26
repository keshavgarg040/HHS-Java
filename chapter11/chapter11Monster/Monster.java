package chapter11Monster;

public abstract class Monster {
    protected String name;
    protected String birthPlace;
    protected int age;

    public Monster(String nam, String bP, int ag) {
	name = nam;
	birthPlace = bP;
	age = ag;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getBirthPlace() {
	return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
	this.birthPlace = birthPlace;
    }

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }

    public abstract void scaryFactor();
}
