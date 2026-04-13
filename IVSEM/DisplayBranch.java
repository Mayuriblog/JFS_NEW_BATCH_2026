/* 
input : 24951A0527
output : Regular B.Tech CSE

input : 24955A0427
output : Lateral B.Tech ECE

Branch Code - Branch Name 
-------------------------
 01 - CIVIL
 02 - EEE
 03 - MECH
 04 - ECE
 05 - CSE
 12 - IT
 21 - AERO
 33 - CSIT
 62 - CSE(CS)
 66 - CSE(AI&ML)
 67 - CSE(DS)

-----------------
  1A - Regular B.Tech
  5A - Lateral B.Tech
-----------------
 */
import java.util.*;

public class DisplayBranch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 10-digit Roll Number: ");
        String roll = sc.next();

        // Check length
        if (roll.length() != 10) {
            System.out.println("Invalid Roll Number");
            return;
        }

        // Extract codes
        String admissionCode = roll.substring(4, 6);
        String branchCode = roll.substring(6, 8);

        String admissionType = "";
        String branchName = "";

        // Admission Type
        switch (admissionCode) {
            case "1A":
                admissionType = "Regular B.Tech";
                break;
            case "5A":
                admissionType = "Lateral B.Tech";
                break;
            default:
				System.out.println("Unknown Admission Type");
               	return;
        }

        // Branch Name
        switch (branchCode) {
            case "01":
                branchName = "CIVIL";
                break;
            case "02":
                branchName = "EEE";
                break;
            case "03":
                branchName = "MECH";
                break;
            case "04":
                branchName = "ECE";
                break;
            case "05":
                branchName = "CSE";
                break;
            case "12":
                branchName = "IT";
                break;
            case "21":
                branchName = "AERO";
                break;
            case "33":
                branchName = "CSIT";
                break;
            case "62":
                branchName = "CSE(CS)";
                break;
            case "66":
                branchName = "CSE(AI&ML)";
                break;
            case "67":
                branchName = "CSE(DS)";
                break;
            default:
				System.out.println("Unknown Branch");
              	return;
        }

        System.out.println(admissionType + " " + branchName);
    }
}