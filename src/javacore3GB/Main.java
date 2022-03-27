package javacore3GB;

public class Main {
    static Object mon = new Object();
    static volatile String str = "A";
    static final int num = 5;


    public static void main(String[] args) {
        new Thread(() -> {
            try {
                for (int i = 0; i <= num; i++) {
                    synchronized (mon) {
                        if (str.equals("A")) {
                            System.out.print("A");
                            str = "B";
                            mon.notifyAll();
                        }
                        mon.wait();
                    }
                }
            } catch ( InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                for (int i = 0; i <= num; i++) {
                    synchronized (mon) {
                        if (str.equals("B")) {
                            System.out.print("B");
                            str = "C";
                            mon.notifyAll();
                        }
                        mon.wait();
                    }
                }
            } catch ( InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                for (int i = 0; i <= num; i++) {
                    synchronized (mon) {
                        if (str.equals("C")) {
                            System.out.print("C");
                            str = "A";
                            mon.notifyAll();
                        }
                        mon.wait();
                    }
                }
            } catch ( InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}


