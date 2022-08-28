import image.TextGraphicsConverter;
import server.GServer;

public class Main {
    public static void main(String[] args) throws Exception {
        TextGraphicsConverter converter = new MyConverter();

        GServer server = new GServer(converter); // Создаём объект сервера
        server.start(); // Запускаем

 /*       // Или то же, но с выводом на экран:
        String url = "https://raw.githubusercontent.com/netology-code/java-diplom/main/pics/simple-test.png";
        String imgTxt = converter.convert(url);
        System.out.println(imgTxt);*/
    }
}
