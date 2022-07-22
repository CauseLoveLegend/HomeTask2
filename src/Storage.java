public class Storage {
        public static int amountOfVodka = 4;
public static String getAmountOfVodka() {
    if (amountOfVodka == 0 ) {
        return ("На складе осталась - " + amountOfVodka + " бутылок");
    }
    else if (amountOfVodka == 1 )
        return ("На складе осталась - " + amountOfVodka + " бутылка");
    else  {
        return ("На складе осталось - " + amountOfVodka + " бутылки");
    }

}
}


