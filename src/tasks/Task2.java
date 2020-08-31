package tasks;

public class Task2 extends Thread {
    public Task2() {
    }

    public void run() {
        for (int x = 1; x <= 20; x++) {
            System.out.println("Processo 2 – em execução");
            
            try {
                this.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("Processo 2 - Finalizado");
    }
}
