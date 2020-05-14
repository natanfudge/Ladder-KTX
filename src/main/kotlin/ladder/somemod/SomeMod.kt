package ladder.somemod

import com.google.auto.service.AutoService
import ladder.ktx.LadderMod
import ladder.ktx.ModFeature

@AutoService(LadderMod::class)
class SomeMod : LadderMod {
    override fun provideFeatures(): Set<ModFeature> {
        return setOf()

//        val x : org.objectweb.asm.Type
    }

    override val modId = "some-mod"

}