public class Dosen extends Element {
    // Atribut
    private int jumlahHariKerja;

    // Constructor
    public Dosen(String nama, int jumlahHariKerja) {
        super(nama);
        this.jumlahHariKerja = jumlahHariKerja;
        jumlah+=jumlahHariKerja*8;
    }

    // Getter
    public int getJamSibuk() {
        return jumlahHariKerja *8;

    }
}
