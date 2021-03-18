package chainofresponsibility;

public class Program {

	public static void main(String[] args) {
		LeaveRequest leaveRequest = new LeaveRequest();
		leaveRequest.setEmployeeName("John");
		leaveRequest.setLeaveDays(1);
		ILeaveRequestHandler supervisor = new Supervisor();
		supervisor.handleRequest(leaveRequest);
	}
}
