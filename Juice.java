package west2task2;

import java.time.LocalDate;

public class Juice extends Drink{
	int guarantee_date=2;
	public Juice(String name) {
        super(name);
    }
	public Juice(String name, double cost, LocalDate produce_date, int guarantee_date) {
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
		 return "Juice{" +
                ", ������:" + this.guarantee_date +
                ", ����:'" + name + '\'' +
                ", �ɱ�:" + cost +
                ", ��������:" + produce_date +'}';

                };

}
