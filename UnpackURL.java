/*
Hausner, David
CEN 4021
04-9-2016
*/

//Takes in URL data created at one time or another from the ParseAddress class and unpacks it into
//its constituent addresses.
//It then returns those addresses (without formatting, unfortunately) as strings in an ArrayList<String>

//URLs should be in the form: 
//https://www.google.com/maps/dir/[Street Address]+[City]+[State Abbreviation]/[Street Address]+[City]+[State Abbreviation]/.....
//with all spaces replaced with "+".
import java.util.ArrayList;
public class UnpackURL
{
	private ArrayList<String> Addresses = new ArrayList<String>();

  public UnpackURL(String trip_url)
  {
  	String locations = trip_url.substring(32);
    String place;
    while(locations.length() > 0)
    {
      place = locations.substring(0,locations.indexOf("/"));
      Addresses.add(place.replace("+", " ").replace("  ", ""));
      locations = locations.substring(locations.indexOf("/")+1);
    }
  	getArrayList();
  }

  public ArrayList getArrayList()
  {
    System.out.println(Addresses);
  	return Addresses;
  }
}