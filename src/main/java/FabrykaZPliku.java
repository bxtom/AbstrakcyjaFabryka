public class FabrykaZPliku implements AbstractFactory {
    private final static class SingletonHolder {
        private final static FabrykaZPliku instance = new FabrykaZPliku();
    }

    public final static FabrykaZPliku getInstance() {
        return SingletonHolder.instance;
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
