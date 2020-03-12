public class NameField extends StringField {
    public NameField(String caption) throws InvalidFieldCaptionException {
        super(caption);
    }

    public boolean isValid(String value) {
        return (value.matches("[A-Z][a-z]+( [A-Z][a-z]+)+"));
    }
}