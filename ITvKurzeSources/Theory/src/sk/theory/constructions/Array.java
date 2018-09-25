package sk.theory.constructions;

import java.util.Arrays;
import java.util.Comparator;

public class Array {

	public static void main(String[] args) {

		// polia su indexovane mnoziny prvkov rovnakeho typu, mozu byt jedno alebo viac
		// rozmerne
		// velkost poli je fixna, nie je mozne ju menit, je potrebne vytvorit nove pole
		// o
		// pozadovanej velkosti a priradit referenciu

		// deklaracia jednorozmerneho pola
		// typ (primitivny alebo referencny) [] nazovPola

		int[] pole;
		String[] poleStr;

		// deklaracia viacrozmerneho pola
		// typ (primitivny alebo referencny) [][]...(pocet rozmerov) nazovPola

		byte[][] pole2Rozm;
		double[][][] pole3rozm;

		// inicializacia jednorozmerneho pola

		// inicializacia pola na velkost desat prvkov
		pole = new int[10];

		// inicializacia pola konkretnymi hodnotami, len pri deklaracii

		// poleStr = {"jeden", "dva", "tri"}; // nespravne
		String[] poleStr2 = { "jeden", "dva", "tri" }; // spravne

		// inicializacia viacrozmerneho pola

		// inicializacia pola na urcenu velkost
		byte[][] pole2RozmB = new byte[10][8];
		double[][][] pole3RozmB = new double[8][8][8];

		byte[][] pole2RozmC = { { 2, 3 }, { 5, 6 } };
		double[][][] pole3RozmC = { { { 1, 2 }, { 3, 4, 5 } }, { { 5, 6 }, { 7, 8 } } };

		// pristup k prvkom viacrozmerneho pola

		System.out.println(pole2RozmC[1][1]);

		System.out.println(pole3RozmC[0][0][0]);
		System.out.println(pole3RozmC[1][0][0]);
		System.out.println(pole3RozmC[0][1][0]);
		System.out.println(pole3RozmC[0][0][1]);

		System.out.println(pole3RozmC.length); // malo by byt 2
		System.out.println(pole3RozmC[0][1].length); // malo by byt 3

		System.out.println("---------------------------------------");
		System.out.println(Arrays.toString(pole3RozmC[0]));
		System.out.println(Arrays.toString(pole3RozmC[0][1]));

		// sortovanie pola pomocou comparatora !podla abecedy
		// anonymna trieda,

		String[] poleStrx = { "Mato", "Peto", "Ada" };

		Arrays.sort(poleStrx, new Comparator<String>() {

			@Override
			public int compare(String str1, String str2) {
				return str2.compareTo(str1);
			}
		});

		System.out.println(poleStrx[0] + poleStrx[1] + poleStrx[2]);

		// pomocou "instancie" interfacu
		// komparator podla abecedy

		Arrays.sort(poleStrx, new KomparatorPodlaAbecedy());
		System.out.println(poleStrx[0] + poleStrx[1] + poleStrx[2]);

	}
}

class KomparatorPodlaAbecedy implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}

}


