package west2task2;

import java.time.LocalDate;
import java.util.ArrayList;

public class test {


    public static void main(String[] args) {

        Drink beer = new Beer("百威",5,4,LocalDate.of(2013,2,12),60);
        Drink beer1 = new Beer("百威",5,4,LocalDate.now(),60);
        Drink Cola = new Juice("可乐",2,LocalDate.now(),60);
        ArrayList<Beer> BeerList = new ArrayList<>();
        ArrayList<Juice> JuiceList = new ArrayList<>();

        ArrayList<SetMeal> setMealList = new ArrayList<>();
        SetMeal SetMeal1=new SetMeal("Setmeal1",100,"炸鸡",new Beer("百威"));
		SetMeal SetMeal2=new SetMeal("Setmeal2",70,"炸鸡",new Juice("橙汁"));
        setMealList.add(SetMeal1);
        setMealList.add(SetMeal2);

        West2FriedChickenRestaurant west2FriedChickenRestaurant = new West2FriedChickenRestaurant(1000,BeerList,JuiceList);
        //测试过期
        //west2FriedChickenRestaurant.Purchase(beer1,10);
        //west2FriedChickenRestaurant.SellSetMeal(setMeal2,10);  //百威不足

        //测试进货异常
        // west2FriedChickenRestaurant.Purchase(beer,1000);

        west2FriedChickenRestaurant.Purchase(beer1,100);
        west2FriedChickenRestaurant.Purchase(Cola,100);

        //测试售货异常
        //west2FriedChickenRestaurant.SellSetMeal(setMeal1,101);


    }
}

