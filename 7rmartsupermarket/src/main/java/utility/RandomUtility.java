package utility;

import com.github.javafaker.Faker;

public class RandomUtility {
	
	public String createaFirstName()
	{
		Faker faker = new Faker();
		return faker.name().firstName();
				
	}
	public String createAddress()
	{
		Faker faker = new Faker();
		return faker.address().fullAddress();
				
	}
	
	public String createLastName()
	{
		Faker faker = new Faker();
		return faker.name().lastName();
				
	}
	public String createCountry()
	{
		Faker faker = new Faker();
		return faker.address().country();
				
	}
	public String createCity()
	{
		Faker faker = new Faker();
		return faker.address().city();
				
	}

}
