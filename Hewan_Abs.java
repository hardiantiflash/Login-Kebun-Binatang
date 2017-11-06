import java.util.*;
abstract class Hewan_Abs {
	LinkedList<String> nama = new LinkedList<String>();
	LinkedList<String> daerah = new LinkedList<String>();
	LinkedList<String> spesies = new LinkedList<String>();
	LinkedList<Integer> populasi = new LinkedList<Integer>();
	int pilihan;
	Scanner scan = new Scanner(System.in);
	// methode
	abstract void menu();
	abstract void getNama();
	abstract void getDaerah();
	abstract void getSpesies();
	abstract void getPopulasi();
}