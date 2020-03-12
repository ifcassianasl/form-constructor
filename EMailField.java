public class EMailField extends StringField {
    public EMailField(String caption) throws InvalidFieldCaptionException {
        super(caption);
    } 

    public boolean isValid(String value) {
        return (value.matches("[a-z0-9]+([_\\.][a-z0-9]+)*@[a-z0-9]+([_\\.][a-z0-9]+)\\.[a-z]{3}(\\.[a-z]{2})?"));
    }
}