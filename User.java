package lelang.ukl;
public interface User {
    public void setNama(String namaMasyarakat);
    public void setAlamat(String alamat);
    public void setTelepon(String telepon);
    
    public String getNama(int id);
    public String getAlamat(int id);
    public String getTelepon(int id);
}
