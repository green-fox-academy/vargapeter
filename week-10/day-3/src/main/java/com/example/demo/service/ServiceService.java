package com.example.demo.service;

import com.example.demo.model.GenreListDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

public class ServiceService {

    private MovieService movieService;
    private String apiKey;

    public ServiceService() {
        this.movieService = MovieServiceGenerator.createService(MovieService.class);
        this.apiKey = System.getenv("API_KEY");
    }

    public GenreListDTO getGenreList() throws IOException {
        Call<GenreListDTO> genreListDTOCall = movieService.getAllGenres(apiKey);
        Response<GenreListDTO> response = genreListDTOCall.execute();
        return response.body();
    }

}
