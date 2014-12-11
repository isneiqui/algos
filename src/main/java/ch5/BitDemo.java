package ch5;

class BitDemo {
	public static void main(String args[]) {
	     int a = 60;	/* 60 = 0011 1100 */  
	     int b = 13;	/* 13 = 0000 1101 */
	     int c = 0;

	     c = a & b;       /* 12 = 0000 1100 */ 
	     System.out.println("a & b = " + c );

	     c = a | b;       /* 61 = 0011 1101 */
	     System.out.println("a | b = " + c );

	     c = a ^ b;       /* 49 = 0011 0001 */
	     System.out.println("a ^ b = " + c );

	     c = ~a;          /*-61 = 1100 0011 */
	     System.out.println("~a = " + c );

	     c = b << 2;     /* 240 = 1111 0000 */
	     System.out.println("b << 2 = " + c ); //0011 0100

	     c = b >> 2;     /* 215 = 1111 */
	     System.out.println("b >> 2  = " + c ); // 11

	     a = 188;		/* 188 = 1011 1100 */  
	     				//       0010 1111
	     
	     
	     
	     c = a >>> 2;   /*  47 = 0010 1111 */
	     System.out.println("a >>> 2 = " + c );
	     
	     System.out.println(Long.toBinaryString(-2));
	  }
}