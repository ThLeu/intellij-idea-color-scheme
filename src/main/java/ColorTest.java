public class ColorTest {

    private int field = 10;

    private void setField(int field) {
        this.field = field;
    }

    /**
     * JavaDoc
     */
    private int getField() {
        return field;
    }
    
    public static void main(String[] args) {
        ColorTest test = new ColorTest();
        test.setField(args.length);
        int field = test.getField(); // Unused variable is gray
    }
}

