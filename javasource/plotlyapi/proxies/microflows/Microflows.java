// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package plotlyapi.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the PlotlyAPI module
	public static plotlyapi.proxies.DataSource dSS_Data(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("PlotlyAPI.DSS_Data").withParams(params).execute(context);
		return result == null ? null : plotlyapi.proxies.DataSource.initialize(context, result);
	}
	public static void iVK_Call_REST(IContext context, plotlyapi.proxies.DataSource _dataSource)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("DataSource", _dataSource == null ? null : _dataSource.getMendixObject());
		Core.microflowCall("PlotlyAPI.IVK_Call_REST").withParams(params).execute(context);
	}
}