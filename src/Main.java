import java.time.LocalDate;

public class TestMain {
    public static void main(String[] args) {
        // --- Test: Einwohner ---
        Einwohner einwohner = new Einwohner("Peter", "Panne", "Musterstraße 1", LocalDate.of(2023, 1, 1));

        System.out.println("Einwohner:");
        System.out.println("Vorname: " + einwohner.getVorname());
        System.out.println("Nachname: " + einwohner.getNachname());
        System.out.println("Adresse: " + einwohner.getAdresse());
        System.out.println("Einzugsdatum: " + einwohner.getEinzugsDatum());
        System.out.println();

        // --- Test: Melderegister ---
        Melderegister melderegister = new Melderegister();

        // Erstelle einige Einwohner-Objekte
        Einwohner e1 = new Einwohner("Anna", "Schmidt", "Bahnhofstraße 5");
        e1.setEinzugsDatum(LocalDate.of(2022, 5, 15));
        Einwohner e2 = new Einwohner("Bernd", "Meier", "Hauptstraße 12");
        e2.setEinzugsDatum(LocalDate.of(2020, 8, 20));
        Einwohner e3 = new Einwohner("Clara", "Zimmermann", "Seestraße 3");
        e3.setEinzugsDatum(LocalDate.of(2021, 3, 10));

        // Einwohner zum Melderegister hinzufügen
        melderegister.add(e1);
        melderegister.add(e2);
        melderegister.add(e3);

        // Anzahl der Einwohner im Melderegister ausgeben
        System.out.println("Anzahl Einwohner im Melderegister: " + melderegister.getEinwohnerCount());

        // Einen Einwohner (e2) entfernen und die Anzahl erneut ausgeben
        melderegister.delete(e2);
        System.out.println("Nach dem Löschen eines Einwohners:");
        System.out.println("Anzahl Einwohner im Melderegister: " + melderegister.getEinwohnerCount());
    }
}
