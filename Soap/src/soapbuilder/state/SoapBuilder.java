package soapbuilder.state;


public class SoapBuilder implements Builder{

    SoapBuilder(){

    }

    @Override
    public Builder addOil() {
        System.out.println("foam is formed with soap");
        return this;
    }

    @Override
    public Builder addWater() {
        System.out.println("soap is hydro phobic");
        return this;
    }

    @Override
    public Builder addLye() {
        System.out.println("use lies for better experience");
        return this;
    }

    @Override
    public Soap build() {
        Soap s=new Soap();
        System.out.println("they are mostly cuboid in shape");
        return s;
    }
}