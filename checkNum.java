package west2task2;
import java.util.Scanner;
public class checkNum {
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("请输入变量：");
	        int num=scanner.nextInt();
	        //定义计时器
	        double time= System.currentTimeMillis();
	        System.out.println("原方法耗时：（正在计算中，请稍等）");
	        for (long i=1;i<Integer.MAX_VALUE;i++) {
	            if(contain(i,num))result1+=i;
	        }
	        System.out.println((System.currentTimeMillis()-time)+"ms");
	        System.out.println("原方法结果："+result1);
	        //重置变量、计时器
	        result1=0;
	        time=System.currentTimeMillis();
	        System.out.println("四线程方法耗时：");
	        //四线程
	        MyThread myThread1=new MyThread(Integer.MIN_VALUE,250000000,num,0);
	        myThread1.start();
	        MyThread myThread2=new MyThread(250000001,500000000,num,1);
	        myThread2.start();
	        MyThread myThread3=new MyThread(500000001,750000000,num,2);
	        myThread3.start();
	        MyThread myThread4=new MyThread(750000001,1000000000,num,3);
	        myThread4.start();
	        //对比
	        boolean flag1=false;
	        boolean flag2=false;
	        boolean flag3=false;
	        boolean flag4=false;
	        while(!(flag1&&flag2&&flag3&&flag4)){
	            flag1=myThread1.isInterrupted();
	            flag2=myThread2.isInterrupted();
	            flag3=myThread3.isInterrupted();
	            flag4=myThread4.isInterrupted();
	        }
	        System.out.println((System.currentTimeMillis()-time)+"ms");
	        System.out.println("线程方法结果："+(result1+result2+result3+result4));
	    }
	    private static boolean contain(long num, int x) {
	        return String.valueOf(num).contains(String.valueOf(x));
	    }
	    static long result1;
	    static long result2;
	    static long result3;
	    static long result4;
	    static class MyThread extends Thread{
	        private int start;
	        private int end;
	        private int a;
	        private int check;
	        @Override
	        public void run() {
	            long result=0;
	            for(int i=start;i<=end;i++) {
	                if (contain(i,a)) {result+=i;}
	            }
	            if(check==0)result1=result;
	            else if(check==1)result2=result;
	            else if(check==2)result3=result;
	            else result4=result;
	            this.interrupt();
	        }
	        public MyThread(int start, int end, int a,int check) {
	            this.start = start;
	            this.end = end;
	            this.a = a;
	            this.check=check;
	        }
	  }
}
