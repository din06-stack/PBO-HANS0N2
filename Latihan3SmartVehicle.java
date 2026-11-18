// Interface untuk kendaraan yang memiliki mesin
interface EngineVehicle {
    void startEngine();
}

// Interface untuk kendaraan yang menggunakan bahan bakar
interface Fuelable {
    void isiBahanBakar();
}

// Interface untuk kendaraan yang menggunakan baterai
interface Rechargeable {
    void isiBaterai();
}

// Interface untuk kendaraan yang menggunakan pedal
interface Pedalable {
    void pedal();
}

// Kelas mobil listrik yang memiliki mesin dan baterai
class MobilListrik implements EngineVehicle, Rechargeable {

    public void startEngine() {
        System.out.println("Menyalakan mobil listrik.");
    }

    public void isiBaterai() {
        System.out.println("Mengisi baterai mobil listrik.");
    }
}

// Kelas mobil bensin yang memiliki mesin dan bahan bakar
class MobilBensin implements EngineVehicle, Fuelable {

    public void startEngine() {
        System.out.println("Menyalakan mesin mobil bensin.");
    }

    public void isiBahanBakar() {
        System.out.println("Mengisi bensin mobil.");
    }
}

// Kelas sepeda yang menggunakan pedal
class Sepeda implements Pedalable {

    public void pedal() {
        System.out.println("Mengayuh sepeda.");
    }
}

// Kelas utama program
public class Latihan3SmartVehicle {
    public static void main(String[] args) {

        // Membuat objek mobil listrik
        MobilListrik listrik = new MobilListrik();
        listrik.startEngine();
        listrik.isiBaterai();

        // Membuat objek mobil bensin
        MobilBensin bensin = new MobilBensin();
        bensin.startEngine();
        bensin.isiBahanBakar();

        // Membuat objek sepeda
        Sepeda sepeda = new Sepeda();
        sepeda.pedal();
    }
}
