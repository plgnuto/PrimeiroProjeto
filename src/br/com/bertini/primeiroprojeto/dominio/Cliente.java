package br.com.bertini.primeiroprojeto.dominio;

public class Cliente {

	private int idadePrimitivo;
	private boolean clienteAtivoPrimitivo;
	private double valorPrimitivo;

	private Integer idadeWrapper;
	private Boolean clienteAtivoWrapper;
	private Double valorWrapper;
	
	public int getIdadePrimitivo() {
		return idadePrimitivo;
	}
	public void setIdadePrimitivo(int idadePrimitivo) {
		this.idadePrimitivo = idadePrimitivo;
	}
	public boolean isClienteAtivoPrimitivo() {
		return clienteAtivoPrimitivo;
	}
	public void setClienteAtivoPrimitivo(boolean clienteAtivoPrimitivo) {
		this.clienteAtivoPrimitivo = clienteAtivoPrimitivo;
	}
	public double getValorPrimitivo() {
		return valorPrimitivo;
	}
	public void setValorPrimitivo(double valorPrimitivo) {
		this.valorPrimitivo = valorPrimitivo;
	}
	public Integer getIdadeWrapper() {
		return idadeWrapper;
	}
	public void setIdadeWrapper(Integer idadeWrapper) {
		this.idadeWrapper = idadeWrapper;
	}
	public Boolean getClienteAtivoWrapper() {
		return clienteAtivoWrapper;
	}
	public void setClienteAtivoWrapper(Boolean clienteAtivoWrapper) {
		this.clienteAtivoWrapper = clienteAtivoWrapper;
	}
	public Double getValorWrapper() {
		return valorWrapper;
	}
	public void setValorWrapper(Double valorWrapper) {
		this.valorWrapper = valorWrapper;
	}
	@Override
	public String toString() {
		return "Cliente [idadePrimitivo=" + idadePrimitivo + ", clienteAtivoPrimitivo=" + clienteAtivoPrimitivo
				+ ", valorPrimitivo=" + valorPrimitivo + ", idadeWrapper=" + idadeWrapper + ", clienteAtivoWrapper="
				+ clienteAtivoWrapper + ", valorWrapper=" + valorWrapper + "]";
	}
	
}
