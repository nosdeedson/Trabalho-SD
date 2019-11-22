package br.fepi.sis.model;

import java.io.Serializable;

public class DadosSimulacao implements Serializable{
	
	private int metrosQuadradosCasa;
	private int mesesFinanciamento;
	private int andares;
	private boolean construirCasa; // true construir, false comprar pronta
	private double valorImovel; // será diferente de zero para compra
	
	
	public DadosSimulacao(){
		super();
	}
	public DadosSimulacao(int metrosQuadradosCasa, int mesesFinanciamento, int andares, boolean construirCasa,
			int valorImovel) {
		super();
		this.metrosQuadradosCasa = metrosQuadradosCasa;
		this.mesesFinanciamento = mesesFinanciamento;
		this.andares = andares;
		this.construirCasa = construirCasa;
		this.valorImovel = valorImovel;
	}
	public int getMetrosQuadradosCasa() {
		return metrosQuadradosCasa;
	}
	public void setMetrosQuadradosCasa(int metrosQuadradosCasa) {
		this.metrosQuadradosCasa = metrosQuadradosCasa;
	}
	public int getMesesFinanciamento() {
		return mesesFinanciamento;
	}
	public void setMesesFinanciamento(int mesesFinanciamento) {
		this.mesesFinanciamento = mesesFinanciamento;
	}
	public int getAndares() {
		return andares;
	}
	public void setAndares(int andares) {
		this.andares = andares;
	}
	public boolean isConstruirCasa() {
		return construirCasa;
	}
	public void setConstruirCasa(boolean construirCasa) {
		this.construirCasa = construirCasa;
	}
	public double getValorImovel() {
		return valorImovel;
	}
	public void setValorImovel(double valorImovel) {
		this.valorImovel = valorImovel;
	}
	
	
}
