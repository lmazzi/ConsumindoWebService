package lucasmazzimarcellino.com.br.consumindowebservice

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService{
    @GET("/users/{username}")
    fun buscarUsuario(@Path("username") username: String) : Call<Usuarios>
}