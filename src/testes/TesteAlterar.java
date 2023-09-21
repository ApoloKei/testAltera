package testes;

import classes.Pessoa;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class TesteAlterar {
    public static void main(String[] args) {
        List<Pessoa> pessoa = new ArrayList<>();
for (int i = 0; i <= 1;i++) {
    String nome = JOptionPane.showInputDialog("Entre com o nome");
    String idade = JOptionPane.showInputDialog("Entre com a idade");

    pessoa.add(new Pessoa(nome, idade));
}

        //ESSA PARTE É APENAS PRA VER O INDICE DO OBJETO SALVO
        String nomePesquisado = JOptionPane.showInputDialog("Entre com o nome o qual quer saber o indice");

        IntStream res = IntStream.range(0,pessoa.size()).filter(i -> pessoa.get(i).getNome().equals(nomePesquisado));
        System.out.println("Posição:  " + res.max().getAsInt()); // <-- ESSA LINHA MOSTRA O INDICE

        //ESSA PARTE É PRA DELETAR O OBJETO BASEADO NO INDICE
        int numero = Integer.parseInt(JOptionPane.showInputDialog("entre com o valor a ser deletado"));
        pessoa.remove(numero);

        String nome = JOptionPane.showInputDialog("Entre com o nome");
        String idade = JOptionPane.showInputDialog("Entre com a idade");

        //ESSE CODIGO ABAIXO ADD NA MATRIZ E NO MESMO INDICE QUE O OBJETO DELETADO ANTERIORMENTE
        pessoa.add(numero,new Pessoa(nome,idade));


    }
}
