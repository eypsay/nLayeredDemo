package nLayeredDemo;

import java.util.ArrayList;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Buna 6. eleman eklenmez
		// int[] sayilar = { 1, 2, 3, 4, 5 };
		// sayilar[5]=7;

		// Bunun için arrray list kullanýlýr
		// ArrayList<Integer> sayilar2 = new ArrayList<Integer>() ;
		// sayilar2.add(1);
		// sayilar2.add(77);

		Product product = new Product(1, 2, "elma", 12, 50);

		// projede entitiler hairc new leme varsa porblem yasarsýn
		// TODO :Spirng IOC ile iyilestirelecek
		ProductService productService = new ProductManager(new HibernateProductDao());
		// Burada manager türünde tanýmlamadýk. Cünkü managerlara interdfaceler
		// üzerinden gidilir
		productService.add(product);

		ProductService productService2 = new ProductManager(new AbcProductDao());
		productService2.add(product);
	}

}
