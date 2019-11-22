package br.fepi.sis.controller;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import br.fepi.sis.model.CalculaValorFinanciamento;
import br.fepi.sis.model.DadosSimulacao;

public class Client {
	
	public static double chamadaRemota( DadosSimulacao dados)
	{
		double valorFinanciamento = 0.0;
		
		try {
			
			CalculaValorFinanciamento proxy = (CalculaValorFinanciamento) Naming.lookup("rmi://localhost/calculandoFinanciamento");
			valorFinanciamento = proxy.calculaFinanciamento(dados);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return valorFinanciamento;
	}

}
