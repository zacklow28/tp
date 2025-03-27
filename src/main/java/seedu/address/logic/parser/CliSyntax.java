package seedu.address.logic.parser;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 */
public class CliSyntax {

    /* Prefix definitions */
    public static final Prefix PREFIX_NAME = new Prefix("n/");
    public static final Prefix PREFIX_GENDER = new Prefix("g/");
    public static final Prefix PREFIX_HEIGHT = new Prefix("h/");
    public static final Prefix PREFIX_WEIGHT = new Prefix("w/");
    public static final Prefix PREFIX_PHONE = new Prefix("no/");
    public static final Prefix PREFIX_EMAIL = new Prefix("e/");
    public static final Prefix PREFIX_ADDRESS = new Prefix("a/");
    public static final Prefix PREFIX_DIET = new Prefix("d/");
    public static final Prefix PREFIX_PRIORITY = new Prefix("pr/");
    public static final Prefix PREFIX_MEETING_DATE = new Prefix("m/");
    //al for allergies
    public static final Prefix PREFIX_ALLERGY = new Prefix("al/");
    public static final Prefix PREFIX_REMARK = new Prefix("r/");
}
