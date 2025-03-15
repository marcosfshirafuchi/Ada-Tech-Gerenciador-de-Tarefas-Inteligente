package br.com.ada.t1322.tecnicasprogramacao.projeto.view;

public class ConsoleView implements IView {

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }

    @Override
    public String getInput(String prompt) {
        System.out.print(prompt + ": ");
        return InputReader.readLine();
    }

    @Override
    public int getIntInput(String prompt) {
        System.out.print(prompt + ": ");
        return InputReader.readInt();
    }

    @Override
    public void close() {
        InputReader.close();
    }
}
