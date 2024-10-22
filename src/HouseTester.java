public class HouseTester {
    public static void main(String[] args) {

        Owner o = new Owner("Jason");
        House h1 = new House(5200, o);
        try {
            House hcopy = (House)h1.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
    }
}
