public class Main {

    public static void main(String[] args) {

        setJasperStudyStatus();
    }

    // opiskelijastatuksen perusteella määritellään Jasperin vaatteet
    // oStatus enum välitetään Jasperin konstruktoriin
    // sen toString-metodin perusteella haetaan tiedostosta asianmukainen tehdas
    private static void setJasperStudyStatus() {
        char select;
        OpiskelijaStatus oStatus = null;
        do {
            System.out.println("\n\tOnko Jasper valmistunut?");
            System.out.println("\n\t\t\t1. Ei.");
            System.out.println("\t\t\t2. Kyllä.");
            System.out.println("\t\t\tx. En tiedä.");
            System.out.println("\n\n");
            select = Input.input();
            switch (select) {
                case '1' -> oStatus = OpiskelijaStatus.OPISKELEE;
                case '2' -> oStatus = OpiskelijaStatus.VALMISTUNUT;
            }
            if (oStatus != null && select != 'x') {
                Jasper jDog = new Jasper(oStatus);
                jDog.tarkistaVaatetus();
            }
        } while (select != 'x');
    }
}
