package interfaces;

import java.io.Serializable;

public interface Car extends Sellable {
    int TIRES = 4;

    String getModel();

    String getColor();

    int getHorsePower();

    String countryProducer();



}
