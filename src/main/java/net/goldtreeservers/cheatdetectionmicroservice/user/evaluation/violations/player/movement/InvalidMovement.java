package net.goldtreeservers.cheatdetectionmicroservice.user.evaluation.violations.player.movement;

import net.goldtreeservers.cheatdetectionmicroservice.user.evaluation.violations.UserViolation;
import net.goldtreeservers.cheatdetectionmicroservice.user.evaluation.violations.ViolationType;

public class InvalidMovement extends UserViolation
{
	public InvalidMovement()
	{
		super(ViolationType.WARN_NO_LOG);
	}

	@Override
	public int getViolationPoints()
	{
		return 1;
	}
}
