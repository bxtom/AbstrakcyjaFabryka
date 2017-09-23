public enum FabrykaZChmury implements AbstractFactory {
    INSTANCE;

    public SamochodOsobowy utworzSamochodOsobowy() {
        return new SamochodOsobowyZPliku();
    }

    public SamochodCiezarowy utworzSamochodCiezarowy() {
        return new SamochodCiezarowyZPliku();
    }
}