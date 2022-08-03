package co.edu.homework0725;

public class Product {
//	필드 가격 : 갯수
	private int price; // 내 자신에서만 사용가능하기 때문에 접근 가능하게 getter setter 생성
	private int amount;

//	생성자
	
	
//	메소드

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price <0) {
			price = 0;
		}
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
