package soapbuilder.state;

public class SqueezedState implements State {

    Soap soap;
    public SqueezedState(Soap soap) {
        this.soap = soap;
    }

    @Override
    public void squeezedSoap() {
        System.out.println("Buying Soaps");

    }

    @Override
    public void liquidSoap() {
        System.out.println("Soaps are liquidd to protect and comfort the human foot");
        soap.setState(soap.getLiquidState());

    }

    @Override
    public void solidSoap() {
        System.out.println("Soaps come in many colours");
        soap.setState(soap.getSolidState());
    }

    @Override
    public void brokenSoap() {
        System.out.println("Soaps have fragrance");
        soap.setState(soap.getBrokenState());
    }

}
