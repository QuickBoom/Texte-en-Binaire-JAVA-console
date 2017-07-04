package texte_en_BL;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Trad {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("--CONVERSION TEXTE EN BINAIRE--");
			  FileInputStream fstream = new FileInputStream("BD binaire.txt");
			  DataInputStream in = new DataInputStream(fstream);
			  BufferedReader br = new BufferedReader(new InputStreamReader(in));
			  String strLine;
			  ArrayList<String> Binaire = new ArrayList<String>();
			  ArrayList<String> Lettre = new ArrayList<String>();
			  int i = 0;
			  while ((strLine = br.readLine()) != null){
				  
				  String split[] = strLine.split("-");
				  Binaire.add(split[1]);
				  Lettre.add(split[0]);
				 // System.out.println(Binaire.get(i)+" "+Lettre.get(i));
				  i++;
			  }
		Scanner valeur = new Scanner(System.in);
		System.out.println("Saisir un texte : ");
		String texte_entrer = valeur.nextLine();
		int loop = 0;
		ArrayList<String> contain = new ArrayList<String>();
		for(loop=0;texte_entrer.length() > loop; loop++){
			//System.out.println(texte_entrer.charAt(loop)+" ");
			String sep = texte_entrer.charAt(loop)+"";
			contain.add(sep);
			//System.out.println(contain.get(0));
		}
		int suite = 0;
		System.out.print("En binaire : ");
		for(suite = 0; contain.size() > suite;suite++){
			int find = Lettre.indexOf(contain.get(suite));
			System.out.print(Binaire.get(find)+" ");
		}

}}
