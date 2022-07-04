public class CalSumApplication {
    public static int calSum(int start,int end){
        int sum=0;
        for(int i=start;i<=end;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int result=calSum(1,50);
        System.out.println(result);
    }
}
