package br.edu.up.jpa;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.edu.up.jpa.dominio.Localizacao;
import br.edu.up.jpa.repository.LocalizacaoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LocalizacaoTeste {
	@Autowired
	LocalizacaoRepository localizacaoRepository;
		@Test
		public void localizacaoRepository() {
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
			//historicoTransacoesRepository.save(new HistoricoTransacoes(1,6,1,data, "P" ,60 ,(float) 5.95, data));
			localizacaoRepository.save(new Localizacao( "teste1", (float)1.3, BigDecimal.valueOf(1), data));
			localizacaoRepository.save(new Localizacao( "teste2", (float)2.3, BigDecimal.valueOf(2), data));
			localizacaoRepository.save(new Localizacao( "teste3", (float)3.3, BigDecimal.valueOf(3), data));
			localizacaoRepository.save(new Localizacao( "teste4", (float)4.3, BigDecimal.valueOf(4), data));
			localizacaoRepository.save(new Localizacao( "teste5", (float)5.3, BigDecimal.valueOf(5), data));
			localizacaoRepository.save(new Localizacao( "teste6", (float)6.3, BigDecimal.valueOf(6), data));
			
			System.out.println("\n*************Todos as Localizaçoes foram Salvas*************");
			
			localizacaoRepository.findAll().forEach(System.out::println);
			
			localizacaoRepository.findAll().forEach(localizacao -> {
				localizacao.setVariacaovalor( (float) (localizacao.getVariacaovalor() + 1.5));
				localizacaoRepository.save(localizacao);
	        });

	        System.out.println("\n************* Localização com nova variaçao*************");
	        localizacaoRepository.findAll().forEach(System.out::println);
		    
	        localizacaoRepository.deleteAll();
	        System.out.println("\n*************Localização excluídos*************");
	        localizacaoRepository.findAll().forEach(System.out::println);
			 
		}
		
}
