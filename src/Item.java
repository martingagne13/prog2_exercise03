public class Item {

    // Variables de classe
    private static int nombreItemCree = 0;

    // Variables d'instance
    private String description;
    private double prix;
    private boolean TPS;
    private boolean TVQ;
    private int NoIdentification;

    // Constructeurs

    public Item (){
        this.description = "";
        this.prix = 0;
        this.NoIdentification = nombreItemCree;
        nombreItemCree++;
    }

    public Item (String description, double prix){
        this();
        this.description = description;
        this.prix = prix;
    }

    // Getters
    public int getNoIdentification(){
        return this.NoIdentification;
    }

    public String getDescription(){
        return this.description;
    }

    public double getPrix(){
        return this.prix;
    }



}
