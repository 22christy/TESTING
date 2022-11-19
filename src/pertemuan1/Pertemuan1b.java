package pertemuan1;

public class Pertemuan1b {

	public static void main(String[] args) {
		
		//klo hanya 1 karakter gunakan petik satu (' '), klo petik dua (" ") dianggap banyak
		String nama = "Christy";
		char golongandarah = 'O';
		float tinggibadan = 158.552434f;
		double beratbadan = 38.589979;
		int tahunmasuk = 2022;
		
		System.out.println("Nama           \t= " + nama);
		System.out.println("Golongan Darah \t= " + golongandarah);
		System.out.println(String.format("Tinggi Badan \t= %.2f", tinggibadan));
		System.out.println("Tinggi Badan   \t= " + tinggibadan);
		System.out.println(String.format("Berat Badan \t= %.2f", beratbadan));
		System.out.println("Berat Badan    \t= " + beratbadan); 
		System.out.println("Tahun Masuk    \t= " + tahunmasuk);
		

	}

}
