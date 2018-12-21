import java.util.ArrayList;
import java.util.List;

public class PermutationFinder {
    private List<Character> permutatingArrayList = new ArrayList<>();
    private String searchedString;

    public PermutationFinder(String permutatingString, String searchedString) {
        for (char c: permutatingString.toCharArray()) {
            permutatingArrayList.add(c);
        }
        this.searchedString = searchedString;
    }

    public void searchForPermutations(){
        for(int i = 0; i <= searchedString.length() - permutatingArrayList.size(); ++i){
            List<Character> array = new ArrayList<>(permutatingArrayList);
            if(array.contains(searchedString.charAt(i))){
                array.remove((Character) searchedString.charAt(i));
                for(int j = 1; j < permutatingArrayList.size(); ++j){
                    if(array.contains(searchedString.charAt(i+j))){
                        array.remove((Character) searchedString.charAt(i+j));
                    } else {
                        break;
                    }
                }
            }
            if(array.size() == 0){
                System.out.println("Permutation found! Characters starting at " + i);
            }
        }
    }
}
