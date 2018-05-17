package br.edu.up.jpa;

import br.edu.up.jpa.dominio.ArquivoHistoricoTransacoes;
import br.edu.up.jpa.repository.ArquivoHistoricotransacoesRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class ArquivoHistoricotransacoesTeste {
	
	@Autowired
	ArquivoHistoricotransacoesRepository arquivoHistoricotransacoesRepository;
	
		@Test
		public void testeHistoricoCustoProdutoTeste() {
			
			String data2 = ("2017-10-10 00:00");
			SimpleDateFormat datanasc = new SimpleDateFormat("yyyy-MM-dd");
			Date data = null;
			try {
				data = datanasc.parse(data2);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(data);
			//int idtransacao, float custoreal, Date datadransacao, Date datamodificacao, int idlinhaordemreferencia, 
			//int idordemreferencia, int idproduto, int quantidade, String tipotransacao
			arquivoHistoricotransacoesRepository.save(new ArquivoHistoricoTransacoes(1,6,1,data, "P" ,60 ,(float) 5.95, data));
			arquivoHistoricotransacoesRepository.save(new ArquivoHistoricoTransacoes(1,5,1,data, "S" ,50 ,(float) 6.95, data));
			arquivoHistoricotransacoesRepository.save(new ArquivoHistoricoTransacoes(1,4,1,data, "P" ,40 ,(float) 7.95, data));
			arquivoHistoricotransacoesRepository.save(new ArquivoHistoricoTransacoes(1,3,1,data, "S" ,30 ,(float) 8.95, data));
			arquivoHistoricotransacoesRepository.save(new ArquivoHistoricoTransacoes(1,2,1,data, "P" ,20 ,(float) 9.95, data));
			arquivoHistoricotransacoesRepository.save(new ArquivoHistoricoTransacoes(1,1,1,data, "S" ,10 ,(float) 10.95, data));
		
			
			
			System.out.println("\n*************Todos os Arquivo Historicos*************");
			arquivoHistoricotransacoesRepository.findAll().forEach(System.out::println);
			 
			arquivoHistoricotransacoesRepository.findAll().forEach(arquivoHistoricoTransacoes -> {
				arquivoHistoricoTransacoes.setCustoreal( (float) (arquivoHistoricoTransacoes.getCustoreal() + 1.5));
				arquivoHistoricotransacoesRepository.save(arquivoHistoricoTransacoes);
	        });

	        System.out.println("\n************* Arquivo Historicos com novo CUSTO*************");
	        arquivoHistoricotransacoesRepository.findAll().forEach(System.out::println);
		    
	        arquivoHistoricotransacoesRepository.deleteAll();
	        System.out.println("\n*************Arquivo Historicos excluídos*************");
	        arquivoHistoricotransacoesRepository.findAll().forEach(System.out::println);
		     
		}
}