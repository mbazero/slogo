package backend.command;

import backend.*;

public class Tell extends SpecifiedTurtleCommand {

	private final static int NUM_PARAMS = 1;

	public Tell(StringPair stringPair, Command parent, Model model) {
		super(stringPair, NUM_PARAMS, parent, model);
	}

	public Double execute() {
		return grid().setActiveTurtles(specifiedTurtles());
	}

}
