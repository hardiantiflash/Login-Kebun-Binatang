public class Hewan extends Hewan_Abs{
	public void menu() {		
		System.out.println("\t- Penangkaran Satwa Langka di Indonesia Berdasarkan Daerah- \n");
        System.out.println("1. Cek Daerah");
        System.out.println("2. Cek Satwa Langka");
        System.out.println("3. Cek Daerah dan Satwa Langka");
        System.out.println("4. Cek Populasi Satwa Langka");
        System.out.println("5. Tambah Satwa Langka");
        System.out.println("6. Sumber Referensi");
        System.out.println("7. Credits");
        System.out.println("8. Exit\n");
        System.out.print("Menu Pilihan: ");
        pilihan = scan.nextInt();
        System.out.println();
        while (pilihan != 8) {
        	if (pilihan == 1) {
        		System.out.println("1. Cek Daerah");
        		getDaerah();
        	}
        	else if (pilihan == 2) {
        		System.out.println("2. Cek Satwa Langka");
        		getNama();
        	}
        	else if (pilihan == 3) {
        		System.out.println("3. Cek Satwa Langka dan Daerah");
        		getNama();
        		getDaerah();
        	}
        	else if (pilihan == 4) {
        		System.out.println("4. Cek Satwa Langka");
        		getNama();
        		getDaerah();
        		getSpesies();
        		getPopulasi();
        	}
        	else if (pilihan == 5) {
        		System.out.println("5. Tambah Satwa Langka");
        		scan.nextLine();
        		System.out.print("Masukkan Nama: ");
        		nama.add(scan.nextLine());
        		System.out.print("Masukkan Daerah: ");
        		daerah.add(scan.nextLine());
        		System.out.print("Masukkan Spesies: ");
        		spesies.add(scan.nextLine());
        		System.out.print("Masukkan Populasi: ");
        		populasi.add(scan.nextInt());
        	}
        	else if (pilihan == 6) {
        		System.out.println("6. Sumber Referensi");
        		System.out.println("http://www.situshewan.com/2014/08/daftar-hewan-langka-di-indonesia.html");
        		System.out.println("http://www.sejujurnya.com/2016/05/hewan-langka-di-indonesia.html");
        		System.out.println("https://alamendah.org/2013/03/24/25-hewan-langka-indonesia");
        	}
        	else if (pilihan == 7) {
        		System.out.println("7. Credits");
        		System.out.println("1. Aufa Billah - aufaroot18@gmail.com");
        	}
        	else {
        		System.out.println("Maaf, Pilihan Tidak Tersedia");
        	}
        	System.out.print("\nMenu Pilihan: ");
        	pilihan = scan.nextInt();
        	System.out.println();
        }
	}

	public void getNama() {
		System.out.println(nama);
	}
	public void getDaerah() {
		System.out.println(daerah);
	}
	public void getSpesies() {
		System.out.println(populasi);
	}
	public void getPopulasi() {
		System.out.println(populasi);
	}
}