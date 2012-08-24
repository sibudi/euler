// menghitung bilangan fibonaci ganjil yg kurang dari 4juta

class E2 {

	public static void main ( String[] args ) {

		int a = 1, 
			b = 2, 
			temp = 0, 
			hasil = 0;

		while ( b < 4000000 ) {

			if ( b % 2 == 0 )
				hasil += b;

			temp = a + b;
			a = b;
			b = temp;
		}

		System.out.println ( hasil );
	}
}