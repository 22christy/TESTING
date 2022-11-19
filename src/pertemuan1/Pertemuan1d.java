package pertemuan1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pertemuan1d {

	public static void main(String[] args) throws IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inputStreamReader);
		
		System.out.println("====================================================");
		System.out.println("      Hitung Luas dan Keliling Persegi Panjang");
		System.out.println("====================================================");
		
		System.out.print("Panjang \t= ");
		double panjang = Double.parseDouble(br.readLine());
		
		System.out.print("Lebar \t= ");
		double lebar = Double.parseDouble(br.readLine());
		
		double luas = panjang*lebar;
		double keliling = 2 + (panjang*lebar);
		
		System.out.println("===============================================");
		System.out.println("Luas \t= " + luas);
		System.out.println("Keliling \t= " + keliling);
	}

}
