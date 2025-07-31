import java.util.HashSet;

public class Otp {
    public static int generateOTP() {
        // Math.random() generates 0.0 <= value < 1.0
        // Multiply by 900000 and add 100000 to get range 100000 - 999999
        return (int)(Math.random() * 900000) + 100000;
    }
    public static boolean areOTPsUnique(int[] otps) {
        HashSet<Integer> set = new HashSet<>();
        for (int otp : otps) {
            if (!set.add(otp)) {
                // otp already exists in set,
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];

        System.out.println("Generated OTPs:");
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
            System.out.println(otpArray[i]);
        }

        if (areOTPsUnique(otpArray)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Duplicate OTP found. OTPs are not unique.");
        }
    }
}
