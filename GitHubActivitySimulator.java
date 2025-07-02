public class GitHubActivitySimulator {
    public static void main(String[] args) {
        String[] days = {
            "Monday", "Tuesday", "Wednesday", 
            "Thursday", "Friday", "Saturday", "Sunday"
        };

        for (String day : days) {
            simulateActivity(day);
        }
    }

    public static void simulateActivity(String day) {
        System.out.println("[" + day + "] GitHub activity: ✅ Task completed or commit simulated.");
    }
}
