package com.peace.pms.Test;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Author: cxx
 * @Date: 2018/3/3 17:16
 */
public class ThreadPoolDemo {
    public static class Taskdemo implements Runnable{
        @Override
        public void run() {
            for(int i=0;i<2;i++){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
    public static void main(String[] args) {
        ExecutorService es=Executors.newCachedThreadPool();
        for(int i=0;i<10;i++){
            Taskdemo tc=new Taskdemo();
            es.execute(tc);
        }
        es.shutdown();
    }





    public static void main2(String[] args) {
        ExecutorService es=Executors.newFixedThreadPool(2);
        for(int i=0;i<10;i++){
            Taskdemo tc=new Taskdemo();
            es.execute(tc);
        }
        es.shutdown();
    }
    public static void main3(String[] args) {
        ExecutorService es=Executors.newSingleThreadExecutor();
        for(int i=0;i<10;i++){
            Taskdemo tc=new Taskdemo();
            es.execute(tc);
        }
        es.shutdown();
    }

    public static void main4(String[] args) {
        ScheduledExecutorService es=Executors.newScheduledThreadPool(2);
        for(int i=0;i<2;i++){
            Taskdemo tc=new Taskdemo();
            //参数1：目标对象
            //参数2：隔多长时间开始执行线程，
            //参数3：执行周期
            //参数4：时间单位
            es.scheduleAtFixedRate(tc, 30, 10, TimeUnit.MILLISECONDS);
        }
        es.shutdown();
    }



}