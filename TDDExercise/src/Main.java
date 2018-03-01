
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		
		int x= 3;
		
		switch(x){
		case 3:
			result +=3;
		case 2:
			result *=2;
			break;
			
		case 1:
			result -=1;
		default: 
			result =0;	
			
		}
		
		System.out.println(result);

	}

}
