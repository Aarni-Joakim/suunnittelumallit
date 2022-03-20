public enum OpiskelijaStatus {
    OPISKELEE("adidasTehdas"),
    VALMISTUNUT("bossTehdas");

    private final String factoryName;

    OpiskelijaStatus(String factoryName) {
        this.factoryName = factoryName;
    }

    @Override
    public String toString() {
        return factoryName;
    }
}
