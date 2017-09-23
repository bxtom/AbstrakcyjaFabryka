public class FabrykaZPliku implements AbstractFactory {
    private final static FabrykaZPliku ourInstance = new FabrykaZPliku();

    public static FabrykaZPliku getInstance() {
        return ourInstance;
    }

    private FabrykaZPliku() {
    }

    public SamochodOsobowy utworzSamochodOsobowy() {
        return new SamochodOsobowyZPliku();
    }

    public SamochodCiezarowy utworzSamochodCiezarowy() {
        return new SamochodCiezarowyZPliku();
    }
}
