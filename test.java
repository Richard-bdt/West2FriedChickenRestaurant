package west2task2;

import java.time.LocalDate;
import java.util.ArrayList;

public class test {


    public static void main(String[] args) {

        Drink beer = new Beer("����",5,4,LocalDate.of(2013,2,12),60);
        Drink beer1 = new Beer("����",5,4,LocalDate.now(),60);
        Drink Cola = new Juice("����",2,LocalDate.now(),60);
        ArrayList<Beer> BeerList = new ArrayList<>();
        ArrayList<Juice> JuiceList = new ArrayList<>();

        ArrayList<SetMeal> setMealList = new ArrayList<>();
        SetMeal SetMeal1=new SetMeal("Setmeal1",100,"ը��",new Beer("����"));
		SetMeal SetMeal2=new SetMeal("Setmeal2",70,"ը��",new Juice("��֭"));
        setMealList.add(SetMeal1);
        setMealList.add(SetMeal2);

        West2FriedChickenRestaurant west2FriedChickenRestaurant = new West2FriedChickenRestaurant(1000,BeerList,JuiceList);
        //���Թ���
        //west2FriedChickenRestaurant.Purchase(beer1,10);
        //west2FriedChickenRestaurant.SellSetMeal(setMeal2,10);  //��������

        //���Խ����쳣
        // west2FriedChickenRestaurant.Purchase(beer,1000);

        west2FriedChickenRestaurant.Purchase(beer1,100);
        west2FriedChickenRestaurant.Purchase(Cola,100);

        //�����ۻ��쳣
        //west2FriedChickenRestaurant.SellSetMeal(setMeal1,101);


    }
}

