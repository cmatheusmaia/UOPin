package sistema.bean;

public class UsuarioBean {

    private int idUsuario;
    private String nome;
    private String senha;
    private int perfil_Usuario_idPerfil_Usuario;
    private String dt_nascimento;
    private int sexo_idSexo;
    private String nomeCompleto;
    
    public UsuarioBean(String nome, String senha, int perfil_Usuario_idPerfil_Usuario, String dt_nascimento,
	    int sexo_idSexo, String nomeCompleto) {
	super();
	this.nome = nome.toString();
	this.senha = senha;
	this.perfil_Usuario_idPerfil_Usuario = perfil_Usuario_idPerfil_Usuario;
	this.dt_nascimento = dt_nascimento.toString();
	this.sexo_idSexo = sexo_idSexo;
	this.nomeCompleto = nomeCompleto.toString();
    }

    public UsuarioBean() {
	// TODO Auto-generated constructor stub
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getPerfil_Usuario_idPerfil_Usuario() {
        return perfil_Usuario_idPerfil_Usuario;
    }

    public void setPerfil_Usuario_idPerfil_Usuario(int perfil_Usuario_idPerfil_Usuario) {
        this.perfil_Usuario_idPerfil_Usuario = perfil_Usuario_idPerfil_Usuario;
    }

    public String getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(String dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public int getSexo_idSexo() {
        return sexo_idSexo;
    }

    public void setSexo_idSexo(int sexo_idSexo) {
        this.sexo_idSexo = sexo_idSexo;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
       
   
}
