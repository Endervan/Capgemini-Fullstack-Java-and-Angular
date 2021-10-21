package digital.one.produtsCatalog.repository;

import digital.one.produtsCatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Integer> {
}
