package dumplings;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DumplingOrder {

    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;
    private List<Dumpling> dumplings = new ArrayList<>();

    public void addDumpling(Dumpling dumpling) {
        this.dumplings.add(dumpling);
    }
}
