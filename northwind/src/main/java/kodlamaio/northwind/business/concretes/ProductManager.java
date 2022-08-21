package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService{
	
	
	private ProductDao _productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this._productDao = productDao;
	}

	@Override
	public DataResult<List<Product>>getAll(){
		return new SuccessDataResult<List<Product>>(this._productDao.findAll());
	}

	@Override
	public Result Add(Product product) {
		this._productDao.save(product);
		return new SuccessResult("Product Added.");
				
	}

}
