package br.fepi.sis.model;

import java.rmi.RemoteException;

public class ICalculaValorFinaciamento implements CalculaValorFinanciamento {

	@Override
	public double calculaFinanciamento(DadosSimulacao dados) throws RemoteException {
		
		// TODO Auto-generated method stub
		double retorno = 0;
		if(dados.isConstruirCasa()) 
		{
			retorno = dados.getAndares() * dados.getMetrosQuadradosCasa() * 1152.87; 
			/*
			 *  Em setembro de 2019, o custo do metro quadrado na construção civil 
			 *  brasileira foi de R$ 1.152,87, em média, segundo o Índice Nacional da Construção Civil 
			 *  (INCC/Sinapi). As informações são do Instituto Brasileiro de Geografia e Estatística (IBGE).
			 *  https://www.aecweb.com.br/revista/noticias/veja-o-valor-do-metro-quadrado-na-construcao-civil-neste-mes/18498
			 */
			double taxaAno = (6.75 / 100) / 12;
			for( int i = 0; i < dados.getMesesFinanciamento(); i++) {
				retorno += retorno * taxaAno;
			}
			/*
			 * Taxa de juros 6,75 Caixa
			 * https://www1.folha.uol.com.br/mercado/2019/10/caixa-reduz-taxa-minima-de-juros-a-credito-imobiliario-para-675.shtml
			 */
		} else
		{	
			double taxaAno = (6.75 / 100) / 12;
			retorno = dados.getValorImovel();
			for( int i = 0; i < dados.getMesesFinanciamento(); i++) {
				retorno += retorno * taxaAno;
			}		
		}
		return retorno;
	}

}
