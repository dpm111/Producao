package br.edu.up.jpa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.edu.up.jpa.dominio.UnidadeMedida;
import br.edu.up.jpa.repository.UnidadeMedidaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UnidadeMedidaTeste {

	
	@Autowired
	UnidadeMedidaRepository unidadeMedidaRepository;
		@Test
		public void testeUnidadeMedidaTeste() {
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
			
			 
			unidadeMedidaRepository.save(new UnidadeMedida( "tes","tes1", data));
			unidadeMedidaRepository.save(new UnidadeMedida( "set","tes2", data));
			unidadeMedidaRepository.save(new UnidadeMedida( "rew","tes3", data));
			unidadeMedidaRepository.save(new UnidadeMedida( "qwe","tes4", data));
			unidadeMedidaRepository.save(new UnidadeMedida( "tre","tes5", data));
			unidadeMedidaRepository.save(new UnidadeMedida( "gdf","tes6", data));
	
			
			System.out.println("\n*************Todas as unidade Medida foram Salvas*************");
			
			
			unidadeMedidaRepository.findAll().forEach(System.out::println);
			
			unidadeMedidaRepository.findAll().forEach(unidadeMedida -> {
				unidadeMedida.setNome( (unidadeMedida.getNome() + 1.5));
				unidadeMedidaRepository.save(unidadeMedida);
	        });

	        System.out.println("\n************* unidade Medida  com novo NOME*************");
	        unidadeMedidaRepository.findAll().forEach(System.out::println);
		    
	        unidadeMedidaRepository.deleteAll();
	        System.out.println("\n*************unidade Medida  excluídos*************");
	        unidadeMedidaRepository.findAll().forEach(System.out::println);
			 
			 
			
			
		}
}
