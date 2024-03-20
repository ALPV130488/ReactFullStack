package oops;


interface Parent5{						//100% abstraction
	public int mul(int a,int b);
}



public class Child3 implements Parent5 {	//0% abstraction

	

	@Override
	public int mul(int a, int b) {
		
		return (a*b);
	}

}
