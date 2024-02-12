public class ItemInventaire extends Item{

    // Variables d'instance
    private int quantite;
    private int seuil;

    // Constructeurs
    public ItemInventaire() {
        super();
        this.quantite = 0;
        this.seuil = 0;
    }

    public ItemInventaire(String description, double prix){
        super(description, prix);
        this.quantite = 0;
        this.seuil = 0;
    }

    public ItemInventaire(String description, double prix, boolean tps, boolean tvq){
        super(description, prix, tps, tvq);
        this.quantite = 0;
        this.seuil = 0;
    }

    public ItemInventaire(String description, double prix, boolean tps, boolean tvq, int quantite, int seuil){
        super(description, prix, tps, tvq);
        this.quantite = quantite;
        this.seuil = seuil;
    }

    public ItemInventaire(ItemInventaire itemInventaire){
        super(itemInventaire);
        this.quantite = itemInventaire.quantite;
        this.seuil = itemInventaire.quantite;
    }


    // Methodes de classe
    public String toString(){
        return super.toString() + "\nQuantite : " + this.quantite + "\nSeuil : " + this.seuil;
    }

    public boolean equals(Object autreItem){
        if(autreItem != null){
            System.out.println(autreItem.getClass().getTypeName());
            if(autreItem.getClass().getTypeName() == "ItemInventaire"){

                Item item = (Item) autreItem;

                if(item.isTvq() != super.isTvq()) return false;
                if(item.isTps() != super.isTps()) return false;
                if(item.getDescription() != super.getDescription()) return false;
                if(item.getPrix() != super.getPrix()) return false;

                return true;

            }
        }else return false;
        return false;
    }
}
