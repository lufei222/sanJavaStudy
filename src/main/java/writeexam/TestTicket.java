package writeexam;

import java.util.concurrent.atomic.AtomicInteger;

public class TestTicket {

    /**
     * *  TicketThread.java     * *  @version ： 1.1 *   *  @author  ： 苏若年    <a href="mailto:DennisIT@163.com">发送邮件</a> *     *  @since     ： 1.0        创建时间:    2013-2-24        下午02:22:49 *      *  TODO     :    class TicketThread.java is used for ... *
     */
    public static class TicketThreadT extends Thread {
        //总共票数设定为5张
        private int num = 5;

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                if (this.num > 0) {
                    //打印买票信息
                    System.out.println(Thread.currentThread().getName() + "买票: " + this.num--);
                }
            }
        }

        public static void main(String[] args) {
            TicketThreadT th1 = new TicketThreadT();
            //线程一
            th1.setName("售票口一");
            TicketThreadT th2 = new TicketThreadT();
            //线程二
            th2.setName("售票口二");
            TicketThreadT th3 = new TicketThreadT();
            //线程三
            th3.setName("售票口三");
            // 分别启动三个线程
            th1.start();
            th2.start();
            th3.start();
        }
    }

    /**
     * *  TicketThreadR.java     * *  @version ： 1.1 *   *  @author  ： 苏若年    <a href="mailto:DennisIT@163.com">发送邮件</a> *     *  @since     ： 1.0        创建时间:    2013-2-24        下午02:29:23 *      *  TODO     :    class TicketThreadR.java is used for ... *
     */
    public static class TicketThreadR implements Runnable {
        private int num = 5;

        //总共票数设定为5张
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                if (this.num > 0) {
                    //打印买票信息
                    System.out.println(Thread.currentThread().getName() + "买票: " + this.num--);
                }
            }
        }

        public static void main(String[] args) {
            TicketThreadR ticketThread = new TicketThreadR();
            Thread th1 = new Thread(ticketThread);
            //线程一
            th1.setName("售票口一");
            Thread th2 = new Thread(ticketThread);
            //线程二
            th2.setName("售票口二");
            Thread th3 = new Thread(ticketThread);
            //线程三
            th3.setName("售票口三");
            th1.start();
            th2.start();
            th3.start();
        }
    }


    /** * *  TicketThreadR.java     * *  @version ： 1.1 *   *  @author  ： 苏若年    <a href="mailto:DennisIT@163.com">发送邮件</a> *     *  @since     ： 1.0        创建时间:    2013-2-24        下午02:29:23 *      *  TODO     :    class TicketThreadR.java is used for ... * */
    public static class TicketThreadR3 implements Runnable{
        private int num = 5;
        //总共票数设定为5张
         @Override
         public void run() {
              for(int i=0; i<10; i++){
                try {
                   Thread.sleep(200);    //休息200毫秒
               } catch (InterruptedException e) {
                    e.printStackTrace();
         }
            if(this.num>0){
        // 打印买票信息
                 System.out.println(Thread.currentThread().getName() + "买票: " + this.num--);
              }
              }
           }
        public static void main(String[] args) {
         TicketThreadR3 ticketThread = new TicketThreadR3();
         Thread th1 = new Thread(ticketThread);
         //线程一
        th1.setName("售票口一");
        Thread th2 = new Thread(ticketThread);
        //线程二
         th2.setName("售票口二");
         Thread th3 = new Thread(ticketThread);
         //线程三
         th3.setName("售票口三");
         th1.start();
         th2.start();
         th3.start();
         }
    }


    public static class TicketThreadR4 implements Runnable {
        private int num = 5;

        //总共票数设定为5张
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                //使用同步代码块
                synchronized (this) {
                    try {
                        Thread.sleep(300);
                        //休息300毫秒
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (this.num > 0) {
                        //打印买票信息
                        System.out.println(Thread.currentThread().getName() + "买票: " + this.num--);
                    }
                }
            }
        }

        public static void main(String[] args) {
            TicketThreadR4 ticketThread = new TicketThreadR4();
            new Thread(ticketThread, "售票口一").start();
            //线程一
            new Thread(ticketThread, "售票口二").start();
            // 线程二
            new Thread(ticketThread, "售票口三").start();
            //线程三
        }
    }

    public static class TicketThreadR5 implements Runnable {
        private int num = 5;

        //总共票数设定为5张
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                sale();
                //调用同步方法
            }
        }

        //使用同步方法
        public synchronized void sale() {
            try {
                Thread.sleep(300);
                //休息300毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (this.num > 0) {
                //打印买票信息
                System.out.println(Thread.currentThread().getName() + "买票: " + this.num--);
            }
        }

        public static void main(String[] args) {
            TicketThreadR5 ticketThread = new TicketThreadR5();
            new Thread(ticketThread, "售票口一").start();
            //线程一
            new Thread(ticketThread, "售票口二").start();
            //线程一
            new Thread(ticketThread, "售票口三").start();
            //线程一
        }
    }

    public static class TicketThreadR6 implements Runnable {

        private AtomicInteger num = new AtomicInteger(5);

        /**
         * @Title: main
         * @Description: TODO
         * @param args:
         * @author
         * @date 2013-4-23
         */
        public static void main(String[] args) {
            TicketThreadR6 syn = new TicketThreadR6();
            Thread th1 = new Thread(syn); // 线程一
            th1.setName("售票口一");
            Thread th2 = new Thread(syn); // 线程二
            th2.setName("售票口二");
            Thread th3 = new Thread(syn); // 线程三
            th3.setName("售票口三");

            th1.start();
            th2.start();
            th3.start();
        }

        @Override
        public void run() {

            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    /*
                     *  当程序抛出InterruptedException时，此方法会成为一个阻塞方法,
                     *  所以需要恢复被中断的状态
                     */
                    Thread.currentThread().interrupt();
                    e.printStackTrace();
                }

                if (num.get() > 0) {
                    System.out.println(Thread.currentThread().getName() + "买票: "
                            + num.getAndDecrement());
                }
            }
        }
    }


}
