import component.*;

public class Main {

    // Toteutusta tullaan kehittämään ajan salliessa
    public static void main(String[] args) {
        CPU cpu = new CPU();
        GPU gpu = new GPU();
        RAM ram = new RAM();
        SSD ssd = new SSD();

        Motherboard motherboard = new Motherboard();
        motherboard.addComponent(cpu);
        motherboard.addComponent(gpu);
        motherboard.addComponent(ram);
        motherboard.addComponent(ssd);

        PSU psu = new PSU();

        Case aCase = new Case();
        aCase.addComponent(psu);
        aCase.addComponent(motherboard);

        System.out.print("Total cost of components = " + aCase.getCost());
    }
}
