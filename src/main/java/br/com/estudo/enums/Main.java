package br.com.estudo.enums;

public class Main {
    public static void main(String[] args) {
        System.out.println(HelloEnum.INDEFINIDO.name());
        System.out.println(HelloEnum.valueOf(HelloEnum.INDEFINIDO.name()));
    }
    private void teste(){}

    private void teste2(){}
}
