package lucasmazzimarcellino.com.br.consumindowebservice

import com.google.gson.annotations.SerializedName

data class Usuarios(
        @SerializedName("name") val nome: String,
        @SerializedName("avatar_url") val avatarUrl: String
)