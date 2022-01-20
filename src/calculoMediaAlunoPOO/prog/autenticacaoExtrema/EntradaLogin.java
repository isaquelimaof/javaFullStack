package calculoMediaAlunoPOO.prog.autenticacaoExtrema;

import javax.swing.*;

public class EntradaLogin {

    public static boolean usuarioLogin(){

        String teste = JOptionPane.showInputDialog("Qual o usuário para login???");
        if(teste.equals("Secretario")){
            FuncaoAutenticacaoSecretario autenticacaoSecretario = new FuncaoAutenticacaoSecretario();
            autenticacaoSecretario.autenticacaoSecretario(autenticacaoSecretario);
        }
        else if (teste.equals("Diretor")) {
            FuncaoAutenticacaoDiretor autenticacaoDiretor = new FuncaoAutenticacaoDiretor();
            autenticacaoDiretor.autenticacaoDiretor(autenticacaoDiretor);
        }else {
            JOptionPane.showMessageDialog(null,"Usuario não cadastrado");
        }
        return false;
    }
}
