public class RegisterFormatter implements FormatCsvInterface, FormatHtmlInterface, FormatJsonInterface {
    private Register register;

    public RegisterFormatter(Register register) {
        this.register = register;
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
