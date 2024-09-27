package pricess.com.bbb;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-07 17:40
 **/

/**
 * 介绍线程类api方法
 */
public class ThreadApiDemo implements Runnable{
    public static void main(String[] args) {
        //获取当前线程对象
        Thread thread = Thread.currentThread();
        //获取当前线程的名称
        System.out.println(thread.getName());
        //获取线程池的id
        System.out.println(thread.getId());
        //获取线程的优先级 ,在一般系统中范围是0-10的值，如果没有经过设置的话，默认值是5，有些系统是0-100
        System.out.println(thread.getPriority());
        //设置线程池的优先级
        /**
         * 优先级越高一定越先执行吗？
         *      不一定，只是优先执行的概率比较大而已
         */
        thread.setPriority(10);
        System.out.println(thread.getPriority());
        ThreadApiDemo threadApiDemo = new ThreadApiDemo();
        Thread t = new Thread(threadApiDemo);
        //判断线程是否在活动
        System.out.println(t.isAlive());
        t.start();
        System.out.println(t.isAlive());
        System.out.println(t.getPriority());
        System.out.println(t.getPriority());
        /*for (int i = 0; i <5 ; i++) {
            System.out.println(Thread.currentThread().getName()+"-----------------"+i);
        }*/
        System.out.println(t.isAlive());
    }

    @Override
    public void run() {
        /*for (int i = 0; i <5 ; i++) {
            System.out.println(Thread.currentThread().getName()+"-----------------"+i);
        }*/
    }
}


