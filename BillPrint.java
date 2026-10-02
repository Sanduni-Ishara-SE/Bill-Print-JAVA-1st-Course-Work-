import java.util.*;
class BillPrint{
	public static void main(String args[]){
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("=================================================================================");
		System.out.println(" ");
		System.out.println("__          __  _                            _          _ __  __            _");
		System.out.println("\\ \\        / / | |                          | |        (_)  \\/  |          | |");
		System.out.println(" \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___  | |_ ___    _| \\  / | __ _ _ __| |_");
		System.out.println("  \\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ ' _ \\ / _ \\ | __/ _ \\  | | |\\/| |/ _' | '__| __|");
		System.out.println("   \\  /\\  /  __/ | ( | (_) | | | | | |  __/ | || (_) | | | |  | | ( | | |  | |_");
		System.out.println("    \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___| \\__ \\___/  |_|_|  |_|\\__,_|_|   \\__|");
		System.out.println(" ");
		System.out.println("=================================================================================");
		System.out.println(" ");
		
		System.out.print("Enter Customer Phone Number - ");
		String phoneNumber = input.next();
		
		System.out.println();
		
		System.out.print("Enter Customer Name - ");
		String Name = input.next();
		
		System.out.println('\n');
		
		System.out.println("================================================================================= \n");
		
		System.out.print("BasmathiQty(Kg) - ");
		int BasmathiQty = input.nextInt();
		
		System.out.println();
		
		System.out.print("DhalQty(Kg) - ");
		int DhalQty = input.nextInt();
		
		System.out.println();
		
		System.out.print("SugerQty(Kg) - ");
		int SugerQty = input.nextInt();
		
		System.out.println();
		
		System.out.print("HighlandQty(Kg) - ");
		int HighlandQty = input.nextInt();
		
		System.out.println();
		
		System.out.print("YughurtQty(Kg) - ");
		int YughurtQty = input.nextInt();
		
		System.out.println();
		
		System.out.print("FlourQty(Kg) - ");
		int FlourQty = input.nextInt();
		
		System.out.println();
		
		System.out.print("SoapQty(Kg) - ");
		int SoapQty = input.nextInt();
		
		//Define Prices
		
		double BasmathiPrice = 250.00;
		double DhalPrice = 180.00;
		double SugerPrice = 150.00;
		double HighlandPrice = 1200.00;
		double YughurtPrice = 50.00;
		double FlourPrice = 120.00;
		double SoapPrice = 160.00;
		
		//Calculate Item Total Price
		
		double totBasmathi = BasmathiPrice * BasmathiQty;
		double totDhal = DhalPrice * DhalQty;
		double totSuger = SugerPrice * SugerQty;
		double totHighland = HighlandPrice * HighlandQty;
		double totYughurt = YughurtPrice * YughurtQty;
		double totFlour = FlourPrice * FlourQty;
		double totSoap = SoapPrice * SoapQty;
		
		//Calculate Total Value
		
		double total = totBasmathi + totDhal + totSuger + totHighland + totYughurt + totFlour + totSoap;
		
		//Calculate Discount
		
		double discount = total * 0.1;
		
		System.out.println();
		
		System.out.println("+-------------------------------------------------------------------------------+");
		System.out.println("|                  _   __  __          ____  ________                           |");
		System.out.println("|                 (_) |  \\/  |   /\\   |  _  \\__   __|                           | ");
		System.out.println("|                  _  | \\  / |  /  \\  | |_) |  | |                              |");
		System.out.println("|                 | | | |\\/| | / /\\ \\ |  _  /  | |                              |");
		System.out.println("|                 | | | |  | |/ ___  \\| | \\ \\  | |                              |");
		System.out.println("|                 |_| |_|  |_/_/   \\_ \\_|  \\ \\ |_|                              |");
		System.out.println("|                      225,Galle Road,Panadura                                  |");
		System.out.println("|                                                                               |");
		System.out.println("+-------------------------------------------------------------------------------+");
		System.out.printf("|                              #Tell : %-39s  | \n",phoneNumber);
		System.out.printf("|                              #Name : %-39s  | \n",Name);   
		System.out.println("+---------------------+------------------+-------------------+------------------+");
		System.out.println("|                     |       Qty        |     Unit Price    |      Price       |");
		System.out.println("+---------------------+------------------+-------------------+------------------+");
		
		System.out.printf ("|     #Basmathi       |       %-5d      |     %-6.0f        |      %-7.2f     |\n", BasmathiQty , BasmathiPrice , totBasmathi);
		System.out.println("+---------------------+------------------+-------------------+------------------+");
		System.out.printf ("|     #Dhal           |       %-5d      |     %-6.0f        |      %-7.2f     |\n", DhalQty , DhalPrice , totDhal);
		System.out.println("+---------------------+------------------+-------------------+------------------+");
		System.out.printf ("|     #Suger          |       %-5d      |     %-6.0f        |      %-7.2f     |\n", SugerQty , SugerPrice , totSuger);
		System.out.println("+---------------------+------------------+-------------------+------------------+");
		System.out.printf ("|     #Highland       |       %-5d      |     %-6.0f        |      %-7.2f     |\n", HighlandQty , HighlandPrice , totHighland);
		System.out.println("+---------------------+------------------+-------------------+------------------+");
		System.out.printf ("|     #Yughurt        |       %-5d      |     %-6.0f        |      %-7.2f     |\n", YughurtQty , YughurtPrice , totYughurt);
		System.out.println("+---------------------+------------------+-------------------+------------------+");
		System.out.printf ("|     #Flour          |       %-5d      |     %-6.0f        |      %-7.2f     |\n", FlourQty , FlourPrice , totFlour);
		System.out.println("+---------------------+------------------+-------------------+------------------+");
		System.out.printf ("|     #Soap           |       %-5d      |     %-6.0f        |      %-7.2f     |\n", SoapQty , SoapPrice , totSoap); 
		System.out.println("+---------------------+------------------+-------------------+------------------+");
		System.out.printf ("|                                        | Total             | %-15.2f  | \n" , total);
		System.out.println("+                                        +-------------------+------------------+");
		System.out.printf ("|                                        | Discount          | %-15.2f  | \n" , discount);
		System.out.println("+                                        +-------------------+------------------+");
		System.out.printf ("|                                        | Price             | %-15.2f  | \n" , total - discount);
		System.out.println("+----------------------------------------+-------------------+------------------+");
		
		System.out.println();
		System.out.println("");
		
		System.out.print("Enter Custormer cash -");
		double cash = input.nextDouble();
		System.out.println();
		
		double Netamount = total-discount;
		double Change = cash-Netamount;
		int value = (int) Change;
		
		System.out.println("+-----------------+--------------------+");
		System.out.printf("|    Net Amount   |  %-17.2f |\n",total-discount);
		System.out.println("+-----------------+--------------------+");
		System.out.printf("|    Cash         |  %-17.2f |\n",cash);
		System.out.println("+-----------------+--------------------+");
		System.out.printf("|    Change       |  %-17.2f |\n",cash-Netamount);
        System.out.println("+-----------------+--------------------+");
        
        System.out.println();
        System.out.println();
	    
	    int change = (int) value;
	    
	    int note5000 = change / 5000;
	    change = change % 5000;
	    
	    int note2000 = change / 2000;
	    change = change % 2000;
	    
	    int note1000 = change / 1000;
	    change = change % 1000;
	    
	    int note500 = change / 500;
	    change = change % 500;
	    
	    int note100 = change / 100;
	    change = change % 100;
	    
	    int note50 = change / 50;
	    change = change % 50;
	    
	    int note20 = change / 20;
	    change = change % 20;
	    
	    int note10 = change / 10;
	    change = change % 10;
	    
	    int note5 = change / 5;
	    change = change % 5;
	    
	    int note2 = change / 2;
	    change = change % 2;
	    
	    int note1 = change /1;
	    change = change % 1;
	    
	    int nonote = note5000+note2000+note1000+note500+note100+note50+note20;
	    int nocoins = note10+note5+note2+note1;
	    
		System.out.println("+-----------------+-----------------+");
		System.out.println("|      Value      |        No       |");
		System.out.println("+-----------------+-----------------+");
		System.out.printf("|     Rs.5000     |        %-9d|\n ",note5000);
		System.out.println("+-----------------+----------------+");
		System.out.printf("|     Rs.2000     |        %-9d|\n ",note2000);
		System.out.println("+-----------------+----------------+");
		System.out.printf("|     Rs.1000     |        %-9d|\n ",note1000);
		System.out.println("+-----------------+----------------+");
		System.out.printf("|     Rs.500      |        %-9d|\n ",note500);
		System.out.println("+-----------------+----------------+");
		System.out.printf("|     Rs.100      |        %-9d|\n ",note100);
		System.out.println("+-----------------+----------------+");
		System.out.printf("|     Rs.50       |        %-9d|\n ",note50);
		System.out.println("+-----------------+----------------+");
		System.out.printf("|     Rs.20       |        %-9d|\n ",note20);
		System.out.println("+-----------------+----------------+");
		System.out.printf("|     Rs.10       |        %-9d|\n ",note10);
		System.out.println("+-----------------+----------------+");
		System.out.printf("|     Rs.5        |        %-9d|\n ",note5);
		System.out.println("+-----------------+----------------+");
		System.out.printf("|     Rs.2        |        %-9d|\n ",note2);
		System.out.println("+-----------------+----------------+");
		System.out.printf("|     Rs.1        |        %-9d|\n ",note1);
		System.out.println("+-----------------+----------------+");
		System.out.printf("|     No of Notes |        %-9d|\n",nonote);
		System.out.println("+-----------------+-----------------+");
		System.out.printf("|     No of Coins |        %-9d|\n",nocoins);
		System.out.println("+-----------------+-----------------+");
		System.out.println();
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println("      THANK YOU FOR SHOPPING WITH US        ");
		System.out.println("--------------------------------------------");
		         
		
	}
}
