package AnimalKingdom;

public abstract class AbstractAnimal
{
	private int id;
	private static int maxId = 0;
	private String name;
	private int year;

	public AbstractAnimal(String name, int year)
	{
		maxId++;
		id = maxId;
		this.name = name;
		this.year = year;
	}

	//getters and setters

	public int getId()
	{
		return id;
	}

	public int getYear()
	{
		return year;
	}

	public void setYear(int year)
	{
		this.year = year;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	//other functions

	public String eat()
	{
		return name + " eats food!";
	}

	public String breath()
	{
		return "lungs";
	}

	public String reproduce()
	{
		return "eggs";
	}

	public abstract String move();
}