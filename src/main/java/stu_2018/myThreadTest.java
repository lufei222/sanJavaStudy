package stu_2018;

import java.util.concurrent.*;

public class myThreadTest {
    public  static class CallableTest implements Callable<String>{
        public String call() throws Exception{
            return "Hello World";
        }
    }

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        Future<String> future = threadPool.submit(new CallableTest());
        try{
            System.out.println("waiting thread to finish");
            System.out.println(future.get());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
