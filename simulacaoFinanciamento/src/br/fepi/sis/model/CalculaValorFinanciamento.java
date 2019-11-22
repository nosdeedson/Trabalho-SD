package br.fepi.sis.model;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculaValorFinanciamento extends Remote{
	
	public double calculaFinanciamento( DadosSimulacao dados) throws RemoteException;

}
