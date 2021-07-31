package br.ucsal.bes20211.poo.passby.domain.Enums;

public enum Sexo {
	
	MASCULINO(1, "Masculino"),
	FEMININO(2, "Feminino");
	
	private Integer codigo;

	private String descricao;

	private Sexo(Integer codigo, String descricao) {
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

	public static Sexo valueOfCodigo(Integer codigoSelecionado) {
		for (Sexo sexoOpcao : values()) {
			if (sexoOpcao.codigo.equals(codigoSelecionado)) {
				return sexoOpcao;
			}
		}
		return null;
	}
}
