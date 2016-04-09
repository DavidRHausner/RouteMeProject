/*
Hausner, David
CEN 4021
Assignment 7
03-26-2016
Updated 4-9-2016
*/

//Takes in the form data from a driver (which will be replaced with the form
//data from the app when it is ready) and parses it into a URL that will be
//used by the app and sent to the Google API servers, which will return a set of 
//directions for the user to get from one location to another

//URLs should be in the form: 
//https://www.google.com/maps/dir/[Street Address]+[City]+[State Abbreviation]/[Street Address]+[City]+[State Abbreviation]
//with all spaces replaced with "+".
import java.util.ArrayList;
public class ParseAddress
{
	private String trip_url;


  public ParseAddress(String street_A, String city_A, String state_A, String street_B, String city_B, String state_B)
  {
  	this.trip_url = "https://www.google.com/maps/dir/" + street_A.replace(' ','+') + "+" + city_A.replace(' ','+') + "+" + state_A.replace(' ','+') + "/";
  	this.trip_url += street_B.replace(' ','+') + "+" + city_B.replace(' ','+') + "+" + state_B.replace(' ','+');
  	getURL();
  }
  //Takes in an ArrayList with addresses grouped in bunches of three (street, city, state) and returns the extended route URL.
  //The only caveat is that any information not entered by the user must be sent to this program as a "" (empty string). Otherwise
  //the numbering is thrown off.
  public ParseAddress(ArrayList<String> addresses)
  {
  	String street;
  	String city;
  	String state;
  	int counter = 0;
  	this.trip_url = "https://www.google.com/maps/dir/";
  	while ((3*counter) < addresses.size()-1)
  	{
  		street = addresses.get(3*counter);
  		city = addresses.get(3*counter+1);
  		state = addresses.get(3*counter+2);
  		this.trip_url += street.replace(' ','+') + "+" + city.replace(' ','+') + "+" + state.replace(' ','+') + "/";
  		counter++;
  	}
  	getURL();
  }
  public String getURL()
  {
  	return trip_url;
  }
}
