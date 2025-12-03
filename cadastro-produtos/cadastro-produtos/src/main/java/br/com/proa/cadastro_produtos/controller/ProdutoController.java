package br.com.proa.cadastro_produtos.controller;

import br.com.proa.cadastro_produtos.model.Produto;
import br.com.proa.cadastro_produtos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @PostMapping
    public void salvaProduto(@RequestBody Produto produto){
        repository.save(produto);
    }

    @GetMapping
    public List<Produto> pegaProdutos(){
        return repository.findAll();
    }
}
