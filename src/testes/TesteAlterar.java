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
        String nomePesquisado = JOptionPane.showInputDialog("Entre com o nome o qual quer saber o indice");

        IntStream res = IntStream.range(0,pessoa.size()).filter(i -> pessoa.get(i).getNome().equals(nomePesquisado));
        System.out.println("Posição:  " + res.max().getAsInt());

        int n = JOptionPane.showConfirmDialog(null, "Voce gostaria de deletar mesmo?", "An Inane Question", JOptionPane.YES_NO_OPTION);
        if (objetoDeletado == pessoa){
            pessoa.remove(objetoDeletado);
        }else {
            System.out.println("Nao existe esse valor");
        }

    }
}
