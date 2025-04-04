public class SecuritySystemTest {
    public static void main(String[] args) {
        SecurityContext context = new SecurityContext();

        // Simulating dynamic selection
        context.setStrategy(new FingerprintVerification());
        context.unlockRoom();

        context.setStrategy(new RetinaVerification());
        context.unlockRoom();

        context.setStrategy(new VoiceVerification());
        context.unlockRoom();
    }
}

