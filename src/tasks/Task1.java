package tasks;

public class Task1 extends Thread {

    public Task1() {
    }

    public void run() {
        int fatorial = 10;
        int fat = fatorial;
        for (int x = fatorial; x > 1; x--) {
            System.out.println(fat + "x" + (x-1) + "=" + (fat *= (x-1)));
            
            try {
                this.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("Processo 1 – Fatorial de 10 Finalizado – valor final:" + fat);
    }

}