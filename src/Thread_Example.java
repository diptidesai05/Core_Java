class A_Thread extends Thread{
	
	@Override
	public void run() {
		
		for(int i=0;i<5;i++) {
			System.out.println("Dipti Desai");
			try { 
				Thread.sleep(1000); 
				} 
				catch (InterruptedException e) { 
			 e.printStackTrace(); }
			 
		}
	}
	
}



class Thread_Example {

	public static void main(String[] args) throws InterruptedException {
		
		A_Thread  t = new A_Thread();
		t.start();
		System.out.println("printing another name");
		for(int i=0;i<5;i++) {
			System.out.println("Premanand Maharaj");
			Thread.sleep(1000);
		}
	}

}
