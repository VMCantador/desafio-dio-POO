package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo{
	private LocalDate data;
	
	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}
	
	public Mentoria() {
	}
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	@Override
	public String toString() {
		DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/uuuu");
		return "Mentoria [titulo: " + getTitulo() + ", descricao: " + getDescricao() + ", data: " + data.format(formatters) + "]";
	}
	
	
}
