package pertemuan1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Pertemuan1c {

	public static void main(String[] args) throws IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inputStreamReader);
		
		System.out.println("====================================================");
		System.out.println("                  Input Biodata");
		System.out.println("====================================================");
		
		System.out.print("Nama       \t= ");
		String nama = br.readLine();
		
		System.out.print("Jenis Kelamin \t= ");
		String jeniskelamin = br.readLine();
		
		System.out.print("Umur       \t= ");
		int umur = Integer.parseInt(br.readLine());
		
		System.out.print("Berat Badan \t= ");
		double beratbadan = Double.parseDouble(br.readLine());
		
		System.out.print("Golongan Darah \t= ");
		char golongandarah = br.readLine().charAt(0);
		
		System.out.println("==================================================");
		
		if (umur < 17) {
			System.out.println("Maaf Anda Belum Cukup Umur");
			
		} else {
		System.out.println("Nama     \t= " + nama);
		System.out.println("Jenis Kelamin \t= " + jeniskelamin);
		System.out.println("Umur       \t= " + umur);
		System.out.println("Berat Badan \t= " + beratbadan);
		System.out.println("Golongan Darah \t= " + golongandarah);
		
		
		}
		
		
		
		
		
		
		

	}


}
