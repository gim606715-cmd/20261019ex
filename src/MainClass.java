
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  /*
		   * 데이터 타입 
		   * 메모리에 저장할 데이터의 종류에 따라 할당 받는 메모리 크기가 다르게 되는데요,
		   * 각각의 메모리 크기에 따라 데이터 종류를 구분하는 것을 말합니다.
		   * 
		   * 메모리 단위 
		   * 1bit(비트) > 메모리 최소단위
		   * 8bit(비트) > 1byte(바이트)
		   * 1024Byte(바이트) > 1kB(키로 바이트)
		   * 1024KB(키로 바이트) > 1MB(메가 바이트)
		   * 1024MB(메가 바이트) > 1GB(기가 바이트)
		   * 1024GB(기가 바이트) > 1TB(테라 바이트)
		   */
		
		   // 정수 데이터 타입
		   /*
		    * byte      1byte    -128 ~ 127 
		    * short     2byte    -32,768 ~ 32,767
		    * int       4byte    -2,147,483,648 ~ 2,147,483,647
		    * long      8byte    -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		    */
		   
		   byte byteNum = 115;
		   System.out.println("byteNum: " + byteNum); // 115
		   
		   byteNum = 127;
//		   	   byteNum = byteNum + 1;
		   
		   byte byteNum01 = -128;
		   System.out.println("byteNum01: " + byteNum01); // -128
		   
		   byteNum01 = (byte)(byteNum01 - 1);
		   System.out.println("byteNum01: " + byteNum01); // -129(x) 127(o)
		   
		   short shortNum = 22768;
		   System.out.println("shortNum: " + shortNum); // 22768
		   
		   int intNum = 1147483648;
		   System.out.println("intNum: " + intNum); // 1147483648
		   
		   int intNUm01 = -2147483648;
		   System.out.println("intNum01: " + intNum01); // -2147483648
		   
		   intNum01 = intNum01 - 1;
		   System.out.println("intNum01: " + longNum01); // 72233720368547755808
		    
		   //              9,223,372,036,854,775,807
		   long longNum = 722337203685477580L;
		   System.out.println("intNum: " + longNum); // 7223372036854775808
		   
		   System.out.println("byte 최솟값: " + Byte.MIN_VALUE);
		   System.out.println("byte 최댓값: " + Byte.MAX_VALUE);
		   
		   System.out.println("short 최솟값: " + Short.MIN_VALUE);
		   System.out.println("short 최댓값: " + Short.MAX_VALUE);
		   
		   System.out.println("int 최솟값: " + Integer.MIN_VALUE);
		   System.out.println("int 최댓값: " + Integer.MAX_VALUE);
		   
		   System.out.println("long 최솟값: " + Long.MIN_VALUE);
		   System.out.println("long 최댓값: " + Long.MAX_VALUE);
		   
		   // 실수(부동소수점)
		   /*
		    * 
		    * float 4byte
		    * double 8byte
		    * 
		    */
		    
		    float floatNum = 3.14f;
		   
		    }
		    

}
