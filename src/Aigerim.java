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

    public Aigerim(String name, int age, String dateOfBirth, String address, String education, String specialty, String currentWorkPlace, int workExperience, String hobby, String maritalStatus) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.education = education;
        this.specialty = specialty;
        this.currentWorkPlace = currentWorkPlace;
        this.workExperience = workExperience;
        this.hobby = hobby;
        this.maritalStatus = maritalStatus;
    }

    public Aigerim() {
    }

    @Override
    public String toString() {
        return  "Aigerim{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                ", education='" + education + '\'' +
                ", specialty='" + specialty + '\'' +
                ", currentWorkPlace='" + currentWorkPlace + '\'' +
                ", workExperience=" + workExperience +
                ", hobby='" + hobby + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                '}';
    }

    public void method() {
        if (age <= 32) {
            System.out.println("name='" + name + '\'' +
                    ", age=" + age +
                    ", dateOfBirth='" + dateOfBirth + '\'' +
                    ", address='" + address + '\'' +
                    ", education='" + education + '\'' +
                    ", specialty='" + specialty + '\'' +
                    ", currentWorkPlace='" + currentWorkPlace + '\'' +
                    ", workExperience=" + workExperience +
                    ", hobby='" + hobby + '\'' +
                    ", maritalStatus='" + maritalStatus + '\'' +
                    '}');
        } else {
            System.out.println("taktalsyn!");
        }
    }
}

