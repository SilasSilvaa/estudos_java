package enums.models;

public enum TypeClient {
    LEGAL_ENTITY(1, "LEGAL_ENTITY"),
    INDIVIDUAL(2, "INDIVIDUAL");

    private final int VALUE;
    private final String NAME_REPORT;

    TypeClient(int value, String nameReport){
        this.VALUE = value;
        this.NAME_REPORT = nameReport;
    }

    public static TypeClient typeClientByName(String name){
        for(TypeClient typeClient : values()){
            if(typeClient.getNAME_REPORT().equalsIgnoreCase(name)){
                return typeClient;
            }
        }
        return null;
    }

    public String getNAME_REPORT() {
        return NAME_REPORT;
    }

    public int getVALUE() {
        return VALUE;
    }
}
