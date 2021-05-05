package nLayeredDemo;

import java.util.ArrayList;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Buna 6. eleman eklenmez
		// int[] sayilar = { 1, 2, 3, 4, 5 };
		// sayilar[5]=7;

		// Bunun i�in arrray list kullan�l�r
		// ArrayList<Integer> sayilar2 = new ArrayList<Integer>() ;
		// sayilar2.add(1);
		// sayilar2.add(77);

		Product product = new Product(1, 2, "elma", 12, 50);

		// projede entitiler hairc new leme varsa porblem yasars�n
		// TODO :Spirng IOC ile iyilestirelecek
		ProductService productService = new ProductManager(new HibernateProductDao(),new JLoggerManagerAdapter());
		// Burada manager t�r�nde tan�mlamad�k. C�nk� managerlara interdfaceler
		// �zerinden gidilir
		productService.add(product);

		ProductService productService2 = new ProductManager(new AbcProductDao(),
				new JLoggerManagerAdapter());
		productService2.add(product);
		
		//D�s servisler core katma�nan eklenir.Adaptasyon ile ger�el�tirilir
	}

}
