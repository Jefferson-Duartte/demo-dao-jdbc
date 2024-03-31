package application;

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
		
		System.out.println("=== Test 2 : Seller find by department ===");
		
		Department department = new Department(1, null);
		
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for(Seller objSeller : list) {
			System.out.println(objSeller);
		}
		
				
	}

}
