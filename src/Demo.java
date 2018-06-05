public class Demo implements Runnable
{
    private int num = 100;
    private String name;
    Demo(String name){
        this.name = name;
    }
    Object obj = new Object();
    public void run(){
        while (true){
            synchronized (obj){
                if(num>0)
                {
                    System.out.println(Thread.currentThread().getName()+" is printing "+num--+" and the Demo: "+this.name);
                }
            }
        }
    }
}
