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

    public static int orderedBinarySearch(ArrayList<String> items, String term){
        int midpoint = items.size() / 2;
        int min = 0;
        int max = items.size()-1;
        while(max >= min){
            if(items.get(midpoint).equals(term)){
                return midpoint;
            }
            else if(items.get(midpoint).compareTo(term) < 0){
                min = midpoint + 1;
                midpoint = (min + max) / 2;
            }
            else if(items.get(midpoint).compareTo(term) > 0){
                max = midpoint - 1;
                midpoint = (min + max) / 2;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        
    }
}