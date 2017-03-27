package TransferValue;

public class JavaValueTransfer {

	public static void  main(String args[]){
		int a = 10;
		Int intA = new JavaValueTransfer().new Int();
		change(a,intA);
		
	}
	
	private static void change(int a , Int intA){
		//b get the value of a
		int b = a;
		//intB get the value of object intA address
		Int intB= intA;
		
		//change the value
		b = 22;
		intB.setInnerA(22);
		System.out.println("int change " + a);
		System.out.println("Int change " + intA.getInnerA());
	}
	
	class Int {
		private int innera = 10;
		void setInnerA (int intA){
			innera = intA;
		}
		int getInnerA(){
			return innera;
		}
	}
}
