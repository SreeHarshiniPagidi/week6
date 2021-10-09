package soapbuilder.state;


public class Soap
{
    LiquidState liquidState;
    SolidState solidState;
    SqueezedState squeezedState;
    BrokenState brokenState;
    State state;

    Soap()
    {
        liquidState = new LiquidState(this);
        solidState= new SolidState(this);
        brokenState = new BrokenState(this);
        squeezedState=new SqueezedState(this);
        state=squeezedState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public LiquidState getLiquidState() {
        return liquidState;
    }

    public SolidState getSolidState() {
        return solidState;
    }

    public SqueezedState getSqueezedState() {
        return squeezedState;
    }

    public BrokenState getBrokenState() {
        return brokenState;
    }

    public void squeezedSoap()  {
        state.squeezedSoap();
    }

    public void liquidSoap()  {
        state.liquidSoap();
    }

    public void solidSoap() {
        state.solidSoap();
    }
    public void brokenSoap() {
        state.brokenSoap();
    }

}