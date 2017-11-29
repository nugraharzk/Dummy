package edu.upi.dummy.rest;

import java.util.List;

import edu.upi.dummy.model.Mahasiswa;
import edu.upi.dummy.model.MahasiswaResponse;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Rizki on 11/29/2017.
 */

public interface ApiInterface {

    @GET("mahasiswa")
    Call<List<Mahasiswa>> getMahasiswaList();

}
