package utility;

import com.github.javafaker.Faker;

public class RandomUtility {
	
	public String createaFirstName()
	{
		Faker faker = new Faker();
		return faker.name().firstName();
				
	}

}
