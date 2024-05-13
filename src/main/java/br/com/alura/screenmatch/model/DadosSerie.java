package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*
exemplo de uso do @JsonAlias
o comando @JsonAlias pega no arquivo json (title) e adiciona na String titulo
@JsonAlias é uma sintaxe do jackson, ela é diferente no Gson
 */
@JsonIgnoreProperties(ignoreUnknown = true) // ignora o que você não encontrar, tudo que não for (title) (totalSeasons)
//(imdRating) ele vai ignorar.
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating")String avaliacao) {
}
