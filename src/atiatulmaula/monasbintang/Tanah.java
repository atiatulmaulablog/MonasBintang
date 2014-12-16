package atiatulmaula.monasbintang;
public class Tanah {

	public Tanah() {
		int bintang = 64;
		int kosong = 1;
		int baris = 2;

		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kosong; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < bintang; j++) {
				System.out.print("*");
			}
			System.out.println();
			bintang += 2;
			kosong -= 1;
		}
	}
}
