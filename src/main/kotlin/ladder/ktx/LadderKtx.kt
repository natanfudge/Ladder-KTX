package ladder.ktx

import java.util.*

fun init() {
    println("Initializing KTX!")
    val mods = ServiceLoader.load(LadderMod::class.java).toList()
    for (mod in mods) {
        println("Loaded mod: ${mod.modId}")
    }
}