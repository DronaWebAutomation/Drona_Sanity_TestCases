package Utility;


import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Properties;

public class CredentialsManager {
    private static final String SECRET_KEY = "7735000100002692"; // Replace with a secure key
    private static final String CREDENTIALS_FILE = "src/test/resources/credentials.properties";

    // Fetch decrypted credentials
    public static String getDecryptedCredential(String key) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(CREDENTIALS_FILE));

            // Get the encrypted value from the properties file
            String encryptedValue = properties.getProperty(key);
            if (encryptedValue == null) {
                throw new IllegalArgumentException("Credential not found for key: " + key);
            }

            // Decrypt and return the value
            return EncryptionUtil.decrypt(encryptedValue, SECRET_KEY);
        } catch (Exception e) {
            throw new RuntimeException("Error fetching decrypted credential for key: " + key, e);
        }
    }

    // Encrypt and store credentials in the properties file (One-time setup)
    public static void encryptAndStoreCredential(String key, String plainValue) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(CREDENTIALS_FILE));

            // Encrypt the value
            String encryptedValue = EncryptionUtil.encrypt(plainValue, SECRET_KEY);
            properties.setProperty(key, encryptedValue);

            // Save back to the file
            properties.store(new FileWriter(CREDENTIALS_FILE), "Updated credentials");
        } catch (Exception e) {
            throw new RuntimeException("Error storing encrypted credential for key: " + key, e);
        }
    }
}
