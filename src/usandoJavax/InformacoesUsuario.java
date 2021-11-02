package usandoJavax;

import javax.swing.*;

public class InformacoesUsuario {


    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        String cpf = JOptionPane.showInputDialog("Digite seu cpf: ");
        String endereco = JOptionPane.showInputDialog("Digite seu endereço: ");
        String cep = JOptionPane.showInputDialog("Digite seu cep: ");
        String cidade = JOptionPane.showInputDialog("Digite sua cidade: ");
        String estado = JOptionPane.showInputDialog("Digite seu estado: ");
        String pais = JOptionPane.showInputDialog("Digite seu país: ");


        int resultado = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado? ");

        if (resultado == 0) {
            JOptionPane.showMessageDialog(null, "Nome: " + nome +
                    "\nCpf: " + cpf + "\nEndereço: " + endereco + "\nCep: " + cep + "\nCidade: " + cidade +
                    "\nEstado: " + estado + "\nPaís: " + pais);
        } else {
            JOptionPane.showMessageDialog(null, "!!! ATÉ LOGO !!! ");
        }

    }
}

