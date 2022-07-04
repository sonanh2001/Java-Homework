public class CalSumApplication {
    public static int calSum(int num1,int num2){
        int sum=0;
        if(num1>num2){
            int temp=num1;
            num2=num1;
            num1=temp;
        }
        for(int i=num1;i<=num2;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int result=calSum(50,1);
        System.out.println(result);
    }
}
