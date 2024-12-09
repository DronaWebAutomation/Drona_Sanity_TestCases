package Utility;

public class SetupEncryptedCredentials {
	 public static void main(String[] args) {
	        // Replace with your actual email and password
	        String email = "rahul.sharma_tpr@mankindpharma.com";
	        String password = "Harry@780";

	        // Encrypt and store credentials
	        CredentialsManager.encryptAndStoreCredential("email", email);
	        CredentialsManager.encryptAndStoreCredential("password", password);

	        System.out.println("Credentials stored successfully.");
	    }

}
