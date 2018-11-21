import org.hibernate.annotations.Entity;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTS")
public class Product {

    public String ProductName;
    public Integer UnitsOnStock;

    public Product(){
    }

    public Product(String name, Integer units){
        this.ProductName = name;
        this.UnitsOnStock = units;
    }




}
