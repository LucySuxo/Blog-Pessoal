package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import javax.persistence.Entity; //sempre importar
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp; //Hibernate é uma biblioteca
//anotações
@Entity //Transforma aclasse em uma tabela/entidade
@Table(name = "tb_postagem") //Vamos renomear a tabela, e o nome nesse caso é tb_postagem
public class Postagem {
     //VALIDAR ID
	@Id//logica para fazer a varivel ID no Banco de dados
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Responsavel em transformar em auto increment
	//vai fazer a logica de cadastrar, apartir do número 1
	private Long id;//variavel
	
	@NotBlank //javax.validation
	//@not null -> não pode deixar de ser informado
	//@not blank -> IGUAL O NOT MAIS não deixa preencher com espaços em branco tbm além de tornar obrigatório
    @Size(min = 2, max = 50) // tamanho/quantidade dos caracteres do ID no caso
	private String titulo;
	@NotBlank
	@Size(max = 1000)
	private String texto;
	@UpdateTimestamp //atualiza a data e hora conforme o sistema da pessoa que utilizar
	private LocalDateTime data;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
	
	
}
