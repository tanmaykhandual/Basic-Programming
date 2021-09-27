package BasicPgm;

class Animal
{
	void MakeSound()
	{
		System.out.println("making sound");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Bow Bow");
	}
}
class Cat extends Animal
{
	void Killrat()
	{
		System.out.println("done");
	}
}

public class Upcasting {

	public static void main(String[] args) {
		Animal a;
		a=new Dog();
		a.MakeSound();
		
	}
}


