import java.util.ArrayList;

public class StringListSearch {

    public static int unorderedSearch(ArrayList<String> items, String term) {
        for(int i = 0; i < items.size(); i ++){
            if(items.get(i).equals(term)){
                return i;
            }
        }
        return -1;
    }

    public static int orderedSearch(ArrayList<String> items, String term){
        for(int i = 0; i < items.size(); i ++){
            if(items.get(i).compareTo(term) == 0){
                return i;
            }
            else if(items.get(i).compareTo(term) >= 0){
                return -1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        
    }
}