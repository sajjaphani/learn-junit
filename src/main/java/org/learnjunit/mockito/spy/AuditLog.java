package org.learnjunit.mockito.spy;

import java.util.Date;

/**
 * Audit Log.
 * 
 * @author psajja
 *
 */
public interface AuditLog {

	// Recording implementation of real AuditLog interface
	public void logMessage(Date date, String user, String actionCode, Object detail);

	// Retrieval Interface:
	public int getNumberOfCalls();

	public Date getDate();

	public String getUser();

	public String getActionCode();

	public Object getDetail();
}
