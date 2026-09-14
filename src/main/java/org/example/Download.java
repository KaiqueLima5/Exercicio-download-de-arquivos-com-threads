package main.java.org.example;

public class Download implements Runnable {

    private String nomeArquivo;
    private int tamanhoArquivo;

    public Download(String nomeArquivo, int tamanhoArquivo) {
        this.nomeArquivo = nomeArquivo;
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public void run() {

        int baixado = 0;

        while (baixado < tamanhoArquivo) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Download interrompido.");
            }

            baixado += 10;

            if (baixado > tamanhoArquivo) {
                baixado = tamanhoArquivo;
            }

            System.out.println(nomeArquivo + ": " +
                    baixado + " MB / " + tamanhoArquivo + " MB");
        }

        System.out.println(nomeArquivo + " - Download concluído!");
    }
}