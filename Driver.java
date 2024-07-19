
public class Driver
{
	public static void main(String [] args)
	{
		CellUser [] clients = new CellUser[5];
		clients[0] = new PrepaidUser("Godfrey Mokoena"," 2 Lonjumpstreet", "Potchefstroom",2520, "Cell-C","0780191000",300,15,2);
		clients[1] = new ContractUser("Wade van Niekerk","4 longroad", "Klerksdorp",2500, "Vodacom","08335423123","13/2/17", "Weekend plus100", "Nokia", 64,2);
		clients[2] = new PrepaidUser("Castor Semenya","7 Fastlane", "Mahikeng",1234,"MTN","0823542333",300,55,6);
		clients[3] = new ContractUser("Akani Simbine","23 Sprintlane", "Johannesburg",2000,"Cell-C", "0772361537","12/5/17", "Topup 500", "Samsung", 147,60);
		clients[4] = new PrepaidUser("Luvo Manyonga","1 Sand street", "Carletonville",2000,"MTN","0842222525",579,17,2);
		
		
		
	    System.out.println(" All Clients");
		
		for(int i = 0; i <5; i++)
		{
			System.out.println("\n");
			System.out.println(clients[i]);
			System.out.println("\n");
			System.out.println(clients[i].showAccount());
		}
		
	
			
	}
}