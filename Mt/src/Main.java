
public class Main {
	
	
	
	
	

	public static void main(String[] args){
		
		CounterThread ct1 = new CounterThread(1,10, 100, ">");
		
		CounterThread ct2 = new CounterThread(10,300, 10, ">>");
		
		Thread t1 = new Thread(ct1);
		Thread t2 = new Thread(ct2);
		
		t1.setDaemon(true);
		t1.setDaemon(true);
		
		t1.start();
		t2.start();
		
		for(int i =0; i<11; i++){
			System.out.println(" >>>>> "+ i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	
}
