
public class Runner {
	
	public static void main(String[] args) {
		

	}
	
	public int Play(int num1, int num2) {
		int output = 0;
	if(num1 < 22 && num2 <22) {
		if(num1 < num2) {
			output = num2;
		}else if(num1 > num2) {
			output = num1;
		}else 
			output=0;
	}else if(num1 < 22 & num2 > 21) {
		output = num1;
	}else if(num1 > 21 && num2 < 22) {
		output = num2;
	}
		return output;
	}

}
