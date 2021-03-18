package chainofresponsibility;

public class HR implements ILeaveRequestHandler {

	ILeaveRequestHandler nextHandler = null;
	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		int leaveDays = leaveRequest.getLeaveDays();
		
		if(leaveDays>5)
		{
			System.out.println("Meet HR for getting your Leave Request");
		}
		else
		{
			System.out.println("Leave has been approved by the HR for " +leaveRequest.getEmployeeName());
		}
	}

}
