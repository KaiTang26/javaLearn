
public class loginController {
	
	private View view;
	private Validator val;
	

	public loginController(View mockView, Validator mockVal) {
		// TODO Auto-generated constructor stub
		view = mockView;
		val = mockVal;
	}

	public void handle() {
		String input = this.view.getUserInput();
		this.val.validate(input);
	}
	
	

}
