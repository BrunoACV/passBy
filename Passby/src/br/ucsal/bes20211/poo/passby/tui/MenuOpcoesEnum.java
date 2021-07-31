package br.ucsal.bes20211.poo.passby.tui;

public enum MenuOpcoesEnum {

	CADASTRAR_APARTAMENTO(1, "Cadastrar apartamento"),

	CADASTRAR_RESIDENTE(2, "Cadastrar residente"),

	CADASTRAR_FUNCIONARIO(3, "Cadastrar funcionário"),
	
	CADASTRAR_OCORRENCIA(4, "Cadastrar ocorrência"),

	CADASTRAR_VISITANTE(5, "Cadastrar visitante"),
	
	REMOVER_VISITANTE(6, "Remover visitante"),
	
	REMOVER_RESIDENTE(7, "Remover residente"),
	
	REMOVER_FUNCIONARIO(8, "Remover funcionario"),	
	
	LISTAR_APARTAMENTOS(9, "Listar apartamento"),

	LISTAR_FUNCIONARIOS(10, "Listar funcionarios"),
	
	LISTAR_OCORRENCIAS(11, "Listar ocorrências"),
	
	LISTAR_VAGAS_VISITANTES(12,"Listar vagas de visitantes"),	

	SAIR(13, "Sair"),

	DEFAULT(14, "Erro");

	private Integer codigo;

	private String descricao;

	private MenuOpcoesEnum(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public String obterDescricaoCompleta() {
		return codigo + " - " + descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public static MenuOpcoesEnum valueOfCodigo(Integer codigoSelecionado) {
		for (MenuOpcoesEnum menuOpcao : values()) {
			if (menuOpcao.codigo.equals(codigoSelecionado)) {
				return menuOpcao;
			}
		}
		return null;
	}

}
