package Computer;
import java.util.Scanner;

class Computer {
    private String hdd;
    private String ram;
    private String os;

    public Computer(String hdd, String ram, String os) {
        this.hdd = hdd;
        this.ram = ram;
        this.os = os;
    }

    public String getHdd() {
        return hdd;
    }

    public String getRam() {
        return ram;
    }

    public String getOs() {
        return os;
    }


    public void displaySpecs() {
        System.out.println("HDD: " + hdd + ", RAM: " + ram + ", OS: " + os);
    }
}
public class ComputerSelector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Predefined computer objects
        Computer HP = new Computer("512GB SSD", "16GB", "Windows 11 Pro");
        Computer Lenovo = new Computer("1TB SSD", "32GB", "Windows 11 Home");
        Computer Dell = new Computer("1TB SSD + 2TB HDD", "64GB", "Linux (Ubuntu)");
        Computer MacOS = new Computer("2TB SSD", "32GB", "MacOS Ventura");

        while (true) {
            System.out.println("Enter the computer specs you're looking for:");

            // Prompt user for specs
            System.out.print("Enter HDD: ");
            String hddInput = scanner.nextLine();

            System.out.print("Enter RAM: ");
            String ramInput = scanner.nextLine();

            System.out.print("Enter OS: ");
            String osInput = scanner.nextLine();

            // Match specs
            if (hddInput.equalsIgnoreCase(HP.getHdd()) &&
                ramInput.equalsIgnoreCase(HP.getRam()) &&
                osInput.equalsIgnoreCase(HP.getOs())) {
                System.out.println("Match found! HP Computer:");
                HP.displaySpecs();
                break;
            } else if (hddInput.equalsIgnoreCase(Lenovo.getHdd()) &&
                       ramInput.equalsIgnoreCase(Lenovo.getRam()) &&
                       osInput.equalsIgnoreCase(Lenovo.getOs())) {
                System.out.println("Match found! Lenovo Computer:");
                Lenovo.displaySpecs();
                break;
            } else if (hddInput.equalsIgnoreCase(Dell.getHdd()) &&
                       ramInput.equalsIgnoreCase(Dell.getRam()) &&
                       osInput.equalsIgnoreCase(Dell.getOs())) {
                System.out.println("Match found! Dell Computer:");
                Dell.displaySpecs();
                break;
            } else if (hddInput.equalsIgnoreCase(MacOS.getHdd()) &&
                       ramInput.equalsIgnoreCase(MacOS.getRam()) &&
                       osInput.equalsIgnoreCase(MacOS.getOs())) {
                System.out.println("Match found! MacOS Computer:");
                MacOS.displaySpecs();
                break;
            } else {
                System.out.println("No matching computer found with the given specs. Please try again.");
            }
        }

        scanner.close();
    }
}
