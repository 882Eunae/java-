package review;



public class snack {

	private String name; 
	private int price; 
	private	String expiry; //유통기한 
	private String brand; //브랜드 
	
	snack(String name,int price,String expiry,String brand){
		this.name=name;
		this.price=price;
		this.expiry=expiry;
		this.brand=brand; 
		
	}//생성자
	
	snack(){	}
	
	public void showSnack(snack[] snackstore,int i) {
		
		System.out.println(snackstore[i].name+"   "+snackstore[i].price+"   "+snackstore[i].expiry+"   "+snackstore[i].brand);

		System.out.println("과자먹고싶다");
		
		
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getExpiry() {
		return expiry;
	}

	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	
	
	
}
