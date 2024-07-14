public class StaticDemo {
    String name;
    String address;
    String city;

    StaticDemo(String name,String address,String city)
    {
       this.name = name;
       this.address = address;
        this.city = city;
    }
    public void getAddress()
    {
        System.out.println(address);
        System.out.println(name);
        System.out.println(city);
    }
    public static void main(String[] args) {

        StaticDemo sd = new StaticDemo("Murali","1st cross","Bangalore");
        sd.getAddress();
    }
}
