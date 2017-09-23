public class FabrykaZBazy implements AbstractFactory {
    private final static FabrykaZBazy ourInstance = new FabrykaZBazy();

    public static FabrykaZBazy getInstance() {
        return ourInstance;
    }

    private FabrykaZBazy() {
    }

    public SamochodOsobowy utworzSamochodOsobowy() {
        return new SamochodOsobowyZBazy();
    }

    public SamochodCiezarowy utworzSamochodCiezarowy() {
        return new SamochodCiezarowyZBazy();
    }
}
