package digital.one.produtsCatalog.controller;

import digital.one.produtsCatalog.model.Product;
import digital.one.produtsCatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired // faz injecao ProductRepository
    private ProductRepository productRepository; // instancia

    @RequestMapping(method = RequestMethod.POST)
    Product create(@RequestBody Product product) {
        return productRepository.save(product);
    }

    // buscando product pelo id
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Optional<Product>  findById(@PathVariable Integer id) {
       return productRepository.findById(id);
    }
}
