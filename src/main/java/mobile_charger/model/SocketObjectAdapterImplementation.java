package mobile_charger.model;

import mobile_charger.SocketAdapter;

//using composition
public class SocketObjectAdapterImplementation implements SocketAdapter {
    private Socket socket = new Socket();

    @Override
    public Volt get120Volts() {
        return socket.getVolts();
    }

    @Override
    public Volt get12Volts() {
        return convert(socket.getVolts(), 10);
    }

    @Override
    public Volt get3Volts() {
        return convert(socket.getVolts(), 36);
    }

    private Volt convert(Volt volt, int divider){
        return new Volt(volt.getVolts() / divider);
    }
}
