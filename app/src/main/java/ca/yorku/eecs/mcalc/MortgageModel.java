package ca.yorku.eecs.mcalc;

public class MortgageModel
{
    double principle;
    int amortization;
    double interest;
    double monthlyPayment;
    double r;

    public MortgageModel(String p, String a, String i){
        this.principle =Double.valueOf(p);
        this.amortization = Integer.valueOf(a);
        this.interest =Double.valueOf(i);
        this.r = (interest/1200);
    }

    public String computePayment(){
        String monthlyMortgage ="";
        double x = r*principle/(1- (Math.pow((1+interest/1200),-(12*amortization))));


//        Binlikleri Ayirdigimiz Ornek
//        monthlyMortgage = "$"+String.format("%,.2f",x);

//        Binlik ayirimini kaldirdigimiz excercise 4
        monthlyMortgage = "$"+String.format("%.2f",x);
        this.monthlyPayment =x;
        return monthlyMortgage;
    }

    public String outstandingAfter(int x){
        computePayment();
        double ilk =(  monthlyPayment/r - principle);
        double son = (Math.pow((1+r),x)-1);
//        double balance= principle -(  monthlyPayment/r - principle)  *  (Math.pow((1+r),x)-1);
        double balance= principle -ilk*son;
        return "$"+String.format("%,.0f", balance);
    }


}
