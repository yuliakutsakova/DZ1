//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Интерфейс Директор= new Директор();
        Интерфейс Бухгалтер= new Бухгалтер();
        Интерфейс Рабочий= new Рабочий();

        Директор.printPosition();
        Бухгалтер.printPosition();
        Рабочий.printPosition();
    }
}