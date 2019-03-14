public class Element {
    private int integer;
    private double doub;
    private String str;
    private int type;
    
    public Element(int type, int integer, double doub, String str) {
        this.type = type;
        this.integer = integer;
        this.doub = doub;
        this.str = str;
    }
    
    public String toString() {
        String rep = new String();
        if (type == 0) rep += integer;
        else if (type == 1) rep += doub;
        else rep += str;
        return rep;
    }
}