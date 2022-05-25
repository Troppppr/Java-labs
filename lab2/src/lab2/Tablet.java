package Lab2;

public class Tablet {
    private String brand;
    private int diag;
    private String color;
    private static String Owner;
    private String password = "qwe";

    public void setNameBrand(String brand) {

        this.brand = brand;
    }

    public String getNameBrand() {

        return brand;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public String getColor() {

        return color;
    }

    public int getDiag() {

        return diag;
    }

    public static String getOwner() {

        return Owner;
    }
    public void setPassword(String password) {

        this.password = password;
    }
    public  String getPassword() {
        return password;
    }

    public Tablet(String brand, int diag, String color) {
        this.brand = brand;
        this.diag = diag;
        this.color = color;
    }

    public Tablet(String brand) {

        this.brand = brand;
    }
    void info(int number) {
        System.out.println(brand);
    }
    }
