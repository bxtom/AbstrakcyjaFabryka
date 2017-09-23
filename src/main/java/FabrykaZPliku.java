public class FabrykaZPliku implements AbstractFactory {
    public SamochodOsobowy utworzSamochodOsobowy() {
        return new SamochodOsobowyZPliku();
    }

    public SamochodCiezarowy utworzSamochodCiezarowy() {
        return new SamochodCiezarowyZPliku();
    }
}
