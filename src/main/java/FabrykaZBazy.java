public class FabrykaZBazy implements AbstractFactory {
    public SamochodOsobowy utworzSamochodOsobowy() {
        return new SamochodOsobowyZBazy();
    }

    public SamochodCiezarowy utworzSamochodCiezarowy() {
        return new SamochodCiezarowyZBazy();
    }
}
