import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import com.mkyong.stock.Category;
import com.mkyong.stock.Stock;
import com.mkyong.util.HibernateUtil;
 
public class App {
	public static void main(String[] args) {
 
        System.out.println("Hibernate many to many (Annotation)");
	Session session = HibernateUtil.getSessionFactory().openSession();
 
	session.beginTransaction();
 
	Stock stock = new Stock();
        stock.setStockCode("1012");
        stock.setStockName("GRANT");
 
        Category category1 = new Category("CONSUMER", "CONSUMER COMPANY");
        Category category2 = new Category("INVESTMENT", "INVESTMENT COMPANY");
 
        Set<Category> categories = new HashSet<Category>();
        categories.add(category1);
        categories.add(category2);
 
        stock.setCategories(categories);
 
        session.save(stock);
 
	session.getTransaction().commit();
	System.out.println("Done");
	}
}

//Output

/*

Hibernate many TO many (Annotation)
Hibernate: 
    INSERT 
    INTO
        kinners.stock
        (STOCK_CODE, STOCK_NAME) 
    VALUES
        (?, ?)
Hibernate: 
    INSERT 
    INTO
        kinners.category
        (`DESC`, NAME) 
    VALUES
        (?, ?)
Hibernate: 
    INSERT 
    INTO
        kinners.category
        (`DESC`, NAME) 
    VALUES
        (?, ?)
Hibernate: 
    INSERT 
    INTO
        kinners.stock_category
        (STOCK_ID, CATEGORY_ID) 
    VALUES
        (?, ?)
Hibernate: 
    INSERT 
    INTO
        kinners.stock_category
        (STOCK_ID, CATEGORY_ID) 
    VALUES
        (?, ?)
Done

*/
