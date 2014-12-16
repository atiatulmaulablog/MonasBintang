package atiatulmaula.monasbintang;
public class Puncak {

	public Puncak() {
		int bintang = 2;
		int kosong = 32;
		int baris = 3;

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
