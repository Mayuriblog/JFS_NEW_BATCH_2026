/*
import java.util.*;

class MyThread1 extends Thread {
    //static ArrayList<Integer> al = new ArrayList<>();
	static List<Integer> al = Collections.synchronizedList(new ArrayList<>());
	public void run() {
        for(int i = 0; i < 1000; i++) {
            al.add(i);
        }
    }
}

public class AL_Vector {
    public static void main(String[] args) throws Exception {
        MyThread1 t1 = new MyThread1();
        MyThread1 t2 = new MyThread1();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(MyThread1.al.size()); // ❌ unpredictable
    }
}
*/
import java.util.*;

class MyThread2 extends Thread {
    static Vector<Integer> v = new Vector<>();

    public void run() {
        for(int i = 0; i < 1000; i++) {
			//System.out.println(Thread.currentThread().getName() + " adding: " + i);
            v.add(i);
        }
    }
}

public class AL_Vector {
    public static void main(String[] args) throws Exception {
        MyThread2 t1 = new MyThread2();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
		
		//t1.setName("T1");
        //t2.setName("T2");


        t1.join();
        t2.join();
		System.out.println("Multi Thread program using vector");
        System.out.println(MyThread2.v.size()); // ✅ always 2000
    }
}