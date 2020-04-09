package Chapter13.Example.Example2;

public class HouseMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        House house1 = new House(1, 1750.50);
        House house2 = (House) house1.clone();

        
    }
}
