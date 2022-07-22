public class Workers {
    private String name;
    private int age;
    private boolean youDrunk;
    int vodka;

    public Workers(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName ( String name ) {
        this.name = name;
    }
    public void setAge (int age) {
        this.age = age;
    }
    public boolean getAreYouDrunk () {
        return youDrunk;
    }
    public void setYouDrunk(boolean youDrunk) {
        this.youDrunk = youDrunk;
    }
    public void  goToWork () {
        System.out.println(name + " i am going i am going...");
    }
    public void grabVodka () {
        System.out.println("Ура я испортил водку - " + getName());

        Storage.amountOfVodka = Storage.amountOfVodka - 1;
        howManyVodkaisBroken();
        youDrunk = true;
        System.out.println( "Я пьян!");
    }
        public int howManyVodkaisBroken () {
        return vodka++;
        }

}
