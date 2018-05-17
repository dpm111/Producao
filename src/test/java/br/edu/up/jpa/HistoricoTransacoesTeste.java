package br.edu.up.jpa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.edu.up.jpa.dominio.HistoricoTransacoes;
import br.edu.up.jpa.repository.HistoricoTransacoesRepository;



@RunWith(SpringRunner.class)
@SpringBootTest
public class HistoricoTransacoesTeste {
	
	@Autowired
	HistoricoTransacoesRepository historicoTransacoesRepository;
	
		@Test
		public void testeHistoricoTransacoesTeste() {
			
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
			historicoTransacoesRepository.save(new HistoricoTransacoes(1,6,1,data, "P" ,60 ,(float) 5.95, data));
			historicoTransacoesRepository.save(new HistoricoTransacoes(1,5,1,data, "S" ,50 ,(float) 6.95, data));
			historicoTransacoesRepository.save(new HistoricoTransacoes(1,4,1,data, "P" ,40 ,(float) 7.95, data));
			historicoTransacoesRepository.save(new HistoricoTransacoes(1,3,1,data, "S" ,30 ,(float) 8.95, data));
			historicoTransacoesRepository.save(new HistoricoTransacoes(1,2,1,data, "P" ,20 ,(float) 9.95, data));
			historicoTransacoesRepository.save(new HistoricoTransacoes(1,1,1,data, "S" ,10 ,(float) 10.95, data));
		
			
			
			System.out.println("\n*************Todos os Arquivo Historicos*************");
			historicoTransacoesRepository.findAll().forEach(System.out::println);
			 
			historicoTransacoesRepository.findAll().forEach(historicoTransacoes -> {
				historicoTransacoes.setCustoreal( (float) (historicoTransacoes.getCustoreal() + 1.5));
				historicoTransacoesRepository.save(historicoTransacoes);
	        });

	        System.out.println("\n************* Arquivo Historicos com novo CUSTO*************");
	        historicoTransacoesRepository.findAll().forEach(System.out::println);
		    
	        historicoTransacoesRepository.deleteAll();
	        System.out.println("\n*************Arquivo Historicos excluídos*************");
	        historicoTransacoesRepository.findAll().forEach(System.out::println);
		     
		}
}