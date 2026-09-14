package main.java.org.example;

public class Main {

    public static void main(String[] args) {

        Thread download1 = new Thread(new Download("Arquivo 1", 50));
        Thread download2 = new Thread(new Download("Arquivo 2", 70));
        Thread download3 = new Thread(new Download("Arquivo 3", 40));
        Thread download4 = new Thread(new Download("Arquivo 4", 60));
        Thread download5 = new Thread(new Download("Arquivo 5", 30));

        download1.start();
        download2.start();
        download3.start();
        download4.start();
        download5.start();

        try {
            download1.join();
            download2.join();
            download3.join();
            download4.join();
            download5.join();
        } catch (InterruptedException e) {
            System.out.println("Erro ao aguardar os downloads.");
        }

        System.out.println("Todos os downloads foram concluídos!");
    }
}