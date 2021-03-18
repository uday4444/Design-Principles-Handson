package chainofresponsibility;

public class Supervisor implements ILeaveRequestHandler {

	ILeaveRequestHandler nextHandler = new ProjectManager();
	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		int leaveDays = leaveRequest.getLeaveDays();
		if(leaveDays>0 && leaveDays<3)
		{
			System.out.println("Leave has been approved by the supervisor for " +leaveRequest.getEmployeeName());
		}
		else if(leaveDays>=3) {
			nextHandler.handleRequest(leaveRequest);
		}
	}

}
