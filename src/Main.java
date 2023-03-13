public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Aigerim");
        Safia safia = new Safia();
        safia.name = "safia";
        safia.address = "37 pioneer";
        safia.currentPlaceOfWork = "no";
        safia.age = 14;
        safia.school = "15 school";
        safia.height = 160;
        safia.Pet = "parrot";
        safia.weight = 45;

        System.out.println("Name: "+safia.name+"\n"+"Address: "+safia.address+"\n"+"CurrentPlaceOfWork: "
                +safia.currentPlaceOfWork+"\n"+"age: "+safia.age+"\n"+"school: "+safia.school+"\n"+"height: "
                +safia.height+"\n"+"pet: "+safia.Pet+"\n"+"weight: "+ safia.weight+"\n");
    }
}