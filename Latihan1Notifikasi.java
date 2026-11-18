// Interface umum untuk semua jenis notifikasi
interface Notifier {
    void send(String message);
}

// Implementasi notifikasi Email
class EmailNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Mengirim Email: " + message);
    }
}

// Implementasi notifikasi SMS
class SMSNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Mengirim SMS: " + message);
    }
}

// Implementasi notifikasi WhatsApp
class WhatsAppNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Mengirim WhatsApp: " + message);
    }
}

// Kelas utama untuk mengelola pengiriman notifikasi
class NotificationService {
    private Notifier notifier;

    // Constructor untuk menerima implementasi Notifier
    public NotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    // Method untuk mengirim pesan melalui platform yang dipilih
    public void notify(String message) {
        notifier.send(message);
    }
}

// Kelas utama program
public class Latihan1Notifikasi {
    public static void main(String[] args) {

        // Mengirim notifikasi melalui Email
        NotificationService email = new NotificationService(
            new EmailNotifier()
        );
        email.notify("Halo, ini email test!");

        // Mengirim notifikasi melalui SMS
        NotificationService sms = new NotificationService(
            new SMSNotifier()
        );
        sms.notify("Ini SMS test!");

        // Mengirim notifikasi melalui WhatsApp
        NotificationService whatsapp = new NotificationService(
            new WhatsAppNotifier()
        );
        whatsapp.notify("Ini pesan WhatsApp test!");
    }
}
