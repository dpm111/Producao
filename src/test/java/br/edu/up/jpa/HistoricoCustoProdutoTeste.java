package br.edu.up.jpa;

import br.edu.up.jpa.dominio.HistoricoCustoProduto;
import br.edu.up.jpa.repository.HistoricoCustoProdutoRespository;

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
public class HistoricoCustoProdutoTeste {
	
	@Autowired
	HistoricoCustoProdutoRespository historicoCustoProdutoRespository;
	
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
			
			historicoCustoProdutoRespository.save(new HistoricoCustoProduto(1, data,data,(float) 5.95, data));
			historicoCustoProdutoRespository.save(new HistoricoCustoProduto(2, data,data, (float) 7.95, data));
			historicoCustoProdutoRespository.save(new HistoricoCustoProduto(3, data,data, (float) 8.95, data));
			historicoCustoProdutoRespository.save(new HistoricoCustoProduto(4, data,data, (float) 9.95, data));
			historicoCustoProdutoRespository.save(new HistoricoCustoProduto(5, data,data, (float) 10.95, data));
			
			
			System.out.println("\n*************Todos os Historicos*************");
			historicoCustoProdutoRespository.findAll().forEach(System.out::println);
			 
	        historicoCustoProdutoRespository.findAll().forEach(historicoCustoProduto -> {
	        	historicoCustoProduto.setCustopadrao( (float) (historicoCustoProduto.getCustopadrao() + 1.5));
	            historicoCustoProdutoRespository.save(historicoCustoProduto);
	        });

	        System.out.println("\n*************Historicos com novo CUSTO*************");
	        historicoCustoProdutoRespository.findAll().forEach(System.out::println);
		    
	        historicoCustoProdutoRespository.deleteAll();
	        System.out.println("\n*************Historicos excluídos*************");
	        historicoCustoProdutoRespository.findAll().forEach(System.out::println);
		     
		}
}
