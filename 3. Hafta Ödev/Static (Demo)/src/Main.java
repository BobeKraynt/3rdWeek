
public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.id = 3;
		product.name = "Mouse";
		product.price = 10;
		
		manager.add(product);

		
	DatabaseHelper.Crud.delete();
	DatabaseHelper.Connection.createConnection();
	}

}
