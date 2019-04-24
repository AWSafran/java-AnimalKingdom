package AnimalKingdom;

public class Mammal extends AbstractAnimal
{
	public Mammal(String name, int year)
	{
		super(name, year);
	}

	@Override
	public String move()
	{
		return "walk";
	}

	@Override
	public String reproduce()
	{
		return "live births";
	}
}