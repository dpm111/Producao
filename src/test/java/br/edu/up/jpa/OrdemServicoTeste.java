package br.edu.up.jpa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.edu.up.jpa.dominio.OrdemServico;
import br.edu.up.jpa.repository.OrdemServicoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrdemServicoTeste {
	@Autowired
	OrdemServicoRepository ordemServicoRepository;
	
		@Test
		public void testeOrdemServicoTeste() {
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
			
			
			ordemServicoRepository.save(new OrdemServico(1,6,1,(short)6,data, data,data, (short)1,data));
			ordemServicoRepository.save(new OrdemServico(2,5,2,(short)6,data, data,data, (short)2,data));
			ordemServicoRepository.save(new OrdemServico(3,4,3,(short)6,data, data,data, (short)3,data));
			ordemServicoRepository.save(new OrdemServico(4,3,4,(short)6,data, data,data, (short)4,data));
			ordemServicoRepository.save(new OrdemServico(5,2,5,(short)6,data, data,data, (short)5,data));
			ordemServicoRepository.save(new OrdemServico(6,1,6,(short)6,data, data,data, (short)6,data));
			 
			
			System.out.println("\n*************Todos as Ordem Serviço*************");
			ordemServicoRepository.findAll().forEach(System.out::println);
			 
			ordemServicoRepository.findAll().forEach(ordemServico -> {
				ordemServico.setQtdestoque(  (ordemServico.getQtdestoque() + 1));
				ordemServicoRepository.save(ordemServico);
	        });

	        System.out.println("\n************* Ordem Serviço com novo Estoque*************");
	        ordemServicoRepository.findAll().forEach(System.out::println);
		    
	        ordemServicoRepository.deleteAll();
	        System.out.println("\n*************Ordem Serviço excluídos*************");
	        ordemServicoRepository.findAll().forEach(System.out::println);
			 
			
		}
}
//OrdemServicoRepository OrdemServico