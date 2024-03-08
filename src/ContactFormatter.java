public class ContactFormatter implements FormatCsvInterface, FormatHtmlInterface, FormatJsonInterface{
    private Contact contact;

    public ContactFormatter(Contact contact) {
        this.contact = contact;
    }

    @Override
    public String formatToCsv() {
        return null;
    }

    @Override
    public String formatToHtml() {
        return null;
    }

    @Override
    public String FormatToJson() {
        return null;
    }
}
