package AnimalKingdom;

public class Fish extends AbstractAnimal
{
	public Fish(String name, int year)
	{
		super(name, year);
	}

	@Override
	public String move()
	{
		return "swim";
	}

	@Override
	public String breath()
	{
		return "gills";
	}
}