import java.util.*;
class Generate_exception{
	int[] myarr=new int[5];
	private void readElements() {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter array elements:");
		for (int i=0;i<myarr.length;i++) {
			myarr[i]=read.nextInt();
			
		}
	}
	private void divideElements() {
		int small=getSmallestElement();
		for (int i=0;i<myarr.length;i++) {
			double res=myarr[i]/small;
		}
		System.out.println("Division is sucessful");
	}
	private int getSmallestElement() {
		int small=myarr[0];
		for (int i=0;i<myarr.length;i++) {
			if (myarr[i]<small) 
				small=myarr[i];
		}
		return small;
	}
	private void displayElement() {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the index you want to access: ");
		int idx=read.nextInt();
		int val=myarr[idx];
		System.out.println("Value is:"+val);
	}
	void compute() {
		readElements();
		divideElements();
		displayElement();
	}
}
public class Exceptiondemo {

	public static void main(String[] args) {
		Generate_exception obj1=new Generate_exception();
		try {
			obj1.compute();
		}
		catch(InputMismatchException ex){
			System.out.println("Run time InputMismatch error "+ex);
		}
		catch(ArithmeticException ex) {
			System.out.println("Run time ArithmaticException error "+ex);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Rumtime error ArrayIndexOutOfBoundsException error "+ex);
		}
		System.out.println("Program execution is completed.....");
	}
}