package west2task2;
import java.util.ArrayList;
import java.util.List;


public class West2FriedChickenRestaurant implements FriedChickenRestaurant {
	//��̬��ʼ��
	static {
		ArrayList<SetMeal>meals=new ArrayList<SetMeal>();
		SetMeal SetMeal1=new SetMeal("Setmeal1",100,"ը��",new Beer("����"));
		SetMeal SetMeal2=new SetMeal("Setmeal2",70,"ը��",new Juice("��֭"));
		meals.add(SetMeal1);
		meals.add(SetMeal2);
	}
	double balance;
	List<Beer>Beers=new ArrayList<Beer>();
	List<Juice>Juices=new ArrayList<Juice>();
	
	public West2FriedChickenRestaurant(double balance, ArrayList<Beer> beers, ArrayList<Juice> juices) {
        this.balance = balance;
        Beers = beers;
        Juices = juices;
    }
	 public West2FriedChickenRestaurant() {
	    }
	 private void use(Beer beer) throws IngredientSortOutException {
	        for (int i=0; i<Beers.size();i++) {
	            if (Beers.get(i).isExpired() )
	                Beers.remove(Beers.get(i));
	        }
	        for (int i=0;i<Beers.size();i++) {
	            if (beer.name.equals(Beers.get(i).name)){
	            Beers.remove(i);
	                return;
	            }
	        }
	        throw new IngredientSortOutException(beer.name + "���ۿ�");
	 }
	 private void use(Juice juice) throws IngredientSortOutException {
	        for (int i=0;i <Juices.size();i++) {
	            if (Juices.get(i).isExpired())
	                Juices.remove(Juices.get(i));
	        }
	        for (int i=0;i<Juices.size();i++) {
	            if (juice.name.equals(Juices.get(i).name)) {
	                Juices.remove(i);
	                return;
	            }
	        }
	        throw new IngredientSortOutException(juice.name + "����");
	    }
	
	
	 public void Purchase(Drink drinks, int num) throws OverdraftBalanceException {
	         ;
	        if (num*drinks.cost>balance)
	            throw new OverdraftBalanceException("������"+(num*drinks.cost-balance)+"Ԫ");
	        else
	            balance-=num*drinks.cost;
	        if (drinks instanceof Beer) {
	            for (int i=0;i<num;i++) {
	                Beers.add((Beer) drinks);
	            }
	        }
	        if (drinks instanceof Juice)
	            for (int i=0;i<num;i++) {
	                Juices.add((Juice) drinks);
	            }
	    }
	@Override
	public void sales(SetMeal setMeal, int num) {
		;
		for (int i= 0;i<num;i++) {
            if (setMeal.getDrink() instanceof Beer) {
                use((Beer) setMeal.getDrink());
            }
            if (setMeal.getDrink() instanceof Juice) {
                use((Juice) setMeal.getDrink());
            }
        }
        balance += setMeal.getPrice() * num;
    }
	@Override
	public void purchase(Drink drink, int num) {
		;
        if (num*drink.cost>balance)
            throw new OverdraftBalanceException("������"+(num * drink.cost - balance)+"Ԫ");
        else
            balance -= num * drink.cost;
        if (drink instanceof Beer) {
            for (int i=0;i<num;i++) {
                Beers.add((Beer) drink);
            }
        }
	}
}

