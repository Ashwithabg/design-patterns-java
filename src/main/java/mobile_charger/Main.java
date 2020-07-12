package mobile_charger;

import mobile_charger.model.SocketAdapterImpl;
import mobile_charger.model.Volt;

public class Main {
    public static void main(String[] args) {
        socketAdapter();
    }

    private static void socketAdapter() {
        SocketAdapterImpl socketAdapter = new SocketAdapterImpl();
        Volt volt3 = getVolt(socketAdapter, 3);
        System.out.println("v3: " + volt3.toString());
    }

    private static Volt getVolt(SocketAdapter socketAdapter, int noOfVolts) {
        switch (noOfVolts) {
            case 3:
                return socketAdapter.get3Volts();
            case 12:
                return socketAdapter.get12Volts();
            case 120:
                return socketAdapter.get120Volts();
            default:
                return socketAdapter.get12Volts();
        }
    }
}
