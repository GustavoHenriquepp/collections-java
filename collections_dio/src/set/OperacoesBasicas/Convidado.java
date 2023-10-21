package set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
	//atributos
	private String nome;
	private int codigoConvite;
	
	//construtor
	public Convidado(String nome, int codigoConvite) {
		super();
		this.nome = nome;
		this.codigoConvite = codigoConvite;
	}

	//getters
	public String getNome() {
		return nome;
	}

	public int getCodigoConvite() {
		return codigoConvite;
	}

	@Override
	public String toString() {
		return "Convidado [nome=" + nome + ", codigoConvite=" + codigoConvite + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoConvite);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		return codigoConvite == other.codigoConvite;
	}
	
	
	
	

}
