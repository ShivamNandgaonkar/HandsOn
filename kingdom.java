//Example of Multilevel inheritance
//super class or base class or parent class
package oops;

class kingdom
{
  //fields & methods
	String name;
	public void eat()
	{
		System.out.println("Animal Eat....");
	}
}
//inherit from Animal
class WildDog extends kingdom
{
	//fields & methods of Animal class
	//fields & methods of Dog class
	public void sound()
	{
		System.out.println("Dog Barks....");
	}
}
class Puppy extends WildDog
{
	//fields & methods of Animal class
	//fields & methods of Dog class
	//fields & methods of Puppy class
		public void colour()
		{
			System.out.println("Black & white....");
		}
}
class tree
{
	public static void main(String[] args)
	{
		//creating object of sub class
		Puppy d=new Puppy();
		
		//access fields and methods
		d.name="Moti";
		d.eat();
		d.sound();
		d.colour();
	}

}