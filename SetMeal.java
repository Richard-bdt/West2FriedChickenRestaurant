package west2task2;

public class SetMeal {
	public String name;
	public double price;
	public String FriedChicken;
	public Drink drink;
	public Beer Beer;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getFriedChicken() {
		return FriedChicken;
	}
	public void setFriedChicken(String friedChicken) {
		FriedChicken = friedChicken;
	}
	public Drink getDrink() {
		return drink;
	}
	public void setDrink(Drink drink) {
		this.drink = drink;
	}
	public Beer getBeer() {
		return Beer;
	}
	public void setBeer(Beer beer) {
		Beer = beer;
	}
	public Juice getJuice() {
		return Juice;
	}
	public void setJuice(Juice juice) {
		Juice = juice;
	}
	public Juice Juice;
	public SetMeal(String name,double price,String FriedChicken,Drink drink) {
		this.name=name;
		this.price=price;
		this.FriedChicken=FriedChicken;
		this.drink=drink;
		
	}
	public String toString() {
        return "SetMeal{" +
                "SetMeal='" + name + '\'' +
                ", FriedChickenName='" + FriedChicken + '\'' +
                ", Price=" + price +
                ", drinks=" + drink +
                '}';
    }
	
}