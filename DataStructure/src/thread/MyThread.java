package thread;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("这是子线程打印的内容");
	}
	
	public static void main(String[] args) {
		System.out.println("JVM 启动main 线程,main 线程执行main 方法");
		//3)创建子线程对象
		MyThread thread = new MyThread();
		//4)启动线程
		thread.start();
	}
}
