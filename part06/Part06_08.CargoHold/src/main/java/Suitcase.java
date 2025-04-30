import java.util.ArrayList;

public class Suitcase {
    
    private ArrayList<Item> items;
    private int maxWeight;

    // Construtor correto: agora inicializa maxWeight
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    // Método para adicionar um item, respeitando o peso máximo
    public void addItem(Item item) {
        int totalWeight = 0;
        
        // Soma o peso de todos os itens já na mala
        for (Item itemInTheSuitCase : this.items) {
            totalWeight += itemInTheSuitCase.getWeight();
        }
        
        // Adiciona o novo item apenas se não ultrapassar o limite
        if (totalWeight + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }
    
    public void printItems(){
        for(Item item:items){
            System.out.println(item.toString());
        }
        
    }
    
    public int totalWeight(){
        int totalWeight=0;
        for(Item item:items){
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    
    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }
        
        
        Item itemReturned=items.get(0);
        
        
        for(Item item:items){
            if(itemReturned.getWeight()<item.getWeight()){
                itemReturned=item;
            }
        }
        
        return itemReturned;
    }
    // Método toString corrigido para mostrar o peso atual da mala
    public String toString() {
        int totalWeight = 0;
        
        // Calcula o peso total da mala
        for (Item item : this.items) {
            totalWeight += item.getWeight();
        }
        
        if(this.items.isEmpty()){
            return "no items (0 kg)";
        }else if(this.items.size()==1){
            return items.size()+" item"+ " ("+totalWeight+") kg)";
        }
        
        
        return items.size()+" items"+ " ("+totalWeight+") kg)";
    }
    
    
}
