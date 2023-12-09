import org.apache.commons.math3.random.UniformRandomGenerator;
import org.apache.commons.math3.random.RandomGenerator;



public class MainClass {
    
    public static void main(String[] args) {
        for (int i = 0; i <10; i++){
            double n1 = Math.random()*100;
            System.out.println(n1);
        }
    }
}
