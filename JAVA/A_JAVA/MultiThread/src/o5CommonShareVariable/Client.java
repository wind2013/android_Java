package o5CommonShareVariable;

import java.util.Random;

/**
 * ��ʾͬһ�߳��еĹ���������ֵ��һ�µ����,ԭ��ÿ���̶߳����Լ���һ�������������޸ĵ�ʱ��Ҳ����ԭ�Ӳ���
 * @author zhouhao
 *
 */
public class Client {
	
	private static int data=-1;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
    for (int i = 0; i < 2; i++) {
    	
		new Thread(new Runnable() {

			@Override
			public void run() {
					data=new Random().nextInt();
					System.out.println(Thread.currentThread().getName()+"put data ="+data);
					Client.print();
			}
			
		}).start();
	  }
	System.out.println(Thread.currentThread().getName()+"from Client  data ="+data);
	}
	
	
	public static void print(){
		System.out.println(Thread.currentThread().getName()+"from Client  data ="+data);
	}

}