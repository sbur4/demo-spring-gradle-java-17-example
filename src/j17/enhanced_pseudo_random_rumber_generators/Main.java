package j17.enhanced_pseudo_random_rumber_generators;

import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {
        RandomGenerator generator = RandomGenerator.getDefault();
        System.out.println("Random number: " + generator.nextInt());
    }
}