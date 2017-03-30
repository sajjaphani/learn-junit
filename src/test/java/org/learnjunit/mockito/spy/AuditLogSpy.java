package org.learnjunit.mockito.spy;

import java.util.Date;

/**
 * A spy object for <code>AuditLog</code>.
 * 
 * @author psajja
 *
 */
public class AuditLogSpy implements AuditLog {

	// Fields into which we record actual usage info
	private Date date;
	private String user;
	private String actionCode;
	private Object detail;
	private int numberOfCalls = 0;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.learnjunit.mockito.spy.AuditLog#logMessage(java.util.Date,
	 * java.lang.String, java.lang.String, java.lang.Object)
	 */
	@Override
	public void logMessage(Date date, String user, String actionCode, Object detail) {
		this.date = date;
		this.user = user;
		this.actionCode = actionCode;
		this.detail = detail;
		numberOfCalls++;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.learnjunit.mockito.spy.AuditLog#getNumberOfCalls()
	 */
	@Override
	public int getNumberOfCalls() {
		return numberOfCalls;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.learnjunit.mockito.spy.AuditLog#getDate()
	 */
	@Override
	public Date getDate() {
		return date;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.learnjunit.mockito.spy.AuditLog#getUser()
	 */
	@Override
	public String getUser() {
		return user;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.learnjunit.mockito.spy.AuditLog#getActionCode()
	 */
	@Override
	public String getActionCode() {
		return actionCode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.learnjunit.mockito.spy.AuditLog#getDetail()
	 */
	@Override
	public Object getDetail() {
		return detail;
	}

}
