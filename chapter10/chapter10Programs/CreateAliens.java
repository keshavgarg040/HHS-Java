package chapter10Programs;

public class CreateAliens {
    public static void main(String[] args) {
	Martian maurice = new Martian(3, 4, 2);
	Jupiterian kenneth = new Jupiterian(16, 5, 8);

	System.out.println(maurice.toString());
	System.out.println(kenneth.toString());
    }
}
