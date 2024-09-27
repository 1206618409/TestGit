package pricess.com.aaa;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-07 14:54
 **/

/**
         * 线程的生命周期：
         * 1、新生状态
         * 当创建好当前线程对象之后，没有启动之前（调用start方法之前）
         * ThreadDemo t   = new ThreadDemo();
         * RunnableDemo  run =  new RunnableDemo();
         * 2就绪状态：准备开始执行，并没有执行，表示调用start方法之后。
         * 当对应的线程创建完成，且调用start方法之后，所有的线程会添加到一个就绪的队列中，所有的线程同时去抢占cpu的资源。
         * 3、运行状态：当当前进程获取到cpu资源之后，就绪队列中的所有线程会抢占cpu的资源，谁先抢到谁先执行，再执行的过程中叫做运行状态 抢占到cpu资源，执行代码逻辑开始。
         * 4、死亡状态：当运行的线程正常执行完所有的代码逻辑或者因为异常情况导致程序结束叫做死亡状态。
         * 进入的方式：
         * 1、正常运行完成且结束
         * 2、人为中断执行，比如使用stop方法
         * 3、程序抛出未捕获的异常
         * 5、阻塞状态：在程序运行过程中，发生某些异常情况，导致当前线程无法再顺利执行下去，此时会进入阻塞状态，进入阻塞状态的原因消除之后，所有阻塞队列会再次进入到就绪状态中，随机抢占CPU的资源，等待执行。
         * 进入的方式：
         * sleep 方法
         * 等待IO资源
         * join方法：（代码中执行的逻辑）
 *         sleep方法:
 */
public class Demo2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <15 ; i++) {
            System.out.println(Thread.currentThread().getName()+"---------------"+i);
        }
    }

    public static void main(String[] args) {
        Demo2 d = new Demo2();
        d.start();
        for (int i = 0; i <5 ; i++) {
            System.out.println(Thread.currentThread().getName()+"----------"+i);
        }
    }
}


