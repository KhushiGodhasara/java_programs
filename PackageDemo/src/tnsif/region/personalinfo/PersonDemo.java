package personalinfo;

import countrystatepack.*;

public class PersonDemo {

	public static void main(String[] args) {
		City c = new City();
		c.setCname("Junagadh");
		
		Country cn = new Country();
		cn.setCname("India");
		
		Person p = new Person();
		p.setPname("Khushi");
		
		String CityName = c.getCname();
		String CountryName = cn.getCname();
		String PersonName = p.getPname();
		
		System.out.println("City : " + CityName);
		System.out.println("Country : " + CountryName);
		System.out.println("Person : " + PersonName);
	}

}
