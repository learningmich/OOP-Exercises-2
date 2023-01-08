public class MainProgram
{
  public static void main(String[] args) {
		Lazada lazada_item1, lazada_item2;
		Item_1 iteminfo1=new Item_1("Tote Bag",99,"sold out");
		Item_2 iteminfo2=new Item_2("Shoulder Bag",100,"sold out");

		lazada_item1=iteminfo1;
		System.out.println(lazada_item1.item_info());
		System.out.println("\nProduct name: "+ lazada_item1.getProductName());
		System.out.println("Item price: "+lazada_item1.getPrice());
		System.out.println("item info: "+iteminfo1.getItemInfo());	

		lazada_item2=iteminfo2;
		System.out.println(lazada_item2.item_info());
		System.out.println("\nProduct name: "+ lazada_item2.getProductName());
		System.out.println("Item price: "+ lazada_item2.getPrice());
		System.out.println("item info: "+iteminfo2.getItemInfo());	
	}
}
