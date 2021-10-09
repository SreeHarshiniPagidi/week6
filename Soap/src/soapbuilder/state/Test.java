package soapbuilder.state;

public class Test {

    public static void main(String[] args) {

        SoapBuilder build=new SoapBuilder();
        Soap s=build.addOil().addWater().addLye().build();


        s.squeezedSoap();

        s.brokenSoap();

        s.solidSoap();

        s.liquidSoap();

        s.squeezedSoap();



    }

}

