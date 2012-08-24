/*
Author: sibudi.net
Program: menghitung bilangan yg habis dibagi 3 atau 5 yg kurang dari 1000
*/

class E1 {
	
	public static void main ( String[] args ) {

		short i = 1;
		int hasil = 0;

		while ( i < 1000 ) {

			if ( i % 3 == 0 || i % 5 == 0 )
				hasil += i;
			
			i++;
		}

		System.out.println ( hasil );
	}
}