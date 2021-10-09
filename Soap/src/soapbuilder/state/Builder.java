package soapbuilder.state;

public interface Builder {
    Builder addOil();
    Builder addWater();
    Builder addLye();
    Soap build();
}