package edu.upi.dummy.model;

/**
 * Created by Rizki on 11/29/2017.
 */

public class Mahasiswa {
    private String nim, nama, id_jurusan, alamat, lat, lng;

    public Mahasiswa(String nim, String nama, String id_jurusan, String alamat, String lat, String lng) {
        this.nim = nim;
        this.nama = nama;
        this.id_jurusan = id_jurusan;
        this.alamat = alamat;
        this.lat = lat;
        this.lng = lng;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getId_jurusan() {
        return id_jurusan;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }
}
