import java.util.HashMap;

class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> examScores = new HashMap<String, Integer>();

        examScores.put("Math", 75);
        examScores.put("Sociology", 85);
        examScores.put("English", 95);
        examScores.put("Bengali", 100);
        examScores.put("Computer science",100);

        examScores.forEach((subject, score) -> {
            System.out.println(subject + " - " + score);
        });
    }
}
