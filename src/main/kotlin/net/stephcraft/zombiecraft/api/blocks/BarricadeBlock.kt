package net.stephcraft.zombiecraft.api.blocks

import org.bukkit.entity.Player as BukkitPlayer
import net.stephcraft.zombiecraft.utility.attributes.Attribute
import net.stephcraft.zombiecraft.utility.attributes.objective.ObjectiveAttribute
import net.stephcraft.zombiecraft.utility.events.CancellableEvent

interface Player: BukkitPlayer

interface BarricadeBlock {
    val repairReward: Attribute<Int>
    val repairDelay: Attribute<Int>
    val breakDelay: ObjectiveAttribute<Int>

    val repaired: Boolean
    val damaged: Boolean

    val onRepair: CancellableEvent<(BukkitPlayer) -> Unit>
    val onRepaired: CancellableEvent<(BukkitPlayer) -> Unit>

    /** Does shit n stuff ykyk */
    fun restore()
    fun repair()
    fun damage()
}