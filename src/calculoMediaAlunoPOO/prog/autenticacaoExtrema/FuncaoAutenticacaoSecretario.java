package calculoMediaAlunoPOO.prog.autenticacaoExtrema;

import calculoMediaAlunoPOO.prog.Secretario;
import calculoMediaAlunoPOO.prog.criandoInterfaces.PermitirAcessoSecretario;
import org.jetbrains.annotations.NotNull;

public class FuncaoAutenticacaoSecretario extends Secretario {

    public boolean autenticacaoSecretario(@NotNull PermitirAcessoSecretario acesso){
        return acesso.autenticarSecretarioLoginSenha("admin", "123456");
    }
}
