public class Main {
    public static void main(String[] args) {
        nurbek nurbek = new nurbek();
        nurbek.name = "Nurbek";
        nurbek.yo = 15;
        nurbek.sex = "Man";
        nurbek.address = "Turgeneva";
        nurbek.schoolnumber = 28;
        nurbek.clas = 9;
        nurbek.maritalstatus = "Very nice";

        System.out.println("===================\n" + "Name: " + nurbek.name + "\nYears old: " + nurbek.yo + "\nSex: " +
                nurbek.sex + "\nAddress: " + nurbek.address + "\nSchool number: " + nurbek.schoolnumber + "\nClass: " +
                nurbek.clas + "\nMarital status: " + nurbek.maritalstatus + "\n===================");
    }
}