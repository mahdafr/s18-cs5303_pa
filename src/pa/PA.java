/**
 * 
 * @author Mahdokht Afravi
 * @created Mar 23 F
 * 
 */
package pa;

public class PA {
	private GUI view;
	private Backend model;
	
	public PA() {
		view = new GUI();
		model = new Backend();
		start();
	}

	/**
	 * GUI displays the initial instructions.
	 */
	private void start() {
		view.writeInstructions();
		run();
	}

	/**
     * Handle input from prompts.
     */
	private void run() {
		boolean moreTests = true;
		String test;
		do {
			test = view.getExpression();
			switch ( test ) {
                case "-1":
                    //user wants to end program
                    moreTests = false;
                    view.end();
                    break;
                case "-2":
                    //run the program with the same test string
                    optionIs(view.promptBehavior());
                    break;
                default:
                    //run the program with a provided test string
                    if ( model.setExpression(test) )
                        optionIs(view.promptBehavior());
            }
		} while ( moreTests );
	}

    /**
     * Communicate with Backend to display results.
     */
	private void optionIs(int option) {
        switch (option) {
            case 1:
                //transform to CNF
                view.result(model.toCNF(),option);
                break;
            case 2:
                //transform to DNF
                view.result(model.toDNF(),option);
                break;
            case 3:
                //transform to full CNF
                view.result(model.toFullCNF(),option);
                break;
            case 4:
                //transform to full DNF
                view.result(model.toFullDNF(),option);
                break;
            case 5:
                //get truth values for atoms and evaluate the expression
                view.result(model.getTruthValue(view.getTestValues(model.getAtoms())), 5);
                break;
            case 6:
                //determine the truth evaluation (sat/tau/con)
                model.evaluate();
                switch (model.getEvaluation()) {
                    case Satisfiable:
                        view.result(true,60);
                        break;
                    case Tautology:
                        view.result(true,option);
                        break;
                    case Contradiction:
                        view.result(true,option);
                        break;
                }
                break;
            default:
                //do all of the above
                model.getTruthValue(view.getTestValues(model.getAtoms()));
                model.doAll();
                break;
        }
    }
}