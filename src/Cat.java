import java.util.List;

public class Cat extends Animal implements AnimalBehaivour {
    private String breed;
    List<String> list;//примеры
    Dog dog;
    @Override
    public void voice() {
        System.out.println("мяу");
    }



    public void test() {

    }

    @Override
    public void bheaivour() {
        System.out.println("Кошка охотится на мышей");

    }
}
