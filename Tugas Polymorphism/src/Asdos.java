public class Asdos extends Mahasiswa{
    // Atribut
    private int jamNgasdos;

    // Constructor
    public Asdos(String nama, int sks, int jamNgasdos) {
        super(nama, sks ,jamNgasdos);
        this.jamNgasdos = jamNgasdos;
    }

    // Getter
    public int getJamSibuk() {
        return super.getJamSibuk() + jamNgasdos;

    }
}

