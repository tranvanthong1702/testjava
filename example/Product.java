package example;

public class Product {
	public int id;
	public String name;
	public int qulity;
//	public boolean isDelete;
	
	public Product(int id, String name, int qulity) {
		this.id=id;
		this.name=name;
		this.qulity=qulity;
		
		this.getInfor();
	}
	public int getId() {
		return id;
	}
	public int getQulity() {
		return qulity;
	}
	public void setPrice(int price)
	{
		this.qulity = qulity;
	}
	public void getInfor() {
		System.out.println("id:"+this.id+"\tname:"+this.name+"\t qulity:"+this.qulity);
	}
}