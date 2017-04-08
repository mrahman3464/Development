package Primitive.data.type;

public class PrimitiveTypeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] numbers=new int[2];
		numbers[0]=1;
		numbers[1]=2;
		
		int sizeofarray=numbers.length;
		for(int k=0;k<=sizeofarray;k++){
			int a=numbers[k];
			System.out.println(a);
		}
		
	}

}
