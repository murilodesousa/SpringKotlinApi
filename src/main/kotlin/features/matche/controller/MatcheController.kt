package SpringApi.features.soccer.controller

import kotlinx.serialization.json.JsonObject
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/matches")
class MatcheController {

    @PostMapping
    fun create(): String = "Aqui iremos incluir uma partida"

    @GetMapping
    fun getAll(): String = "Aqui são retornados todas as partidas"

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): String = "Aqui é retornado os dados da partida "+id.toString()

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody model: JsonObject): String = "Aqui iremos atualizar a partida "+
      id.toString()+" com os novos dados: "+model.toString()

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): String = "Aqui iremos excluir a partida "+
       id.toString()

}