package com.ds.algo.com;

public class Demo {

	public static void main(String[] args) {
		
		final ProducerConsumer pc = new ProducerConsumer();
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				
				try {
					pc.produce();
				}catch(InterruptedException e) {
					
					e.printStackTrace();
					
				}
				
			}
		});

	
	
	Thread t2 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			
			try {
				pc.consume();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	});

 }
}
