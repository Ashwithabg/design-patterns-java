package soda_machine;

import soda_machine.model.SodaMachine;

public class Main {
    public static void main(String[] args) {
        SodaMachine sodaMachine = new SodaMachine(10);
        sodaMachine.dispense();
        sodaMachine.insertMoney();
        sodaMachine.insertMoney();
        sodaMachine.ejectMoney();
    }
}
