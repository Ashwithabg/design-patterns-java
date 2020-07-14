package soda_machine.model;

public class SodaMachine {
    final static int SOLD_OUT = 0;
    final static int NO_MONEY = 1;
    final static int HAS_MONEY = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public SodaMachine(int count) {
        this.count = count;

        if (count > 0) {
            state = NO_MONEY;
        }
    }

    public void insertMoney() {
        if (state == HAS_MONEY) {
            System.out.println("You can not insert dollar bill");
        } else if (state == NO_MONEY) {
            System.out.println("YOU inserted the dollar");
        } else if (state == SOLD_OUT) {
            System.out.println("The machine is sold out");
        } else if (state == SOLD) {
            System.out.println("please wait!! we are giving you the soda");
        }
    }

    public void ejectMoney() {
        if (state == HAS_MONEY) {
            System.out.println("Returning dollar bill");
            state = NO_MONEY;
        } else if (state == NO_MONEY) {
            System.out.println("YOU have not inserted the dollar bill");
        } else if (state == SOLD_OUT) {
            System.out.println("The machine is sold out");
        } else if (state == SOLD) {
            System.out.println("already selected the soda");
        }
    }

    public void selectSoda() {
        if (state == HAS_MONEY) {
            System.out.println("Dispensing the soda as we speak");
            state = SOLD;
            dispense();
        } else if (state == NO_MONEY) {
            System.out.println("YOU have not inserted the dollar bill");
        } else if (state == SOLD_OUT) {
            System.out.println("The machine is sold out");
        } else if (state == SOLD) {
            System.out.println("already selected the soda");
        }
    }

    public void dispense() {
        if (state == HAS_MONEY) {
            System.out.println("Dispensing the soda as we speak");
        } else if (state == NO_MONEY) {
            System.out.println("YOU have not inserted the dollar bill");
        } else if (state == SOLD_OUT) {
            System.out.println("The machine is sold out");
        } else if (state == SOLD) {
            System.out.println("already selected the soda");
            count = count - 1;
            if (count == 0) {
                System.out.println("sorry out of soda");
                state = SOLD_OUT;
            }
        }
    }
}
