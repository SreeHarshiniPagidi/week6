package soapbuilder.state;

public class LiquidState implements State{

    Soap soap;
    public LiquidState(Soap soap) {
        this.soap = soap;
    }

    @Override
    public void squeezedSoap() {
        System.out.println("Soap already brought");
        soap.setState(soap.getSqueezedState());

    }

    @Override
    public void liquidSoap() {
        System.out.println("Soaps are liquid to protect and comfort the human foot");
    }

    @Override
    public void solidSoap() {
        System.out.println("Soaps are used for bathing");
        soap.setState(soap.getSolidState());
    }

    @Override
    public void brokenSoap() {
        System.out.println("Soap can be squeezed if wet enough");
        soap.setState(soap.getBrokenState());
    }



}

