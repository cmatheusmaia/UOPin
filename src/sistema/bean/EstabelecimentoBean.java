package sistema.bean;

public class EstabelecimentoBean {

    private String nome;
    private String cnpj;
    private String telefone;
    private String ramodeatividade;
    private String endereconocampus;
    private String proprietario;
    private String horariodefuncionamento;

    private int codigo;

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public String getCnpj() {
	return cnpj;
    }

    public void setCnpj(String cnpj) {
	this.cnpj = cnpj;
    }

    public String getTelefone() {
	return telefone;
    }

    public void setTelefone(String telefone) {
	this.telefone = telefone;
    }

    public String getRamodeatividade() {
	return ramodeatividade;
    }

    public void setRamodeatividade(String ramodeatividade) {
	this.ramodeatividade = ramodeatividade;
    }

    public String getEndereconocampus() {
	return endereconocampus;
    }

    public void setEndereconocampus(String endereconocampus) {
	this.endereconocampus = endereconocampus;
    }

    public String getProprietario() {
	return proprietario;
    }

    public void setProprietario(String proprietario) {
	this.proprietario = proprietario;
    }

    public String getHorariodefuncionamento() {
	return horariodefuncionamento;
    }

    public void setHorariodefuncionamento(String horariodefuncionamento) {
	this.horariodefuncionamento = horariodefuncionamento;
    }

    public int getCodigo() {
	return codigo;
    }

    public void setCodigo(int codigo) {
	this.codigo = codigo;
    }

}
