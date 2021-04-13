package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {

    public static void main(String[] args) {


    //Department obj = new Department(1, "Books");
    //Seller seller = new Seller(21, "Bob", "kjshdkjshdkjsh", new Date(), 3000.00, obj);
        System.out.println("====TESTE 1: Seller findById ====");
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
}
}
