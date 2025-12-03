package br.com.proa.cadastro_produtos.repository;

import br.com.proa.cadastro_produtos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    List<Produto> findByNomeProduto(String nome);
}
