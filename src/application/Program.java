package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("=== Test 1 : Seller find by id ===");
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(12);
		
		System.out.println(seller);
		
		System.out.println("===============================================================================");
		
		
		System.out.println("=== Test 2 : Seller find by department ===");
		
		Department department = new Department(1, null);
		
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for(Seller objSeller : list) {
			System.out.println(objSeller);
		}
		
		System.out.println("===============================================================================");
		
		
		System.out.println("=== Test 3 : Seller find all ===");
		
		list = sellerDao.findAll();
		
		for(Seller objSeller : list) {
			System.out.println(objSeller);
		}
		
		System.out.println("===============================================================================");
		
		System.out.println("=== Test 4 : Insert new Seller ===");
	
//		Seller newSeller = new Seller(null,"Seller", "seller@gmail.com", new Date(), 2000.0, department);
//		sellerDao.insert(newSeller);
		
//		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("===============================================================================");
		
		System.out.println("=== Test 5 : Update Seller ===");
		
		seller = sellerDao.findById(7);
		seller.setName("Jefferson Duarte");
		
		sellerDao.update(seller);
		
		System.out.println("Update completed");
		
				
	}

}
