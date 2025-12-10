package academy.devkaua.maratonajava.introducao.Aula08Revisoes;

import java.util.ArrayList;

public class Aula8Reavisao {
    public static void main(String[] args) {
        int x = 10 ;
        if (x > 5) {
            System.out.println("A");
        }
        System.out.println("B");

        int idade = 15;
        String status;
        if (idade >= 18) {
            status = "Maior de idade";
        } else {
            status = "Menor de idade";
        }
        System.out.println(status);

        int pontuacao = 85;
        char nota;
        if (pontuacao >= 100) {
            nota = 'A';
        } else if (pontuacao >= 85) {
            nota = 'B';
        } else {
            nota = 'C';
        }
        System.out.println(nota);

        int tempo = 25;
        boolean ensolarado = true;
        if (tempo > 30 && ensolarado) {
            System.out.println("PRAIA");
        } else {
            System.out.println("SEM PRAIA");
        }

        boolean temChave = false;
        boolean sabeSenha = true;
        if (temChave || sabeSenha) {
            System.out.println("ENTRA");
        } else {
            System.out.println("NAO ENTRA");
        }

        int xx = 10;
        int y = 20;
        int max;
        if (xx > y) {
            max = xx;
        } else {
            max = y;
        }
        System.out.println(max);

        int dia = 3;
        String nomeDia;
        switch (dia) {
            case 1:
                nomeDia = "Segunda";
                break;
            case 2:
                nomeDia = "Terca";
                break;
            case 3:
                nomeDia = "Qaurta";
                break;
            default:
                nomeDia = "Desconhecido";
        }
        System.out.println(nomeDia);

        int escolha = 5;
        String saida = "";
        switch (escolha) {
            case 1:
                saida = "Um";
                break;
            case 2:
                saida = "Dois";
                break;
            case 3:
                saida = "Tres";
                break;
            default:
                saida = "Nenhum";
        }
        System.out.println(saida);

        String[] nome = new String[5];

        for (int i = 0; i < nome.length; i++) {
            nome[i] = "Item " + (i + 1);
        }
        for (String i: nome) {
            System.out.println(i);
        }


        String[] time = { "Corinthians", "Palmeiras", "Santos", "Sao Paulo" };
        ArrayList<String> minhaLista = new ArrayList<>();
        for (String i: time) {
            minhaLista.add(i);
        }
        System.out.println(minhaLista);
    }

}
