public class Klient {
    private AbstractFactory fabrykaZBazy = FabrykaZBazy.getInstance();

    private AbstractFactory fabrykaZPliku = FabrykaZPliku.getInstance();

    SamochodOsobowy samochodOsobowy = fabrykaZBazy.utworzSamochodOsobowy();

    SamochodOsobowy samochodOsobowy2 = fabrykaZPliku.utworzSamochodOsobowy();
}
