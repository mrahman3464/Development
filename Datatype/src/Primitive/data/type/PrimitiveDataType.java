package Primitive.data.type;

public class PrimitiveDataType {

	public static void main(String[] args) {
		int a=2147483647;
		//int a=2147483648; //not allowed 
		long b=2147483648l;
		long c=11l;
		//long can hold small number or long number but int can't hold big number.
		//int is 32 bit or 4 byte (int occupies 32 cells in the RAM)
		//long is 64 bit or 8 byte (long occupies 64 cells in the RAM)
		//
		
		byte d =22; //occupies 8 cells or 8 bit
		byte d1 =(byte)22; //occupies 8 cells or 8 bit
		//byte e=128; //not allowed only allowed up to 127
		short f=22; //occupies 16 cells or 16 bit
		short f1=(short)22; //occupies 16 cells or 16 bit
		
		
		float h=2.4f;  //32 cells
		//float h1=28888888888888888888888888888888888888888888.4f;
		double g=2.25d;  //64 cells
		double g1=28888888888888888888888888888888888888888888.4d;  //64 cells
		
		boolean t=true; //or false and occupies only one cell
		String aa="fffffffffffffff"; //string allow more than one character.
		char c1='d';  //only allow to store only one character 16bit
		
		//8 bit -128 to 127
		//16 bit -32768 to 32767
		//32 bit -2147483648 to 2147483647
		//64 bit -9223372036854775808 to 9223372036854775807
		
		
		
		
		
	}
	
}
