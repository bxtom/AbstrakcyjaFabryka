public class Klient {
    private AbstractFactory fabrykaZBazy = new FabrykaZBazy();

    private AbstractFactory fabrykaZPliku = new FabrykaZPliku();

    SamochodOsobowy samochodOsobowy = fabrykaZBazy.utworzSamochodOsobowy();

    SamochodOsobowy samochodOsobowy2 = fabrykaZPliku.utworzSamochodOsobowy();
}
