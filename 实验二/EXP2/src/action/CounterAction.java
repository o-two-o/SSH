package action;

import com.opensymphony.xwork2.ActionContext;

public class CounterAction {
	public String execute() {
		// TODO Auto-generated method stub
		// ActionContext
		ActionContext ac = ActionContext.getContext();
		int counter;
		if (ac.getSession().get("counter") == null)
			counter = 0;
		else
			counter = Integer.parseInt(String.valueOf(ac.getSession().get("counter")));
		counter++;
		ac.getSession().put("counter", counter);
		return "success";
	}

}
