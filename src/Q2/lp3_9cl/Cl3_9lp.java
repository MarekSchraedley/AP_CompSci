package lp3_9cl;

public class Cl3_9lp {
    private int myByear;
    private int myBmonth;
    private int myBday;
    private int myCyear;
    private int myCmonth;
    private int myCday;

    private int myalivedays;
    private int mysleephours;

    public Cl3_9lp(int Byear, int Bmonth, int Bday, int Cyear, int Cmonth, int Cday){
        myByear = Byear;
        myBmonth = Bmonth;
        myBday = Bday;
        myCyear = Cyear;
        myCmonth = Cmonth;
        myCday = Cday;
        myalivedays = 0;
        mysleephours = 0;

    }

    public void calc() {
        myalivedays = ((myCyear-myByear)*365)-(myBmonth*30)-myBday+(myCmonth*30)+myCday;
        mysleephours = myalivedays * 8;
    }

    public String toString() {
        return "You have been alive for " + myalivedays + " days.\nYou have slept " + mysleephours + " hours.";
    }

}
