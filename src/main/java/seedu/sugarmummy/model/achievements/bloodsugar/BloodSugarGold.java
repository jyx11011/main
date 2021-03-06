package seedu.sugarmummy.model.achievements.bloodsugar;

import static seedu.sugarmummy.model.achievements.AchievementLevel.GOLD;

import seedu.sugarmummy.model.achievements.Achievement;
import seedu.sugarmummy.model.achievements.DurationUnit;

/**
 * Bloodsugar Achievement of gold level.
 */
public class BloodSugarGold extends Achievement implements BloodSugar {

    private static final String TITLE = "Sugar Legendary Whisperer";

    private static final int DURATION_VALUE = 30;
    private static final String DESCRIPTION = "Attain between " + MINIMUM + " and " + MAXIMUM + CONSTRAINT_UNITS + " "
            + "(inclusive) of daily average " + RECORD_TYPE.toString().toLowerCase() + " levels for at least "
            + DURATION_VALUE + " consecutive "
            + DURATION_UNITS.toLowerCase()
            + (DURATION_VALUE != 1 ? "s." : ".");

    public BloodSugarGold() {
        super(RECORD_TYPE, TITLE, DESCRIPTION, GOLD);
    }

    @Override
    public double getMaximum() {
        return MAXIMUM;
    }

    @Override
    public double getMinimum() {
        return MINIMUM;
    }

    @Override
    public double getDurationValue() {
        return DURATION_VALUE;
    }

    @Override
    public DurationUnit getDurationUnits() {
        return DURATION_UNITS;
    }

    @Override
    public Achievement copy() {
        Achievement newAchievement = new BloodSugarGold();
        newAchievement.setAchievementState(this.getAchievementState());
        return newAchievement;
    }

}
