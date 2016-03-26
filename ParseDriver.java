

public class ParseDriver
{
	public static void main(String[] args)
	{
		String street_A = "4750 Collegiate Dr";
		String city_A = "Panama City";
		String state_A = "FL";
		String street_B = "33 US-98";
		String city_B = "Destin";
		String state_B = "FL";
		ParseAddress parse = new ParseAddress(street_A, city_A, state_A, street_B, city_B, state_B);
	}
}
