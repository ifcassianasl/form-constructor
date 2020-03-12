public class AgeField extends IntegerField {
    public AgeField(String caption) throws InvalidFieldCaptionException {
        super(caption);
    }

    public boolean isValid(String value) {
        return (value.matches("[0-9]+"));
    }
}