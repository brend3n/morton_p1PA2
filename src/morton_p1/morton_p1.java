package morton_p1;
import java.util.Scanner;

public class morton_p1 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int firstDigit, secondDigit, thirdDigit, fourthDigit;
		int temp1;
		int temp2;
		int original;
		int encryptedNum;
		int decrypted;
		
		// Prompt for number
		System.out.println("Enter a number to be encrypted: ");
		
		// get number from user
		original = scan.nextInt();
		
		System.out.println("Original: " + original);
		
		
		
		
		// int x = abcd % 10, gets the ones place off 4 digit integer X (d)
		// Dividing x by 10 chops off the ones digit (abc).
		// Now, the integer is abc.
		// Continue until each digit is in separate integer variable
		
		// (ones)
		firstDigit = original % 10;
		original /= 10;
		
		// (tens)
		secondDigit = original % 10;
		original /= 10;
		
		// (hundreds)
		thirdDigit = original % 10;
		original /= 10;
		
		// (thousands)
		fourthDigit = original % 10;
		
		
		// encrypting each digit
		
		firstDigit = (firstDigit + 7) % 10;
		secondDigit = (secondDigit + 7) % 10;
		thirdDigit = (thirdDigit + 7) % 10;
		fourthDigit = (fourthDigit + 7) % 10;
		
		// swap first and third
		temp1 = firstDigit;
		firstDigit = thirdDigit;
		thirdDigit = temp1;
		
		// swap second and fourth
		temp2 = secondDigit;
		secondDigit = fourthDigit;
		fourthDigit = temp2;
		
		
		// Recombining digit to its encrypted value
		encryptedNum = (thirdDigit + fourthDigit*10 + firstDigit * 100 + secondDigit* 1000 );
		
		System.out.println("Encrypted: " + encryptedNum);
		
		
		
		
		// Same as before, isolating each digit of encrypted value
		firstDigit = encryptedNum % 10;
		encryptedNum /= 10;
		
		secondDigit = encryptedNum % 10;
		encryptedNum /= 10;
		
		thirdDigit = encryptedNum % 10;
		encryptedNum /= 10;
		
		fourthDigit = encryptedNum % 10;
		
		
		// Decryption key 
		
		// Adding 3 and then modding by 10, is the
		// opposite of adding 7 and then modding 10, 
		// effectively reversing the encryption.
		
		firstDigit = (firstDigit + 3) % 10;
		secondDigit = (secondDigit + 3) % 10;
		thirdDigit = (thirdDigit + 3) % 10;
		fourthDigit = (fourthDigit + 3) % 10;
			
		
		// Recombining decrypted value (original int entered)		
		decrypted = (firstDigit + secondDigit*10 + thirdDigit*100 + fourthDigit*1000);
		
		System.out.println("Decrypted: " + decrypted);
		
	}

}

