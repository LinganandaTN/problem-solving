class Addition{
    void add(int[] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++){
            for (int j =0; j < x[i].length;j++){
            sum += x[i][j];
            }
            System.out.println(sum);
        }
}
}
public class anonymous_Array{
    public static void main(String[] args){
        Addition a= new Addition();
        a.add(new int[][] {{10,20},{30,40,50}});
    }
}