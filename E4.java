/*
Author: sibudi.net
Program: Mencari bilangan palindrom terbesar dari perkalian antara dua buah bilangan 3 digit
*/

class E4 {

	static boolean isPalindrom (int bil) {

		String s = "" + bil;
		char [] c = s.toCharArray();
		int i1 = 0,
			i2 = c.length - 1;

		while (i2 > i1) {

			if (c[i1 ++] != c[i2 --])
				return false;
		}

		return true;

		//atau bisa menggunakan fungsi bawaan java
		//return s.equals(new StringBuffer().append(s).reverse().toString());
	}

	public static void main (String[] args) {

		int i = 0, imaks = 0,
			j = 0, jmaks = 0,
			bilangan = 998001, // 999 * 999
			maks = 0;

		for (i = 999; i > 99; i --) {

			for (j = i; j > 99; j --) {

				bilangan = i * j;

				if (isPalindrom (bilangan) && bilangan > maks) {
				
					imaks = i;
					jmaks = j;
					maks = bilangan;
				}
			}
		}

		System.out.println (imaks + " * " + jmaks + " = " + maks);
	}
}