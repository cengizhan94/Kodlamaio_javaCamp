package kodlamaio.northwind.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.IProductService;
import kodlamaio.northwind.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
	
	private IProductService _productService;
	
	@Autowired
	public ProductsController(IProductService _productService) {
		super();
		this._productService = _productService;
	}

	@GetMapping("/getall")
	public List<Product> getAll(){
		return this._productService.getAll(); 
	}
}   