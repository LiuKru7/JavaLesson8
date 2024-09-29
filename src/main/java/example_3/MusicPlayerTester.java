package example_3;

public class MusicPlayerTester {
    public static void main(String[] args) {

        MusicPlayer player1 = new MusicPlayer();
        player1.brand = "Mix";
        player1.currentSong = 1;
        player1.isWorking = false;
        player1.price = 99;
        player1.quantityOfSongs = 9;
        player1.batteryPercentage = 0;


        player1.printBrand();
        player1.getPricePlusVat();
        player1.turnOnOff();
        player1.chargeBattery(66);
        player1.turnOnOff();
        player1.printSong();
        player1.changeSong(3);
        System.out.println(player1.checkIfLastSongIsPLaying());
        player1.changeSong(6);
        System.out.println(player1.checkIfLastSongIsPLaying());
        player1.changeSong(9);
        System.out.println(player1.checkIfLastSongIsPLaying());
        player1.changeSong(12);
        System.out.println(player1.checkIfLastSongIsPLaying());
    }
}
