package guru.springframework.lombok;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        User ash = User.builder().firstName("Ash").lastName("Barrett").email("ash@techleisure.com").build();

        System.out.println(ash);
    }
}
