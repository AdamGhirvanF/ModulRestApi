package model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MahasiswaResponse {
    @SerializedName("mahasiswa")
    private List<Mahasiswa> mahasiswa;
    @SerializedName("status")
    private boolean status;
    public List<Mahasiswa> getData(){
        return mahasiswa;
    }
    public boolean isStatus() {
        return status;
    }
}
