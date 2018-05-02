package model;

public class Item {
	
	private int price;
	private int plu;
	private int count;
	private int weight;
	private int usbn;
	
	public Item(int plu, int count, int weight, int usbn) {
		this.price = price;
		this.plu = plu;
		this.count = count;
		this.weight = weight;
		this.usbn = usbn;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the plu
	 */
	public int getPlu() {
		return plu;
	}

	/**
	 * @param plu the plu to set
	 */
	public void setPlu(int plu) {
		this.plu = plu;
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/**
	 * @return the usbn
	 */
	public int getUsbn() {
		return usbn;
	}

	/**
	 * @param usbn the usbn to set
	 */
	public void setUsbn(int usbn) {
		this.usbn = usbn;
	}

}
