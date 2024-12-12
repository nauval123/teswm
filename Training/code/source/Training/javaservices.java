package Training;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class javaservices

{
	// ---( internal utility methods )---

	final static javaservices _instance = new javaservices();

	static javaservices _newInstance() { return new javaservices(); }

	static javaservices _cast(Object o) { return (javaservices)o; }

	// ---( server methods )---




	public static final void myFirstJavaService (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(myFirstJavaService)>> ---
		// @sigtype java 3.5
		// [i] field:0:required inputString
		// [o] field:0:required outputString
		// pipeline input
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	inputString = IDataUtil.getString( pipelineCursor, "inputString" );
		pipelineCursor.destroy();
		
		//process logic
		
		// pipeline output
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "outputString", inputString );
		pipelineCursor_1.destroy();
		// --- <<IS-END>> ---

                
	}
}

