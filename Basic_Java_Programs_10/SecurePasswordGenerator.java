import java.security.SecureRandom;SecurePasswordGenerator

class SecurePasswordGenerator {
    public static void main(String[] args) {
        int length = 12;

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "@#$%&*";

        String allChars = upper + lower + numbers + symbols;

        SecureRandom rand = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for(int i = 0; i < length; i++) {
            int index = rand.nextInt(allChars.length());
            password.append(allChars.charAt(index));
        }

        System.out.println("Secure Password: " + password);
    }
}