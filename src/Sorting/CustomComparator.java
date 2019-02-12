package Solutions;

import java.util.Comparator;

public class CustomComparator implements Comparator<Contact> 
{
	@Override
	public int compare(Contact c1, Contact c2) 
	{
		return c1.getLastName().compareTo(c2.getLastName());
	}
}
