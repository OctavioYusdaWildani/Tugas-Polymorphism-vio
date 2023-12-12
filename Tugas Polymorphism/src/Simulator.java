public class Simulator {
    public static void main(String[] args) {
       
        Asdos asdos1 = new Asdos ("Fairuzikun", 21, 10);
        System.out.println( asdos1.getNama() + " adalah seorang asdos dengan jam sibuk "  +  asdos1.getJamSibuk());

        Dosen dosen1 = new Dosen ("Raja OP Damanik", 5);
        System.out.println (dosen1.getNama() + " adalah seorang dosen dengan jam sibuk " + dosen1.getJamSibuk());

        Asdos asdos2 = new Asdos ("Angel-chan", 19, 7);
        System.out.println (asdos2.getNama() + " adalah seorang asdos dengan jam sibuk "  +  asdos2.getJamSibuk());

        Mahasiswa mahasiswa1 = new Mahasiswa ( "Firman", 20);
        System.out.println (mahasiswa1.getNama() + " adalah seorang mahasiswa dengan jam sibuk "  +  mahasiswa1.getJamSibuk());

        Mahasiswa mahasiswa2 = new Mahasiswa ( "Nid to pass this sem", 23);
        System.out.println (mahasiswa2.getNama() + " adalah seorang mahasiswa dengan jam sibuk "  +  mahasiswa2.getJamSibuk());

        Dosen dosen2 = new Dosen ("Nivotko", 3);
        System.out.println (dosen2.getNama() + " adalah seorang dosen dengan jam sibuk " + dosen2.getJamSibuk());

        Element.print();

}
    }