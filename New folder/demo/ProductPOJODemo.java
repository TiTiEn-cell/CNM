package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.mongodb.client.MongoDatabase;

import dao.ProductDAO;
import dao.ProductPOJODAO;
import entities.Product;
import utils.DBConnection;

public class ProductPOJODemo {

	public static void main(String[] args) {
		DBConnection conn = new DBConnection();
		MongoDatabase db = conn.getDatabase();
		
//		ProductPOJODAO productDAO = new ProductPOJODAO(db);
//		List<Product> products = new ArrayList<>();
//		Random rd = new Random();
//		String[] colorList = new String[] {"red", "yellow", "black", "gray"};
//		for(int i=322; i < 332; i++) {
//			List<String> colors = new ArrayList<>();
//			
//			int n = rd.nextInt(colorList.length) + 1;
//			for(int j=0; j < n; j++) {
//				colors.add(colorList[rd.nextInt(colorList.length)]);
//			}
//			products.add(new Product("" + i, "Brand name " + i, "Category name " + i, "Product Name " + i, colors,
//					2022, 140.99));
//		
//		}
//		
//		productDAO.addProducts(products);
//		
//		productDAO.getProductList()
//		.forEach(product -> System.out.println(product));
//		
//		productDAO.getProductMaxPrice();
		

		ProductDAO productUtilDAO = new ProductDAO(db);
		Map<Integer, Integer> map = productUtilDAO.getTotalByYear();
		map.entrySet().iterator()
		.forEachRemaining(entry -> {
			System.out.println("Model year: " + entry.getKey());
			System.out.println("Num of products: " + entry.getValue());
		});
	}

}
