package atiatulmaula.monasbintang;
public class Kaki {
	public Kaki() {
		int kosong1 = 23;
		int kosong2 = 4;
		int bintang = 8;
		int baris = 2;

		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kosong1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < bintang; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < kosong2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < bintang; j++) {
				System.out.print("*");
			}
			System.out.println();
			bintang -= 3;
			kosong1 += 3;
		}
	}
}
