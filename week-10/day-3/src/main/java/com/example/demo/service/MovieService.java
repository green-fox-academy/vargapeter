package com.example.demo.service;

import com.example.demo.model.GenreListDTO;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Service
public interface MovieService {

    @GET("/3/genre/movie/list")
    public Call<GenreListDTO> getAllGenres(@Query("api_key")String apiKey);
}
