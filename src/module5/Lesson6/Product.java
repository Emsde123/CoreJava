package module5.Lesson6;

public class Product {

	String name;
	int availableCount;
	double price;
	int returnedCount;
	
	
	
	public int sellProduct(int productSold) {
		if(productSold <= availableCount) {
			availableCount -= productSold;
		}else {
			System.out.println("Not enough inventory.");
		}
		System.out.println("There's " + availableCount + " " + name + " left!");
		return productSold;
	}
	
	public int returnProduct(int itemsReturned) {
		returnedCount += itemsReturned;
		return returnedCount;
	}
	
	public int exchangeProduct(int productExchanged) {
			if(productExchanged <= availableCount) {
				availableCount -= productExchanged;
				returnedCount += productExchanged;
			}else {
				System.out.println("We don't have that kind of stock.");
			}
			return availableCount;
		}	
			
			
	public double applyDiscount(double discountPercentage) {
		double discountPrice = price - (price * discountPercentage / 100);
		
		System.out.println("Your discounted price comes out to: $" + discountPrice);
		return discountPrice;
	}
	
	public void checkProductInStock() {		
		System.out.println(availableCount);
	}
	
	public int orderProduct(int productOrdered) {
		System.out.println("Your shipment of " + productOrdered + " " + name + " is on the way!");
		availableCount += productOrdered;
		return productOrdered;
	}
	
	
	
}
