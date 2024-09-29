package example_3;

public class MusicPlayer {
    public String brand ;
    public double price;
    public int currentSong;
    public int quantityOfSongs;
    public boolean isWorking;
    final double VAT = 0.21;
    public int batteryPercentage;
    final int FULL_BATTERY = 100;


    public void printBrand() {
        System.out.println("Player brand: "+ brand + "\n");
    }
    public double getPricePlusVat() {
        double priceWithVat = (double) Math.round((price + price * VAT) * 100) /100;
        System.out.println("Full price with vat : " + priceWithVat + " euros" + "\n");
        return priceWithVat ;
    }

    public  void printSong() {
        if (isWorking){
            System.out.println("Now playing song: " + currentSong + "\n");
        }
    }

    public void turnOnOff() {
        if (batteryPercentage == 0) {
            isWorking=false;
            System.out.println("Battery is empty." + "\n");
            return;
        }
        if (isWorking) {
            isWorking=false;
            System.out.println("The player is turned off." + "\n");

        } else {
            isWorking = true;
            System.out.println("The player is turned on." + "\n");
        }

    }

    public void changeSong(int newSong) {
        if (!isWorking) {
            System.out.println("Player is turn off");
            return;
        }
        if (newSong <= 0 || newSong > quantityOfSongs) {
            System.out.println("Invalid song number!");
            return;
        }
        currentSong = newSong;
        System.out.println("Now play song : " + currentSong);
    }

    public boolean checkIfLastSongIsPLaying(){
        if (!isWorking) {
            System.out.println("Please turn on the player." + "\n");
            return false;
        }
        System.out.println("Is this the last song?");
        if (currentSong  == quantityOfSongs ) {
            return true;
        } else return false;
    }


    public void chargeBattery(int percentage){
        if (percentage < 0) {
            System.out.println("The value cannot be negative. " + "\n");
            return;
        }
        batteryPercentage = batteryPercentage + percentage;
        if (batteryPercentage >= FULL_BATTERY) {
            batteryPercentage = 100;
            System.out.println("The battery is fully charged. " + "\n");
            return;
        }
        System.out.println("The battery is charged to: " + batteryPercentage + "%" + "\n");
    }
}
