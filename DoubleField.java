public class DoubleField extends Field<Double> {
    public DoubleField(String caption) throws InvalidFieldCaptionException {
        super(caption);
    }
    
    protected boolean isValid(String value) {
        return(value.matches("[+-]?[0-9]*\\.?[0-9]+"));
    }
    
    protected Double convertFromString(String value) {
        return (Double.parseDouble(value));
    }
}