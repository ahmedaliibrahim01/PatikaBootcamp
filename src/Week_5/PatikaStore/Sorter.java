package Week_5.PatikaStore;

import java.util.Comparator;

public class Sorter implements Comparator<PBrand> {

    @Override
    public int compare(PBrand o1, PBrand o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
