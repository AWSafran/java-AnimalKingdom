package AnimalKingdom;

import java.util.ArrayList;
import java.util.Comparator;

public class Main
{

	public static void printAnimals(ArrayList<AbstractAnimal> animals, CheckAnimal tester)
	{
		for (AbstractAnimal a : animals)
		{
			if (tester.test(a))
			{
				System.out.println(a.getName());
			}
		}
	}

	public static void main(String[] args)
	{
		//Creating animals
		Mammal panda = new Mammal("Panda", 1869);
		Mammal zebra = new Mammal("Zebra", 1778);
		Mammal koala = new Mammal("Koala", 1816);
		Mammal sloth = new Mammal("Sloth", 1804);
		Mammal armadillo = new Mammal("Armadillo", 1758);
		Mammal raccoon = new Mammal("Raccoon", 1758);
		Mammal bigfoot = new Mammal("Bigfoot", 2021);

		Bird pigeon = new Bird("Pigeon", 1837);
		Bird peacock = new Bird("Peacock", 1821);
		Bird toucan = new Bird("Toucan", 1758);
		Bird parrot = new Bird("Parrot", 1824);
		Bird swan = new Bird("Swan", 1758);

		Fish salmon = new Fish("Salmon", 1758);
		Fish catfish = new Fish("Catfish", 1817);
		Fish perch = new Fish("Perch", 1758);

		ArrayList<AbstractAnimal> allAnimals = new ArrayList<AbstractAnimal>();

		allAnimals.add(panda);
		allAnimals.add(zebra);
		allAnimals.add(koala);
		allAnimals.add(sloth);
		allAnimals.add(armadillo);
		allAnimals.add(raccoon);
		allAnimals.add(bigfoot);
		allAnimals.add(pigeon);
		allAnimals.add(peacock);
		allAnimals.add(toucan);
		allAnimals.add(parrot);
		allAnimals.add(swan);
		allAnimals.add(salmon);
		allAnimals.add(catfish);
		allAnimals.add(perch);

		// for(AbstractAnimal a : allAnimals)
		// {
		// 	System.out.println(a.getName());
		// }

		System.out.println();
		System.out.println("List all animals in descending order by year named");
		System.out.println();

		allAnimals.sort((a1, a2) -> a2.getYear() - a1.getYear());

		for(AbstractAnimal a : allAnimals)
		{
			System.out.println(a.getYear() + ": " + a.getName());
		}

		System.out.println("\nList all animals alphabetically\n");

		allAnimals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));

		for(AbstractAnimal a : allAnimals)
		{
			System.out.println(a.getName());
		}

		System.out.println();
		System.out.println("List all animals in order of movement");
		System.out.println();

		allAnimals.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));

		for(AbstractAnimal a : allAnimals)
		{
			System.out.println(a.getName() + " moves by " + a.move() + "ing");
		}

		System.out.println();
		System.out.println("List animals that use lungs");
		System.out.println();

		printAnimals(allAnimals, a -> a.breath() == "lungs");
	}
} 