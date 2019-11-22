package br.fepi.sis.Servidor;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import br.fepi.sis.model.CalculaValorFinanciamento;
import br.fepi.sis.model.ICalculaValorFinaciamento;

public class Servidor {
	
	private final int porta = 1099;
	private Registry registro;
	public Servidor() {
		ICalculaValorFinaciamento calc = new ICalculaValorFinaciamento();
		try {
			registro = LocateRegistry.createRegistry(porta);
			CalculaValorFinanciamento stub = (CalculaValorFinanciamento) UnicastRemoteObject.exportObject(calc,porta);
			registro.rebind("calculandoFinanciamento", stub);
			System.out.println("running ...");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new Servidor();
	}

}
