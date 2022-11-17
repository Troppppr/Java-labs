package Lab2;


import java.util.Arrays;

public class TabletDemo {
    public static void main(String[] args) {
        Tablet[] tablet = new  Tablet[3];
        tablet[0] = new Tablet("Asus", 12, "Black");
        tablet[1]  = new Tablet("Apple", 12, "Space Grey");
        tablet[2]  = new Tablet("Samsung", 14, "White");

        System.out.println(tablet);

        String[] tabletBrands = new String[3];
        tabletBrands[0] = new Tablet("Asus", 12, "Black").getNameBrand();
        tabletBrands[1]= new Tablet("Apple", 12, "Space Grey").getNameBrand();
        tabletBrands[2] = new Tablet("Samsung", 14, "White").getNameBrand();
        Arrays.sort(tabletBrands);
        System.out.println(Arrays.toString(tabletBrands));
        Arrays.sort(tabletBrands);
        Arrays.stream(tabletBrands).forEach(System.out::println);


        Tablet tablet5 = new Tablet("Yota", 13, "Blue");
        String tablet5_password = tablet5.getPassword();
        System.out.println(tablet5_password);



    }


    }
