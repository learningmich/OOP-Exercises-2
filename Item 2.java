public class Item_2 extends Lazada
{
  String Item_info;
	public Item_2(String product_name, int price, String Item_info) {
		super(product_name,price);
		this.Item_info=Item_info;
	}

	public String item_info() {
		return "\nSecond Item.";
	}

	public String getItemInfo() {
		return Item_info;
	}

	public void setItemInfo(String Item_info) {
		this.Item_info=Item_info;
	}
}
