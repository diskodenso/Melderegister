import java.time.LocalDate;

public class Einwohner implements Comparable<Einwohner> {
    private String vorname;
    private String nachname;
    private String adresse;
    private LocalDate einzugsDatum;
    priv
    // Konstrunktor
    public Einwohner(){
        this.vorname = null;
        this.nachname = null;
        this.adresse = null;
        this.einzugsDatum = null;

    }
    public Einwohner(String vorname, String nachname, String adresse, LocalDate einzugsDatum){
        this.vorname = vorname;
        this.nachname = nachname;
        this.adresse = adresse;
        this.einzugsDatum = einzugsDatum;
    }

    // Getter

    public String getVorname() {
        return vorname;
    }
    public String getNachname() {
        return nachname;
    }
    public String getAdresse() {
        return adresse;
    }
    public LocalDate getEinzugsDatum() {
        return einzugsDatum;
    }
    // Setter
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public void setEinzugsDatum(LocalDate einzugsDatum) {
        this.einzugsDatum = einzugsDatum;
    }
    @Override
    public int compareTo(Einwohner o){
        return this.nachname.compareTo(o.getNachname());
    }
}
