package west2task2;
import java.time.LocalDate;

import west2task2.Drink;
public class Beer extends Drink {
	float Alcohol;
	int guarantee_date=30;
	public Beer(String name) {
        super(name);
    }
	public float getAlcohol() {
		return Alcohol;
	}
	public void setAlcohol(float alcohol) {
		Alcohol = alcohol;
	}
	public Beer(String name, double cost,float Alcohol, LocalDate produce_date, int guarantee_date) {
		super(name, cost, produce_date, guarantee_date);
}
	public int getGuarantee_date() {
		return guarantee_date;
	}
	public void setGuarantee_date(int guarantee_date) {
		this.guarantee_date = guarantee_date;
	}
	@Override
	public String toString() {
        return "Beer{" +
                "度数:" + Alcohol +
                ", 保质期:" + this.guarantee_date +
                ", 名字:'" + name + '\'' +
                ", 成本:" + cost +
                ", 生产日期:" + produce_date +'}';

                };
}