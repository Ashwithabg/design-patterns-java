package facade;

import facade.model.CPU;
import facade.model.ComputerFacade;
import facade.model.HardDrive;
import facade.model.Memory;

public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        Memory memory = new Memory();
        HardDrive hardDrive = new HardDrive();

        ComputerFacade computerFacade = new ComputerFacade(cpu, memory, hardDrive);
        computerFacade.start();
    }
}
