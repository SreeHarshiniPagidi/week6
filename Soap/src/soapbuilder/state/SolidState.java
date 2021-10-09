package soapbuilder.state;

public class SolidState implements State {

    Soap soap;
    public SolidState(Soap soap) {
        this.soap = soap;
    }

    @Override
    public void squeezedSoap() {
        System.out.println("Soap already brought");
        soap.setState(soap.getSqueezedState());
    }

    @Override
    public void liquidSoap() {
        System.out.println("Soaps are liquidd to protect and comfort the human foot");
        soap.setState(soap.getLiquidState());
    }

    @Override
    public void solidSoap() {
        System.out.println("Soaps are meant for cleansing");
    }

    @Override
    public void brokenSoap() {
        System.out.println("soap slips");
        soap.setState(soap.getBrokenState());
    }



}