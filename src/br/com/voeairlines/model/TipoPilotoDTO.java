package br.com.voeairlines.model;

public class TipoPilotoDTO{

	private int id;
	private String descricao;
	
	public TipoPilotoDTO(){
		//construtor vazio
		
	}
	public TipoPilotoDTO(String descricao) {
		this.descricao = descricao;
		//construtor com parametro
	}
	public TipoPilotoDTO(int id, String descicao) {
		super();
		this.id = id;
		
	}
}
