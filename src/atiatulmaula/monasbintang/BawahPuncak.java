package atiatulmaula.monasbintang;
public class BawahPuncak {

	public BawahPuncak() {
		int bintang = 24;
		int kosong = 21;
		int baris = 3;

		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kosong; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < bintang; j++) {
				System.out.print("*");
			}
			System.out.println();
			bintang -= 2;
			kosong += 1;
		}
	}
}
