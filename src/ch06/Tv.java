package ch06;

public class Tv {
    private String brand;
    private int inch;

    public Tv(){}
    public Tv(String brand){
        this.brand =brand;//생성자통해서만 값 한번가능
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }
//getters, setters 각각 변수하나당 **

}
