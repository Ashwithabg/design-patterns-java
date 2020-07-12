package mobile_charger;

import mobile_charger.model.Volt;

public interface SocketAdapter {
    Volt get120Volts();

    Volt get12Volts();

    Volt get3Volts();
}
