package com.example.shilpa;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {

   /* @GET("Vy2abloQD")
    Call<List<Pokemon>> getAllPokemon();
*/
    @GET("E14trR2lD")
    Call<Pokemonpojo> getAllPokemon();
}
