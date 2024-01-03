package btUp_Down;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<Animal> dsAnimal = new ArrayList<Animal>();
		dsAnimal.add(new Cat(5,"Black",2.5));
		dsAnimal.add(new Mouse(3.5));
		dsAnimal.add(new Duck(4.5));
		dsAnimal.add(new RobotCat(85));
		dsAnimal.add(new Cat("Doraemon",18,"Blue",85));
		for (Animal animal : dsAnimal) {
			if(animal instanceof Duck) {
				System.out.print("a duck: ");
			}else if(animal instanceof Mouse) {
				System.out.print("a mouse: ");
			}else if(animal instanceof RobotCat) {
				System.out.print("a robot cat: ");
			}else if(animal instanceof Cat) {
				System.out.print("a cat: ");
			}
			animal.talk();
		}
	}
}
