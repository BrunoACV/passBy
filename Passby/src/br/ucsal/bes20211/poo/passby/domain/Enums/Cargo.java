package br.ucsal.bes20211.poo.passby.domain.Enums;

public enum Cargo {

	PORTEIRO (1, "Porteiro"),
	ZELADOR(2, "Zelador"), 
	ADMINISTRADOR(3, "Administrador");
	
	private Integer codigo;

	private String descricao;

	private Cargo(Integer codigo, String descricao) {
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

	public static Cargo valueOfCodigo(Integer codigoSelecionado) {
		for (Cargo cargoOpcao : values()) {
			if (cargoOpcao.codigo.equals(codigoSelecionado)) {
				return cargoOpcao;
			}
		}
		return null;
	}
}
