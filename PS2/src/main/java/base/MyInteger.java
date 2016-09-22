package base;

public class MyInteger {
	int iValue;

	public MyInteger(int iValue) {
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}
	
	public boolean isEven(){
		if (iValue%2 == 0){
			return true;
			
		} else{
			return false;
		}
	}
	
	public boolean isOdd(){
		if (iValue%2 == 1){
			return true;
			
		} else{
			return false;
		}
	}
	
	public boolean isPrime(){
		if (iValue>2){
			for(int i=2;i<=iValue/2;i++ ){
				if (iValue % i == 0) {
					return false;
				} 
			}
		} return true;
		
	}
	
	public static boolean isEven(int number){
		if (number%2 == 0){
			return true;		
		} else{
			return false;
		}	
	}
	
	public static boolean isOdd(int number){
		if (number%2 == 1){
			return true;
			
		} else{
			return false;
		}
	}
	
	public static boolean isPrime(int number){
		if (number>2){
			for(int i=2;i<=number/2;i++ ){
				if (number % i == 0) {
					return false;
				} 
			}
		} return true;
	}
	
	public static boolean isEven(MyInteger number){
		return number.isEven();		
	}
	
	public static boolean isOdd(MyInteger number){
		return number.isOdd();
	}
	
	public static boolean isPrime(MyInteger number){
		return number.isPrime();
	}
	
	public boolean equals(int number){
		if (iValue == number)
			return true;
		return false;
	}
	public boolean equals(MyInteger number){
		return number.equals(iValue);
	}
}
