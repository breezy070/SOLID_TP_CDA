
public class Main {
    public static void main(String[] args) {

        Contact contact1 = new Contact(
                "Teemo",
                "Candidature",
                "Bonjour, j'aimerais avoir plus de croquettes svp"
        );
        System.out.println(contact1.formatToHtml());
        System.out.println(contact1.formatToJson());
        System.out.println(contact1.formatToCsv());






    }
}