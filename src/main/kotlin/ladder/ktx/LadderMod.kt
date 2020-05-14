package ladder.ktx

interface LadderMod {
    fun provideFeatures(): Set<ModFeature>
    val modId: String
}