package edu.upi.dummy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;

import edu.upi.dummy.adapter.MahasiswaAdapter;
import edu.upi.dummy.model.Mahasiswa;
import edu.upi.dummy.model.MahasiswaResponse;
import edu.upi.dummy.rest.ApiClient;
import edu.upi.dummy.rest.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private List<Mahasiswa> mahasiswaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView recyclerView = findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);

        Call<List<Mahasiswa>> call = apiInterface.getMahasiswaList();
        call.enqueue(new Callback<List<Mahasiswa>>() {
            @Override
            public void onResponse(Call<List<Mahasiswa>> call, Response<List<Mahasiswa>> response) {
                mahasiswaList = response.body();
                recyclerView.setAdapter(new MahasiswaAdapter(mahasiswaList, R.layout.mahasiswa_layout, getApplicationContext()));
            }

            @Override
            public void onFailure(Call<List<Mahasiswa>> call, Throwable t) {
                Log.e(TAG, t.toString());
            }
        });
    }

}
