package atiatulmaula.monasbintang;
public class BawahTiang {

	public BawahTiang() {
		int bintang = 62; 
		int kosong = 2;
		int baris = 7;

		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kosong; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < bintang; j++) {
				System.out.print("*");
			}
			System.out.println();
			bintang -= 6;
			kosong += 3;
		}
	}
}
