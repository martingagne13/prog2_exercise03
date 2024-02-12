public class Item {

    // Variables de classe
    private static int nombreItemCree = 0;

    // Variables d'instance
    private String description;
    private double prix;
    private boolean tps;
    private boolean tvq;
    private int noIdentification;

    // Constructeurs

    public Item (){
        this.description = "";
        this.prix = 0;
        this.noIdentification = nombreItemCree;
        nombreItemCree++;
    }

    public Item (String description, double prix){
        this();
        this.description = description;
        this.prix = prix;
    }

    public Item (String description, double prix, boolean tps, boolean tvq){
        this(description, prix);
        this.tps = tps;
        this.tvq = tvq;
    }

    public Item (Item item){
        this.description = item.description;
        this.prix = item.prix;
        this.tps = item.tps;
        this.tvq = item.tvq;
        this.noIdentification = item.noIdentification;
    }

    // Getters
    public int getNoIdentification(){
        return this.noIdentification;
    }

    public String getDescription(){
        return this.description;
    }

    public double getPrix(){
        return this.prix;
    }

    public boolean isTps() {
        return tps;
    }

    public boolean isTvq() {
        return tvq;
    }

    public String toString(){
        return "Description : " + this.description + "\nPrix : " + this.prix + "\nIdentification : " + this.noIdentification
                + "\nTPS : " + this.tps + "\nTVQ : " + this.tvq;
    }

    public boolean equals(Object autreItem){
        if(autreItem != null){
            System.out.println(autreItem.getClass().getTypeName());
            if(autreItem.getClass().getTypeName() == "Item"){

                Item item = (Item) autreItem;

                if(item.tvq != this.tvq) return false;
                if(item.tps != this.tps) return false;
                if(item.description != this.description) return false;
                if(item.prix != this.prix) return false;

                return true;

            }
        }else return false;
        return false;
    }
}
