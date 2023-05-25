abstract class Marks {
    public double java, dbms, ds, iot;
    abstract double getPercentage ();
}

class A extends Marks {

    A (double java, double dbms, double ds) {
        this.java = java;
        this.dbms = dbms;
        this.ds = ds;
    }
    @Override
    double getPercentage(){
        return (java + dbms + ds)/3;
    }
}

class B extends Marks {

    B (double java, double dbms, double ds, double iot) {
        this.java = java;
        this.dbms = dbms;
        this.ds = ds;
        this.iot = iot;
    }

    @Override
    double getPercentage(){
        return ((java + dbms + ds + iot)/4);
    }
}

public class CalculatePercentage {

    public static void main(String[] args) {
        A stud1 = new A(90, 80, 90);
        B stud2 = new B(90, 80, 70, 80);
        System.out.println("Percentage : "+stud1.getPercentage());
        System.out.println("Percentage : "+stud2.getPercentage());
    }
}
