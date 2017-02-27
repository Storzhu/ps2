package base;

public class MyInteger {
	private int iValue;
	int i;
	
	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}
	public int getValue(){
		return iValue;
	
	}
	public boolean isEven(){
		if (iValue%2==0)
			return true;
		else 
			return false;
	}
	public boolean isOdd(){
		if (iValue%2==1)
			return true;
		else 
			return false;
	}
	public boolean isPrime(){
		int i;
		for (i = 2; i < iValue; i++) {
			if (iValue % i == 0)
				return false;
	    }
	    return true;
	}
	public static boolean isEven(int x){
		if (x%2==0)
			return true;
		else 
			return false;
	}
	public static boolean isOdd(int x){
		if (x%2==1)
			return true;
		else 
			return false;
	}
	public static boolean isPrime(int x){
		int i;
		for (i = 2; i < x; i++) {
			if (x%i==0)
				return false;
	    }
	    return true;
	}
	public static boolean isEven(MyInteger Value) {
		return Value.isEven();
	}
	public static boolean isOdd(MyInteger Value) {
		return Value.isOdd();
	}
	public static boolean isPrime(MyInteger Value) {
		return Value.isPrime();
	}
	public boolean equals(int Value) {
		return (Value == this.iValue);
	}
	public boolean equals(MyInteger Value) {
		return (Value.getValue() == this.iValue);
	}
}