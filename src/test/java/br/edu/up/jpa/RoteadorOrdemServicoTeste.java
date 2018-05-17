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

import br.edu.up.jpa.dominio.RoteadorOrdemServico;
import br.edu.up.jpa.repository.RoteadorOrdemServicoRepository;



@RunWith(SpringRunner.class)
@SpringBootTest
public class RoteadorOrdemServicoTeste {
	
	@Autowired
	RoteadorOrdemServicoRepository roteadorOrdemServicoRepository;
	
		@Test
		public void testeRoteadorOrdemServicoTeste() {
			
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
			//int idordemservico, int idproduto, int sequenciaoperacao,
			//Date datainicioagendada, Date datafimagendada, Date datainicioreal, Date datafimreal, BigDecimal recursoshrsreal, 
			//float custoplanejado, float custoreal, Date datamodificacao
			roteadorOrdemServicoRepository.save(new RoteadorOrdemServico(1,6,1,data,data,data,data,BigDecimal.valueOf(1),(float) 6.95,(float) 2.95,data));
			roteadorOrdemServicoRepository.save(new RoteadorOrdemServico(2,6,1,data,data,data,data,BigDecimal.valueOf(1),(float) 7.95,(float) 3.95,data));
			roteadorOrdemServicoRepository.save(new RoteadorOrdemServico(3,6,1,data,data,data,data,BigDecimal.valueOf(1),(float) 8.95,(float) 5.95,data));
			roteadorOrdemServicoRepository.save(new RoteadorOrdemServico(4,6,1,data,data,data,data,BigDecimal.valueOf(1),(float) 9.95,(float) 4.95,data));
			roteadorOrdemServicoRepository.save(new RoteadorOrdemServico(5,6,1,data,data,data,data,BigDecimal.valueOf(1),(float) 20.95,(float) 8.95,data));
			roteadorOrdemServicoRepository.save(new RoteadorOrdemServico(6,6,1,data,data,data,data,BigDecimal.valueOf(1),(float) 10.95,(float) 1.95,data));
			
		
			
			
			System.out.println("\n*************Todos os Arquivo Historicos*************");
			roteadorOrdemServicoRepository.findAll().forEach(System.out::println);
			 
			roteadorOrdemServicoRepository.findAll().forEach(roteadorOrdemServico -> {
				roteadorOrdemServico.setCustoplanejado( (float) (roteadorOrdemServico.getCustoplanejado() + 1.5));
				roteadorOrdemServicoRepository.save(roteadorOrdemServico);
	        });

	        System.out.println("\n************* Arquivo Historicos com novo CUSTO*************");
	        roteadorOrdemServicoRepository.findAll().forEach(System.out::println);
		    
	        roteadorOrdemServicoRepository.deleteAll();
	        System.out.println("\n*************Arquivo Historicos excluídos*************");
	        roteadorOrdemServicoRepository.findAll().forEach(System.out::println);
		     
		}
}