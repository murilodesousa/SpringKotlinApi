package SpringApi.features.soccer.controller

import kotlinx.serialization.json.JsonObject
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/soccer")
class SoccerController {

    @PostMapping
    fun create(): String = "Aqui iremos incluir um jogador"

    @GetMapping
    fun getAll(): String = "Aqui são retornados todos os jogadores"

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): String = "Aqui é retornado os dados do jogador "+id.toString()

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody model: JsonObject): String = "Aqui iremos atualizar o jogador "+
      id.toString()+" com os novos dados: "+model.toString()

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): String = "Aqui iremos excluir o jogador "+
       id.toString()

}