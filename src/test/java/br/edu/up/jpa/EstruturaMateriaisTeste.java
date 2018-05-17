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

import br.edu.up.jpa.dominio.EstruturaMateriais;
import br.edu.up.jpa.repository.EstruturaMateriaisRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EstruturaMateriaisTeste {
	
	@Autowired
	EstruturaMateriaisRepository estruturaMateriaisRepository;
	
			@Test
			public void testeEstruturaMateriaisTeste() {
				
				
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
				
				
				
				//arquivoHistoricotransacoesRepository.save(new ArquivoHistoricoTransacoes(1,6,1,data, "P" ,60 ,(float) 5.95, data));
				estruturaMateriaisRepository.save(new EstruturaMateriais(1, 6, 1, data, data, "XAE", (short) 1, BigDecimal.valueOf(6), data));
				estruturaMateriaisRepository.save(new EstruturaMateriais(2, 5, 2, data, data, "QWE", (short) 2, BigDecimal.valueOf(5), data));
				estruturaMateriaisRepository.save(new EstruturaMateriais(3, 4, 3, data, data, "REW", (short) 3, BigDecimal.valueOf(4), data));
				estruturaMateriaisRepository.save(new EstruturaMateriais(4, 3, 4, data, data, "TEE", (short) 4, BigDecimal.valueOf(3), data));
				estruturaMateriaisRepository.save(new EstruturaMateriais(5, 2, 5, data, data, "TRE", (short) 5, BigDecimal.valueOf(2), data));
				estruturaMateriaisRepository.save(new EstruturaMateriais(6, 1, 6, data, data, "EWT", (short) 4, BigDecimal.valueOf(3), data));
				
				System.out.println("\n*************Todos os Arquivo Estruturas Materiais*************");
				estruturaMateriaisRepository.findAll().forEach(System.out::println);
			 
				estruturaMateriaisRepository.findAll().forEach(estruturaMateriais -> {
				estruturaMateriais.setNivelestrutura( (short) (estruturaMateriais.getNivelestrutura() + 1));
				estruturaMateriaisRepository.save(estruturaMateriais);
	        	});

	        	System.out.println("\n************* Estruturas Materiais com novO NIVEL*************");
	        	estruturaMateriaisRepository.findAll().forEach(System.out::println);
		    
	        	estruturaMateriaisRepository.deleteAll();
	        	System.out.println("\n*************Estruturas Materiais excluídos*************");
	        	estruturaMateriaisRepository.findAll().forEach(System.out::println);
				 
				
	
	}
	
}
