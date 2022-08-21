package kodlamaio.northwind.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
	
	private ProductService _productService;
	
	@Autowired
	public ProductsController(ProductService _productService) {
		super();
		this._productService = _productService;
	}

	@GetMapping("/getall")
	public DataResult<List<Product>> getAll(){
		return this._productService.getAll(); 
	}
	
	@PostMapping("/add")
	public Result Add(@RequestBody Product product) {
		return this._productService.Add(product);
	}
}   