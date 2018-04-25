class MyThread extends Thread{
	public void run(){
		for(int i = 0; i < 50; i++)
			System.out.println("多线程");	
	}

}

public class demo{
	public static void main(String[] args){
		new MyThread();
		new MyThread().start();
		for(int i = 0; i < 20; i++)
		System.out.println("测试111111111111");
	}
}
