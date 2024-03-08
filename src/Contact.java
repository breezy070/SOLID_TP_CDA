public class Contact{

    private String name;
    private String objet;
    private String message;

    public Contact(String name, String objet, String message) {
        this.name = name;
        this.objet = objet;
        this.message = message;
    }

    public String formatToCsv() {
        return this.objet + ";" + this.name + ";" + this.message;
    }

    public String formatToHtml() {
        return "<h1>" + this.name + "</h1>" + "<h2>" + this.objet + "</h2>" + "<p>" + this.message + "</p>";
    }

    public String formatToJson() {
        return "{" + "name: " + this.name + "," + "candidature: " + this.objet + "," + "message: " + this.message + "}";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
