public class GenderField extends StringField {
    public GenderField(String caption) throws InvalidFieldCaptionException {
        super(caption);
    }

    public boolean isValid(String value) {
        return (value.matches("[MF]"));
    }
}