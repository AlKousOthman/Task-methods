import java.util.ArrayList;

public class SummationPractice {
    public static void main(String[] args) throws Exception {
        

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
       
       
        

        System.out.println(summation(numbers));



    }
    public static int summation(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i<numbers.size();i++){
            sum = sum + numbers.get(i);
        }
        return sum;
    

    }
}
