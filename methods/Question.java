import java.util.*;
public class Question {
    public boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        for (int i = 0; i < 10; i++) ages[i] = sc.nextInt();
        Question svc = new Question();
        for (int i = 0; i < 10; i++) System.out.println(svc.canStudentVote(ages[i]));
    }
} 