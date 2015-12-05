package sistema.bean;

public class EventoBean {

    private String nome;
    private String centro;
    private String datainicio;
    private String linkdoevento;
    private String datafim;
    private String urlimg;
    private String local;
    private String tipo;
    private String descricao;
    
    public EventoBean(String nome,String centro,String datainicio,String linkdoevento,
    		String datafim,String urlimg,String local,String tipo,String descricao) {
    	super();
    	this.nome = nome.toString();
    	this.centro = centro.toString();
    	this.datainicio = datainicio.toString();
    	this.linkdoevento = linkdoevento.toString();
    	this.datafim = datafim.toString();
    	this.urlimg = urlimg.toString();
    	this.local = local.toString();
    	this.tipo = tipo.toString();
    	this.descricao = descricao.toString();
        }

        public EventoBean() {
    	// TODO Auto-generated constructor stub
        }

    private int codigo;

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public String getCentro() {
	return centro;
    }

    public void setCnpj(String cnpj) {
	this.centro = centro;
    }

    public String getTelefone() {
	return datainicio;
    }

    public void setdatainicio(String datainicio) {
	this.datainicio = datainicio;
    }

    public String getlinkdoevento() {
	return linkdoevento;
    }

    public void setlinkdoevento(String linkdoevento) {
	this.linkdoevento = linkdoevento;
    }

    public String getdatafim() {
	return datafim;
    }

    public void setdatafim(String datafim) {
	this.datafim = datafim;
    }

    public String geturlimg() {
	return urlimg;
    }

    public void seturlimg(String propurlimgrietario) {
	this.urlimg = urlimg;
    }

    public String getlocal() {
	return local;
    }

    public void setlocal(String local) {
	this.local = local;
    }

    public String gettipo() {
	return tipo;
    }

    public void settipo(String tipo) {
	this.tipo = tipo;
    }
    
    public String getdescricao() {
    return descricao;
    }

    public void setdescricao(String descricao) {
    this.descricao = descricao;
    }

	public Object getIdEstabelecimento() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void excluirDadosEst(Object idEstabelecimento) {
		// TODO Auto-generated method stub
		
	}

	public void BuscarDados(String nomeEstabelecimento, EstabelecimentoBean estabelecimentobean) {
		// TODO Auto-generated method stub
		
	}

		// TODO Auto-generated method stub
		
	}
