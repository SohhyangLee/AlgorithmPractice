import java.util.Arrays;
import java.util.Comparator;

public class TemplateA{
  public static main(String[] args){
    int[][] arr = {{}, {}, {}};


    Arrays.sort(arr, new Comparator<int[]>(){
      @override
      public int compare(int[] o1, int[] o2){
        if(o1[0] == o2[0]){
          return o1[1]-o2[1];
        }
        else{
          return o1[0]-o2[0];
        }
      }
    });


  }
}
