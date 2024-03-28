package AulaPW;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto implements Serializable {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigoBarra;
	private String nome;
	private String marca;
	private Integer qtd;
	private String data;
	
	
	public Produto() {}
	
	
	
	
	public Produto(Integer codigoBarra, String nome, String marca, Integer qtd, String data) {
		this.codigoBarra = codigoBarra;
		this.nome = nome;
		this.marca = marca;
		this.qtd = qtd;
		this.data = data;
	}





	public Integer getCodigoBarra() {
		return codigoBarra;
	}




	public void setCodigoBarra(Integer codigoBarra) {
		this.codigoBarra = codigoBarra;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getMarca() {
		return marca;
	}




	public void setMarca(String marca) {
		this.marca = marca;
	}




	public Integer getQtd() {
		return qtd;
	}




	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}




	public String getData() {
		return data;
	}




	public void setData(String data) {
		this.data = data;
	}




	@Override
	public String toString() {
		return "Produto [codigoBarra=" + codigoBarra + ", nome=" + nome + ", marca=" + marca + ", qtd=" + qtd
				+ ", data=" + data + "]";
	}




	
	
	
	
	
	
}
