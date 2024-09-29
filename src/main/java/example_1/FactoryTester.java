package example_1;

public class FactoryTester {
    public static void main(String[] args) {

        Factory woodFactory = new Factory();
        int employeeCount = woodFactory.getEmployeeCount();
        System.out.println(employeeCount);
        woodFactory.printEmployeeCount();
        String address = woodFactory.getAddress();
        System.out.println(address);

        System.out.println(woodFactory.isOpen() ? "open" : "close");
        woodFactory.isOpen = false;
        System.out.println(woodFactory.isOpen() ? "open" : "close");

        WoodPlank lenta = woodFactory.createWoodPlank();
        System.out.println(lenta.getArea());
    }
}
