import model.Mahasiswa;

public class Main {
    public static void main(String[] args){
        Mahasiswa m1 = new Mahasiswa("19712371","Jeffry","14-02-2000");
        m1.tampilkanAtribut();
        System.out.println(m1.getNama());
    }

}
