public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Aidar aydar = new Aidar();
        aydar.name = "Айдар";
        aydar.surename = "Жапаров";
        aydar.age = 18;
        aydar.gender = "Male";
        aydar.height = "180cm";
        aydar.weight = "65kg";
        aydar.character = "Позитивный";
        System.out.println("Name: " + aydar.name + "\n" + "Surename: " + aydar.surename + "\n" + "Age: "
                + aydar.age + "\n" + "Gender: " + aydar.gender + "\n" + "Height: " + aydar.height + "\n"
                + "Weight" + aydar.weight + "\n" + "Character: " + aydar.character);
    }
}