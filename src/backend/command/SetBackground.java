package backend.command;

import java.awt.Color;

import backend.*;

public class SetBackground extends ModelCommand {

	private final static int NUM_PARAMS = 1;
	private final static int COLOR_PARAM = 0;

	public SetBackground(StringPair stringPair, Command parent, Model model) {
		super(stringPair, NUM_PARAMS, parent, model);
	}

	public Double execute() {
		Color newBGColor = paramToColor(COLOR_PARAM);
		grid().setBGColor(newBGColor);
		return getParamReturnVal(COLOR_PARAM);
	}

}
