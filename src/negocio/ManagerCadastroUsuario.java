package negocio;

import dao.InserirUsuario;
import sistema.bean.UsuarioBean;
import view.TelaCadastroUsuario;

public class ManagerCadastroUsuario{

 
    public static void salvarDados(String nome, String senha, int perfil, String dt_nasc, int sexo, String nomeComp){

	UsuarioBean user = new UsuarioBean(nome, senha, perfil, dt_nasc, sexo, nomeComp);
	new InserirUsuario(user);

    }
    

}
