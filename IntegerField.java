// package form;

public class IntegerField extends Field<Integer>{
    
    public IntegerField(String caption) throws InvalidFieldCaptionException {
        super(caption);
    }
    
    protected boolean isValid(String value) {
        return(value.matches("[+-]?[0-9]+"));
    }
    
    protected Integer convertFromString(String value) {
        return (Integer.parseInt(value));
    }
}