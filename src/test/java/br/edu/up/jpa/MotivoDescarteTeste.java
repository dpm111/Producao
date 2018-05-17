package br.edu.up.jpa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.edu.up.jpa.dominio.MotivoDescarte;
import br.edu.up.jpa.repository.MotivoDescarteRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MotivoDescarteTeste {

	
	@Autowired
	MotivoDescarteRepository motivoDescarteRepository;
		@Test
		public void testeMotivoDescarteTeste() {
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
			
			
			motivoDescarteRepository.save(new MotivoDescarte( "teste1", data));
			motivoDescarteRepository.save(new MotivoDescarte( "teste2", data));
			motivoDescarteRepository.save(new MotivoDescarte( "teste3", data));
			motivoDescarteRepository.save(new MotivoDescarte( "teste4", data));
			motivoDescarteRepository.save(new MotivoDescarte( "teste5", data));
			motivoDescarteRepository.save(new MotivoDescarte( "teste6", data));
			
			System.out.println("\n*************Todos as Motivos Descartes foram Salvas*************");
			
			
			motivoDescarteRepository.findAll().forEach(System.out::println);
			
			motivoDescarteRepository.findAll().forEach(motivoDescarte -> {
				motivoDescarte.setNome( (motivoDescarte.getNome() + 1.5));
				motivoDescarteRepository.save(motivoDescarte);
	        });

	        System.out.println("\n************* Motivos Descartes com novo NOME*************");
	        motivoDescarteRepository.findAll().forEach(System.out::println);
		    
	        motivoDescarteRepository.deleteAll();
	        System.out.println("\n*************Motivos Descartes excluídos*************");
	        motivoDescarteRepository.findAll().forEach(System.out::println);
			 
			
			
		}
		
	
	
	
}
