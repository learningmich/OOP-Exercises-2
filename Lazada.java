public  abstract class Lazada
{
  protected String product_name;
	protected int price;

	public Lazada(String product_name, int price) {
		this.product_name=product_name;
		this.price=price;
	}

	public abstract String item_info();

	public String getProductName(){
		return product_name;
	}
	public void setProductName(String product_name) {
		this.product_name=product_name;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price=price;
	}
}
