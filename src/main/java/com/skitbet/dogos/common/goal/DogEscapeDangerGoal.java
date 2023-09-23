package com.skitbet.dogos.common.goal;

import com.skitbet.dogos.common.entities.GermanShepherdEntity;
import net.minecraft.entity.ai.goal.EscapeDangerGoal;
import net.minecraft.entity.mob.PathAwareEntity;

public class DogEscapeDangerGoal extends EscapeDangerGoal {
    public DogEscapeDangerGoal(PathAwareEntity mob, double speed) {
        super(mob, speed);
    }

    protected boolean isInDanger() {
        return this.mob.shouldEscapePowderSnow() || this.mob.isOnFire();
    }
}