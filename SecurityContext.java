public class SecurityContext {
    private VerificationStrategy strategy;

    // Allow user to set strategy at runtime
    public void setStrategy(VerificationStrategy strategy) {
        this.strategy = strategy;
    }

    public void unlockRoom() {
        if (strategy != null) {
            strategy.verify();
            System.out.println("Room Unlocked!");
        } else {
            System.out.println("No verification strategy selected!");
        }
    }
}

