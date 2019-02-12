package Solutions;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a description of class AddressBook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AddressBook
{
    List<Contact> book;
    
    public AddressBook()
    {
        book = new ArrayList<Contact>();
    }
    
    public void add(Contact c)
    {
    	book.add(c);
        Collections.sort(book, new CustomComparator());
    }
    
    public int remove(String fn, String ln)
    {
    }
    
    @Override
    public String toString()
    {
        String s = "";
        
        for(Contact c: book)
        {
            s += c;
            s += "\n";
        }
        
        return s;
    }
}
