class A_Runnable_Thread implements Runnable{

	@Override
	public void run() {
		
		for(int i=1;i<6;i++) {
			
			System.out.println("You will get a job");
		}
		
	}
	
	
}
class Thread_Runnable_Example {

	public static void main(String[] args) {
		
	   A_Runnable_Thread r = new A_Runnable_Thread();
       Thread t = new Thread(r);
       t.start();
       for(int i=1;i<6;i++) {
			
			System.out.println("You will get my PF money back");
		}
	}

}
