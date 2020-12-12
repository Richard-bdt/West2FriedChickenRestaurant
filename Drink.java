package west2task2;

import java.time.LocalDate;

public abstract class Drink {
	protected String name;
	protected double cost;
	protected  LocalDate produce_date;
	protected int guarantee_date;
	public Drink(String name) {
        this.name = name;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public LocalDate getProduce_date() {
		return produce_date;
	}
	public void setProduce_date(LocalDate produce_date) {
		this.produce_date = produce_date;
	}
	public int getGuarantee_date() {
		return guarantee_date;
	}
	public void setGuarantee_date(int guarantee_date) {
		this.guarantee_date = guarantee_date;
	}	
	public Drink(String name,double cost,LocalDate produce_date,int guarantee_date) {
		
			this.cost=cost;
			this.guarantee_date=guarantee_date;
			this.name=name;
			this.produce_date=produce_date;
			
	
}
	public  boolean isExpired(){
		LocalDate Expire=produce_date.plusDays((long)guarantee_date);
		if(Expire.isAfter(LocalDate.now())) {
			return false;
		}
		else {
			return true;
		}
		
	}
	
	@Override
	public abstract String toString();
}
