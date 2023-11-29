package Prog214bcl;

public class Cl214b {
    private double myempNum;
    private double myytdPay;
    private double mybpRate;
    private double myshiftCode;
    private double myhoursWorked;
    private double mygrossPay;
    private double mywithHoldTax;
    private double mysocialSecTax;
    private double mynetPay;
    private double mypayRate;

    public Cl214b(double empNum, double ytdPay, double bpRate, double shiftCode, double hoursWorked) {
        myempNum = empNum;
        myytdPay = ytdPay;
        mybpRate = bpRate;
        myshiftCode = shiftCode;
        myhoursWorked = hoursWorked;
        mygrossPay = 0;
        mywithHoldTax = 0;
        mysocialSecTax = 0;
        mynetPay = 0;
        mypayRate = 0;
    }

    public void calc() {
        mypayRate = mybpRate * myshiftCode;
        mygrossPay = myhoursWorked * mypayRate;
        if (mygrossPay < 100) mywithHoldTax = 0;
        else if (mygrossPay >= 100 && mygrossPay < 150) mywithHoldTax = (mygrossPay*0.08);
        else if (mygrossPay >= 150 && mygrossPay < 200) mywithHoldTax = (mygrossPay*0.12);
        else if (mygrossPay >= 200 && mygrossPay < 300) mywithHoldTax = (mygrossPay*0.15);
        else if (mygrossPay >= 300) mywithHoldTax = (mygrossPay*0.175);

        if (myytdPay > 17300) mysocialSecTax = 0;
        else if (myytdPay + mygrossPay <= 17300) mysocialSecTax = 0.0605 * mygrossPay;
        else if (myytdPay < 17300 && myytdPay + mygrossPay > 17300) mysocialSecTax = (17300-myytdPay+mygrossPay)*0.0605;



    }

    public String toString() {
        return "Employee Number " + myempNum + "\nHours " + myhoursWorked +
                " Rate " + mybpRate + " Shift Factor " + myshiftCode +
                "\n\t\tCurrent\t\tYear-to date\nGross Pay " + mygrossPay +
                "\t\t" + myytdPay + "\nWithholding " + mywithHoldTax +
                "\nFICA " + mysocialSecTax + "\nNet Pay " + (mygrossPay-mysocialSecTax-mywithHoldTax);
    }

}
