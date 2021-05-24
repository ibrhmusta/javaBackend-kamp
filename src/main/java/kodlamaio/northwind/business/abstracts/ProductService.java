package kodlamaio.northwind.business.abstracts;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.entites.concretes.Product;

import java.util.List;

public interface ProductService {
    DataResult<List<Product>> getAll();
}
