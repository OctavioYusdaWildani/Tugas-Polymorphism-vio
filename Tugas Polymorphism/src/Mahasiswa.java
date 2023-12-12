public class Mahasiswa extends Element {
    private int sks;
    // Constructor
    public Mahasiswa(String nama, int sks) {
        super(nama);
        this.sks = sks;
        jumlah+=sks*3;
    }
    public Mahasiswa(String nama,int sks,int lebih){
        super(nama);
        this.sks=sks;
        jumlah+=sks*3+lebih;
    }
    public int getJamSibuk() {
        return sks *3;

    }
}
