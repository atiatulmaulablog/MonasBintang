package atiatulmaula.monasbintang;
public class Tiang {

	public Tiang() {
		int bintang = 6;
		int kosong = 30;
		int baris = 24;

		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kosong; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < bintang; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
