package tasks;

public class Task3 extends Thread{
    public Task3() {
    }

    public void run() {
    for (int i = 1; i <= 20; i++) {
            System.out.println("(" + i + "):" + this.fibonacci(i) + "\t");
            if(i == 20){
                System.out.println("Processo 3 - Fibonacci de 20 Finalizado – valor do 20º termo:"+this.fibonacci(i));
            }

            try {
                this.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
        public int fibonacci(int n){
        if (n < 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}