import javax.crypto.*;
import javax.crypto.spec.*;
import java.io.*;
import java.security.*;
import java.security.spec.KeySpec;
import java.util.Scanner;

public class SecureFileCrypto {

    private static final String ALGO = "AES/CBC/PKCS5Padding";

    // -------- KEY GENERATION (PBKDF2) --------
    private static SecretKey getKey(char[] password, byte[] salt) throws Exception {
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        KeySpec spec = new PBEKeySpec(password, salt, 65536, 128);
        SecretKey tmp = factory.generateSecret(spec);
        return new SecretKeySpec(tmp.getEncoded(), "AES");
    }

    // -------- ENCRYPT --------
    public static void encrypt(String inputFile, String outputFile, String password) {
        try {
            SecureRandom random = new SecureRandom();

            byte[] salt = new byte[16];
            random.nextBytes(salt);

            SecretKey key = getKey(password.toCharArray(), salt);

            Cipher cipher = Cipher.getInstance(ALGO);
            byte[] iv = new byte[16];
            random.nextBytes(iv);

            cipher.init(Cipher.ENCRYPT_MODE, key, new IvParameterSpec(iv));

            FileInputStream fis = new FileInputStream(inputFile);
            FileOutputStream fos = new FileOutputStream(outputFile);

            // Write salt + IV first (needed for decryption)
            fos.write(salt);
            fos.write(iv);

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                byte[] output = cipher.update(buffer, 0, bytesRead);
                if (output != null) fos.write(output);
            }

            byte[] finalBytes = cipher.doFinal();
            if (finalBytes != null) fos.write(finalBytes);

            fis.close();
            fos.close();

            System.out.println("File Encrypted Successfully!");

        } catch (Exception e) {
            System.out.println("Encryption Error: " + e.getMessage());
        }
    }

    // -------- DECRYPT --------
    public static void decrypt(String inputFile, String outputFile, String password) {
        try {
            FileInputStream fis = new FileInputStream(inputFile);

            byte[] salt = new byte[16];
            byte[] iv = new byte[16];

            fis.read(salt);
            fis.read(iv);

            SecretKey key = getKey(password.toCharArray(), salt);

            Cipher cipher = Cipher.getInstance(ALGO);
            cipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(iv));

            FileOutputStream fos = new FileOutputStream(outputFile);

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                byte[] output = cipher.update(buffer, 0, bytesRead);
                if (output != null) fos.write(output);
            }

            byte[] finalBytes = cipher.doFinal();
            if (finalBytes != null) fos.write(finalBytes);

            fis.close();
            fos.close();

            System.out.println("File Decrypted Successfully!");

        } catch (Exception e) {
            System.out.println("Decryption Error: " + e.getMessage());
        }
    }

    // -------- MAIN --------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Secure File Crypto Tool ===");
            System.out.println("1. Encrypt File");
            System.out.println("2. Decrypt File");
            System.out.println("3. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Input file path: ");
                    String in = sc.nextLine();

                    System.out.print("Output file path: ");
                    String out = sc.nextLine();

                    System.out.print("Password: ");
                    String pass = sc.nextLine();

                    encrypt(in, out, pass);
                }
                case 2 -> {
                    System.out.print("Encrypted file path: ");
                    String in = sc.nextLine();

                    System.out.print("Output file path: ");
                    String out = sc.nextLine();

                    System.out.print("Password: ");
                    String pass = sc.nextLine();

                    decrypt(in, out, pass);
                }
                case 3 -> {
                    System.out.println("Thank you!");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}