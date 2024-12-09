package Utility;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class EncryptionUtil {
    private static final String ALGORITHM = "AES";

    // Encrypt the text
    public static String encrypt(String data, String secretKey) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        SecretKey key = new SecretKeySpec(secretKey.getBytes(), ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedData = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encryptedData);
    }

    // Decrypt the text
    public static String decrypt(String encryptedData, String secretKey) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        SecretKey key = new SecretKeySpec(secretKey.getBytes(), ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decryptedData = cipher.doFinal(Base64.getDecoder().decode(encryptedData));
        return new String(decryptedData);
    }

    // Generate a random secret key
    public static String generateSecretKey() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance(ALGORITHM);
        keyGen.init(128);
        SecretKey secretKey = keyGen.generateKey();
        return Base64.getEncoder().encodeToString(secretKey.getEncoded());
    }
}
