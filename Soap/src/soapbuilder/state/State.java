package soapbuilder.state;

public interface State
{
    public abstract void squeezedSoap();
    public abstract void liquidSoap();
    public abstract void solidSoap();
    public abstract void brokenSoap();
}