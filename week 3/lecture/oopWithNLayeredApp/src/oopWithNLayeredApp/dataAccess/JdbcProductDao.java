package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;
//add fonksiyonunda kullanılan product nesnesi başka bir paketten olduğu için, bunu belirtmek için o paketi import etmek gerekir.

public class JdbcProductDao implements ProductDao{  //dao = data access object
	public void add(Product product) {
		//sadece ve sadece db erişim kodları buraya yazılır
		System.out.println("JDBC ile veri tabanına eklendi");
	}
}




