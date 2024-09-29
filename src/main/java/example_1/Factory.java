package example_1;

public class Factory {
    public String name = "FunToiletPaperMaker";
    public String address = "Kaunas, NewYork Street";
    public int employeeCount = 499;
    public boolean isOpen = true;

    public void printName() {
        System.out.println("Factory name: " + name);
    }
    public int getEmployeeCount() {
        return employeeCount;
    }
    public void printEmployeeCount() {
        System.out.println("employeeCount :" + employeeCount);
    }
    public String getAddress() {
        return address;
    }
    public  boolean isOpen() {
        return this.isOpen;
    }
    public WoodPlank createWoodPlank() {
        return new WoodPlank();
    }







}
