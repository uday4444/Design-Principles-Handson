package chainofresponsibility;

public class ProjectManager implements ILeaveRequestHandler {


	ILeaveRequestHandler nextHandler = new HR();
	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		int leaveDays = leaveRequest.getLeaveDays();
		if(leaveDays>=3 && leaveDays<=5)
		{
			System.out.println("Leave has been approved by the project manager for " +leaveRequest.getEmployeeName());
		}
		else if(leaveDays>5) {
			nextHandler.handleRequest(leaveRequest);
		}
	}
}
