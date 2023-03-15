public class Main {
    public static void main(String[] args) {
        // Aigerim
        Aigerim person = new Aigerim();
        person.name = "Aigerim";
        person.age = 32;
        person.dateOfBirth = "04.08.1990";
        person.address = "Pioneer Street 38";
        person.hobby = "Travelling all over the word";
        person.education = "Master Degree";
        person.specialty = "Linguist";
        person.currentWorkPlace = "Tian Long LLC";
        person.workExperience = 8;
        person.maritalStatus = "Single";
        System.out.println("===================");
        person.method();

        System.out.println("===================");

        // Aidar
        Aidar aydar = new Aidar();
        aydar.name = "Айдар";
        aydar.surname = "Japarov";
        aydar.age = 18;
        aydar.gender = "Male";
        aydar.height = "180cm";
        aydar.weight = "65kg";
        aydar.character = "Позитивный";
        System.out.println("===================");
        System.out.println("Name: " + aydar.name + "\n" + "Surename: " + aydar.surname + "\n" + "Age: "
                + aydar.age + "\n" + "Gender: " + aydar.gender + "\n" + "Height: " + aydar.height + "\n"
                + "Weight" + aydar.weight + "\n" + "Character: " + aydar.character);
        System.out.println("===================");

        // Sofia
        Safia safia = new Safia();
        safia.name = "Safia";
        safia.address = "37 pioneer";
        safia.currentPlaceOfWork = "no";
        safia.age = 14;
        safia.schoolNumber = "15 school";
        safia.height = 160;
        safia.Pet = "parrot";
        safia.weight = 45;
        System.out.println("===================");
        System.out.println("Name: " + safia.name + "\n" + "Address: " + safia.address + "\n" + "CurrentPlaceOfWork: "
                + safia.currentPlaceOfWork + "\n" + "age: " + safia.age + "\n" + "school: " + safia.schoolNumber + "\n" + "height: "
                + safia.height + "\n" + "pet: " + safia.Pet + "\n" + "weight: " + safia.weight + "\n");
        System.out.println("===================");

        //  Nurbek
        Nurbek nurbek = new Nurbek();
        nurbek.name = "Nurbek";
        nurbek.age = 15;
        nurbek.gender = "Male";
        nurbek.address = "Turgeneva";
        nurbek.schoolnumber = 28;
        nurbek.clas = 9;
        nurbek.maritalstatus = "Very nice";

        System.out.println("===================\n" + "Name: " + nurbek.name + "\nYears old: " + nurbek.age +
                "\nGender: " + nurbek.gender + "\nAddress: " + nurbek.address + "\nSchool number: "
                + nurbek.schoolnumber + "\nClass: " + nurbek.clas + "\nMarital status: "
                + nurbek.maritalstatus + "\n===================");
    }
}