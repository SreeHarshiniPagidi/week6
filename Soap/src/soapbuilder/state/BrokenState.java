package soapbuilder.state;

public class BrokenState implements State {

    Soap soap;
    public BrokenState(Soap soap) {
        this.soap = soap;
    }

    @Override
    public void squeezedSoap() {
        System.out.println("Buying soap");
        soap.setState(soap.getSqueezedState());
    }

    @Override
    public void liquidSoap() {
        System.out.println("Soaps are liquid which are cooled to make them solid");
    }

    @Override
    public void solidSoap() {
        System.out.println("Soap broken, can also be used");

    }

    @Override
    public void brokenSoap() {
        System.out.println("Soap broke");

    }


}