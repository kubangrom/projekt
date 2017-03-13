package kalkulator;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, Exception{
		int a;
		ScriptEngineManager mgr = new ScriptEngineManager();
	    ScriptEngine engine = mgr.getEngineByName("JavaScript");
		System.out.println("Kalkulator");
		System.out.println("MENU\n1.Obliczenia z konsoli\n2.Obliczenia z pliku\n");
		Scanner wybor = new Scanner(System.in);
		a=wybor.nextInt();
		if(a==1)
		{
			String obl;
			do{

				System.out.print("Wpisz obliczenia, ktore chcesz wykonac");
				System.out.print("\n");
				Scanner obliczenie = new Scanner(System.in);
				obl=obliczenie.nextLine();
				System.out.print(obl+"="+engine.eval(obl)+"\n");
			} while (obl.endsWith("end") == false);
			System.out.println("Zakonczyles swoje dane slowem end, program zakonczony");
		}
		if (a==2)
		{
			System.out.println("Obliczenia z pliku");
			File file = new File("C:/Users/99026/workspace/kalkulator/bin/kalkulator/123.txt");
			Scanner in = new Scanner(file);
		    while (in.hasNextLine()) 
		    {
		      String zdanie = in.nextLine();
		      System.out.println(zdanie+"="+engine.eval(zdanie));}

		}
		
	}

}
