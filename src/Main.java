public class Main {
    public static void main(String[] args) {
        Aigerim person = new Aigerim();
        person.name = "Aigerim";
        person.dateOfBirth = "04.08.1990";
        person.address = "Pioneer Street 38";
        person.hobby = "Travelling all over the word";
        person.education = "Master Degree";
        person.specialty = "Linguist";
        person.currentWorkPlace = "Tian Long LLC";
        person.workExperience = 8;
        person.maritalStatus = "Single";
        System.out.println("Name: " + person.name + "\n"+"Date of birth: " + person.dateOfBirth +"\n"
                + "Address: " + person.address +"\n"+ "Hobby: " + person.hobby+ "\n"+ "Education: "
                + person.education + "\n"+"Specialty: " + person.specialty +"\n"+
                "Current work place: " + person.currentWorkPlace +"\n"+ "Work experience: " + person.workExperience
                +" years" + "\n" +"Marital status: " + person.maritalStatus);
    }
}