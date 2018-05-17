package br.edu.up.jpa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.edu.up.jpa.dominio.Produto;
import br.edu.up.jpa.repository.ProdutoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProdutoTeste {
	@Autowired
	ProdutoRepository produtoRepository;
		@Test
		public void testeProdutoTeste() {
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
			
						produtoRepository.save(new Produto(data,(byte) 0, (byte)1, "teste", "1"));
						produtoRepository.save(new Produto(data,(byte) 1, (byte)0, "teste", "2"));
						produtoRepository.save(new Produto(data,(byte) 0, (byte)1, "teste", "3"));
						produtoRepository.save(new Produto(data,(byte) 1, (byte)0, "teste", "4"));
						produtoRepository.save(new Produto(data,(byte) 0, (byte)1, "teste", "5"));
						produtoRepository.save(new Produto(data,(byte) 1, (byte)0, "teste", "16"));


			System.out.println("\n*************Todos os Produtos foram Salvas*************");
			
			
			produtoRepository.findAll().forEach(System.out::println);
			
			produtoRepository.findAll().forEach(produto -> {
				produto.setNome( (produto.getNome()+1.3));
				produtoRepository.save(produto);
	        });

	        System.out.println("\n************* Produtos com novo NOME*************");
	        produtoRepository.findAll().forEach(System.out::println);
		    
	        produtoRepository.deleteAll();
	        System.out.println("\n*************Produtos excluídos*************");
	        produtoRepository.findAll().forEach(System.out::println);
 
	}
}
