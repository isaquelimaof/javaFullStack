package calculoMediaAlunoPOO.prog.autenticacaoExtrema;

import calculoMediaAlunoPOO.prog.Diretor;
import calculoMediaAlunoPOO.prog.criandoInterfaces.PermitirAcessoDiretor;
import org.jetbrains.annotations.NotNull;

public class FuncaoAutenticacaoDiretor extends Diretor {

    public boolean autenticacaoDiretor(@NotNull PermitirAcessoDiretor acesso) {
       return acesso.autenticarDiretorLoginSenha("123", "123");
    }
}
