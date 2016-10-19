package niitffont.backend.Dao.Impl;

@Repository
public interface ProductsDaoImpl {
List<Products> products = new ArrayList<Products>();
	
	Product p = null;
	{
		
		p = new Products();
		p.setId(1);
		p.setName("iPhone");
		p.setPrice(24000.25);
		products.add(p);

		p = new Product();
		p.setId(2);
		p.setName("samsung");
		p.setPrice(13420.25);
		products.add(p);

		p = new Product();
		p.setId(3);
		p.setName("windows");
		p.setPrice(10420.25);
		products.add(p);

		
	}
	
	
	public List<Product> getAll() {		
		return products;
	}
}
