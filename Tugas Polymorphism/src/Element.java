public class Element{
    private String nama;
    public static int jumlah=0;



    public Element(String nama){
        this.nama=nama;
    }
    public String getNama() {
        return nama;
    }
    public static void print(){
        System.out.println("Total jam sibuk elemen Fasilkom adalah " + jumlah);
    }
}