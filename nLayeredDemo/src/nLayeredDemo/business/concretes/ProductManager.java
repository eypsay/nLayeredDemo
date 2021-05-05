package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class ProductManager implements ProductService {

	// no:1 dogru yöntemi
	private ProductDao productDao;
	// private JLoggerManager jLoggerManager;
	private LoggerService loggerService;

	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	// end no:1
	@Override
	public void add(Product product) {
		// TIs Kodlari Buraya
		if (product.getCategoryId() == 1) {
			System.out.println("Bu kategoride urun kaul edilmiyor");
			return;
		}

		// YONTEM YANLIS no:1
		// HibernateProductDao dao= new HibernateProductDao();
		// dao.add(product);
		// end no:1

		this.productDao.add(product);
		this.loggerService.logToSystem("Ürün ekleme loglandý " + product.getName());
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
