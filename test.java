/**
 * A
 */
class A extends Thread  {

    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(30);
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }
}

 
class B extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(30);
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }
}



public class test {

    public static void main(String[] args) {
        A obj1=new A();
        B obj2=new B();
        // System.out.println(obj2.getPriority());
        // obj2.setPriority(Thread.MAX_PRIORITY);
        // System.out.println(obj2.getPriority());
        //dfjkdjf
        obj1.start();
        obj2.start();
    }
}