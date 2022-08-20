package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.IProductService;
import kodlamaio.northwind.dataAccess.abstracts.IProductDao;
import kodlamaio.northwind.entities.concretes.Product;

@Service
public class ProductManager implements IProductService{
	
	
	private IProductDao _productDao;
	
	@Autowired
	public ProductManager(IProductDao productDao) {
		super();
		this._productDao = productDao;
	}

	@Override
	public List<Product> getAll() {
		return this._productDao.findAll();
	}

}
