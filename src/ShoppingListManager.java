import java.util.ArrayList;
public class ShoppingListManager {

    private ArrayList<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }
    public void removeItem(String item) {

            boolean removed = items.remove(item);
            if (removed) {
                System.out.println("Item " + item + " removed");
            } else {
                System.out.println("item " + item + " is not here");
            }
    }

    public void displayItems() {
        if (items.isEmpty()){
            System.out.println("list is empty");
            return;

        }else {
            for (int i = 0; i < items.size(); i++){
                System.out.println(i + ": " + items.get(i));
            }
        }
    }
}