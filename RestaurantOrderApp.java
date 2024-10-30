import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double calculateTotal() {

            return price * quantity;
            }
    }

    //live template calcTotal
    //public double calculateTotal() {

            //return price * quantity;
           // }
    //}
    public class RestaurantOrderApp {
        private List<Item> items = new ArrayList<>();

        public void addItem(Item item) {
            items.add(item);
        }

        public void printReceipt() {
            double grandTotal = 0;
            System.out.println("\n=== Nota Pemesanan ===");
            for (Item item : items) {
                double total = item.calculateTotal();
                System.out.printf("%s x%d @ Rp%.2f = Rp%.2f\n", item.getName(), item.getQuantity(), item.getPrice(), total);
                grandTotal += total;
            }
            System.out.printf("\nTotal Pembayaran: Rp%.2f\n", grandTotal);
        }

        public static void main(String[] args) {
            RestaurantOrderApp orderApp = new RestaurantOrderApp();
            Scanner scanner = new Scanner(System.in);

            System.out.println("=== Input Pemesanan Makanan ===");
            while (true) {
                System.out.print("Masukkan nama makanan (atau 'selesai' untuk mengakhiri): ");
                String name = scanner.nextLine();
                if (name.equalsIgnoreCase("selesai")) {
                    break;
                }

                System.out.print("Masukkan harga satuan: Rp");
                double price = scanner.nextDouble();

                System.out.print("Masukkan jumlah: ");
                int quantity = scanner.nextInt();
                scanner.nextLine(); // membersihkan buffer

                Item item = new Item(name, price, quantity);
                orderApp.addItem(item);
            }

            orderApp.printReceipt();
                        scanner.close();

            //orderApp.printReceipt();
           // scanner.close();
        }
    }

