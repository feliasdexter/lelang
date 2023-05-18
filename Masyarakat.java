package lelang.ukl;

import java.util.ArrayList;

public class Masyarakat implements User{
    private ArrayList<String> namaMasyarakat = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();

    public Masyarakat(){
        this.namaMasyarakat.add("Danniar Sosro");
        this.alamat.add("Italy");
        this.telepon.add("08555555");
        
        this.namaMasyarakat.add("Bocilll");
        this.alamat.add("Spanyol");
        this.telepon.add("08333333");
    }
    
    @Override
    public void setNama(String nama) {
        this.namaMasyarakat.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int id) {
        return this.namaMasyarakat.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
    public void tampilkanUser(){
        int n = this.namaMasyarakat.size();
        for(int i=0;i<n;i++){
            System.out.println("---------------------------");
            System.out.println("Nama    = "+getNama(i));
            System.out.println("Alamat  = "+getAlamat(i));
            System.out.println("Telepon = "+getTelepon(i));
            System.out.println("----------------------------");
        }
    }
}
