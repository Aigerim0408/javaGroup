public class Aigerim {
    String name;
    int age;
    String dateOfBirth;
    String address;
    String education;
    String specialty;
    String currentWorkPlace;
    int workExperience;
    String hobby;
    String maritalStatus;

    public void method() {
        if (age <= 32) {
            System.out.println("name: " + name + "\n" +
                    "age: " + age + "\n" +
                    "dateOfBirth: " + dateOfBirth + "\n" +
                    "address: " + address + "\n" +
                    "education:" + education + "\n" +
                    "specialty:" + specialty + "\n" +
                    "currentWorkPlace: " + currentWorkPlace + "\n" +
                    "workExperience:" + workExperience + "\n" +
                    "hobby: " + hobby + "\n" +
                    "maritalStatus: " + maritalStatus);
        } else {
            System.out.println("taktalsyn!");
        }
    }
}

