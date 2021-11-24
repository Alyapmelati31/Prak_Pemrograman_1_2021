public class Mahasiswa extends DataBadan {
    private String nim;
    private String nama;
    private int semester;
    private double ipk;
    

    public Mahasiswa(String nim, String nama, int semester, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.semester = semester;
        this.ipk = ipk;
    }

    public void setNIM(String nim) {
        this.nim = nim;
    }

    public String getNIM() {
        return this.nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }
    
    public void setsemester(int semester) {
        this.semester = semester;
    }

    public int getsemester() {
        return this.semester;
    }

    public void setIPK(double ipk) {
        this.ipk = ipk;
    }

    public double getIPK() {
        return this.ipk;
    }

    public void getDetail() {
        System.out.println(this.nim+"\t"+this.nama+"\t"+this.semester+"\t"+this.ipk+"\t"+this.tinggiBadan+"\t");
    }

}