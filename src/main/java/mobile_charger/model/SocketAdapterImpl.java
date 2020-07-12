package mobile_charger.model;

import mobile_charger.SocketAdapter;

//using inheritance
public class SocketAdapterImpl extends Socket implements SocketAdapter {

    @Override
    public Volt get120Volts() {
        return getVolts();
    }

    @Override
    public Volt get12Volts() {
        Volt volt = getVolts();
        return convert(volt, 10);
    }

    @Override
    public Volt get3Volts() {
        Volt volt = getVolts();
        return convert(volt, 36);
    }

    private Volt convert(Volt volt, int divider){
        return new Volt(volt.getVolts() / divider);
    }
}
