import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Melderegister {

    List<Einwohner> einwohnerList = new ArrayList<>();

    public Melderegister() {
        einwohnerList = new ArrayList<>();
    }

    // einfügen
    public void add(Einwohner einwohner) {
       int index = Collections.binarySearch(einwohnerList, einwohner);
       if (index < 0) {
           index = -index - 1;
           einwohnerList.add(index, einwohner);

       }
    }

    public int getEinwohnerCount() {
        return einwohnerList.size();
    }

    public void delete(Einwohner einwohner){
        int index = Collections.binarySearch(einwohnerList, einwohner);
        if (index < 0) {
            return;
        }
        einwohnerList.remove(einwohner);
    }
}
