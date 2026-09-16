import hito.Hito;

class TaxPayer extends Hito {
    int number;
    int earning;
    int taxable;
    int tax;

    TaxPayer(int number, String name, int age, int earning) {
        super(name, age);
        this.number = number;
        this.earning = earning;
        this.taxable = 0;
        this.tax = 0;
    }

    void setTaxable(int earning){
        if(earning <= 1800000){
            this.taxable = earning - earning * 4/10; 
        }else if(earning <= 3600000){
            this.taxable = earning - (earning * 3/10 + 180000);
        }else if(earning <= 6600000){
            this.taxable = earning - (earning * 2/10 + 540000);
        }else if(earning <= 10000000){
            this.taxable = earning - (earning * 1/10 + 1200000);
        }else{
            this.taxable = earning - (earning * 5/100 + 1700000);
        }
    }

    void setTax(int taxable){
        if(taxable <= 1950000){
            this.tax = taxable * 5/100;
        }else if(taxable <= 3300000){
            this.tax = taxable * 1/10;
        }else if(taxable <= 6950000){
            this.tax = taxable * 2/10;
        }else if(taxable <= 9000000){
            this.tax = taxable * 23/100;
        }else if(taxable <= 18000000){
            this.tax = taxable * 33/100;
        }else{
            this.tax = taxable * 4/10;
        }
    }

    void printTaxPayer() {
        System.out.println("******" + name + "******");
        System.out.println("番号:" + number);
        System.out.println("年齢:" + age);
        System.out.println("収入:" + earning);
        System.out.println("課税所得:" + taxable);
        System.out.println("所得税額:" + tax);
    }
}

public class TaxClient {
    public static void main(String[] args) {
        TaxPayer p1 = new TaxPayer(1001, "Taro Yamada", 25, 2000000);
        p1.setTaxable(p1.earning);
        p1.setTax(p1.taxable);
        p1.printTaxPayer();

        TaxPayer p2 = new TaxPayer(1002, "Hanako Ito", 21, 3000000);
        p2.setTaxable(p2.earning);
        p2.setTax(p2.taxable);
        p2.printTaxPayer();

        TaxPayer p3 = new TaxPayer(1003, "Jiro Suzuki", 30, 5500000);
        p3.setTaxable(p3.earning);
        p3.setTax(p3.taxable);
        p3.printTaxPayer();
    }
}
