// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testsuite.proxies;

public class PointDecimal
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject pointDecimalMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "TestSuite.PointDecimal";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		xCoordinate("xCoordinate"),
		yCoordinate("yCoordinate"),
		PointDecimal_Graph("TestSuite.PointDecimal_Graph"),
		PointDecimal_Point_OverReference("TestSuite.PointDecimal_Point_OverReference");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public PointDecimal(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "TestSuite.PointDecimal"));
	}

	protected PointDecimal(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject pointDecimalMendixObject)
	{
		if (pointDecimalMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("TestSuite.PointDecimal", pointDecimalMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a TestSuite.PointDecimal");

		this.pointDecimalMendixObject = pointDecimalMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'PointDecimal.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static testsuite.proxies.PointDecimal initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return testsuite.proxies.PointDecimal.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static testsuite.proxies.PointDecimal initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new testsuite.proxies.PointDecimal(context, mendixObject);
	}

	public static testsuite.proxies.PointDecimal load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return testsuite.proxies.PointDecimal.initialize(context, mendixObject);
	}

	public static java.util.List<testsuite.proxies.PointDecimal> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<testsuite.proxies.PointDecimal> result = new java.util.ArrayList<testsuite.proxies.PointDecimal>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//TestSuite.PointDecimal" + xpathConstraint))
			result.add(testsuite.proxies.PointDecimal.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of xCoordinate
	 */
	public final java.util.Date getxCoordinate()
	{
		return getxCoordinate(getContext());
	}

	/**
	 * @param context
	 * @return value of xCoordinate
	 */
	public final java.util.Date getxCoordinate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.xCoordinate.toString());
	}

	/**
	 * Set value of xCoordinate
	 * @param xcoordinate
	 */
	public final void setxCoordinate(java.util.Date xcoordinate)
	{
		setxCoordinate(getContext(), xcoordinate);
	}

	/**
	 * Set value of xCoordinate
	 * @param context
	 * @param xcoordinate
	 */
	public final void setxCoordinate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date xcoordinate)
	{
		getMendixObject().setValue(context, MemberNames.xCoordinate.toString(), xcoordinate);
	}

	/**
	 * @return value of yCoordinate
	 */
	public final java.math.BigDecimal getyCoordinate()
	{
		return getyCoordinate(getContext());
	}

	/**
	 * @param context
	 * @return value of yCoordinate
	 */
	public final java.math.BigDecimal getyCoordinate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.yCoordinate.toString());
	}

	/**
	 * Set value of yCoordinate
	 * @param ycoordinate
	 */
	public final void setyCoordinate(java.math.BigDecimal ycoordinate)
	{
		setyCoordinate(getContext(), ycoordinate);
	}

	/**
	 * Set value of yCoordinate
	 * @param context
	 * @param ycoordinate
	 */
	public final void setyCoordinate(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal ycoordinate)
	{
		getMendixObject().setValue(context, MemberNames.yCoordinate.toString(), ycoordinate);
	}

	/**
	 * @return value of PointDecimal_Graph
	 */
	public final testsuite.proxies.Graph getPointDecimal_Graph() throws com.mendix.core.CoreException
	{
		return getPointDecimal_Graph(getContext());
	}

	/**
	 * @param context
	 * @return value of PointDecimal_Graph
	 */
	public final testsuite.proxies.Graph getPointDecimal_Graph(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		testsuite.proxies.Graph result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.PointDecimal_Graph.toString());
		if (identifier != null)
			result = testsuite.proxies.Graph.load(context, identifier);
		return result;
	}

	/**
	 * Set value of PointDecimal_Graph
	 * @param pointdecimal_graph
	 */
	public final void setPointDecimal_Graph(testsuite.proxies.Graph pointdecimal_graph)
	{
		setPointDecimal_Graph(getContext(), pointdecimal_graph);
	}

	/**
	 * Set value of PointDecimal_Graph
	 * @param context
	 * @param pointdecimal_graph
	 */
	public final void setPointDecimal_Graph(com.mendix.systemwideinterfaces.core.IContext context, testsuite.proxies.Graph pointdecimal_graph)
	{
		if (pointdecimal_graph == null)
			getMendixObject().setValue(context, MemberNames.PointDecimal_Graph.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.PointDecimal_Graph.toString(), pointdecimal_graph.getMendixObject().getId());
	}

	/**
	 * @return value of PointDecimal_Point_OverReference
	 */
	public final testsuite.proxies.Point_OverReference getPointDecimal_Point_OverReference() throws com.mendix.core.CoreException
	{
		return getPointDecimal_Point_OverReference(getContext());
	}

	/**
	 * @param context
	 * @return value of PointDecimal_Point_OverReference
	 */
	public final testsuite.proxies.Point_OverReference getPointDecimal_Point_OverReference(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		testsuite.proxies.Point_OverReference result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.PointDecimal_Point_OverReference.toString());
		if (identifier != null)
			result = testsuite.proxies.Point_OverReference.load(context, identifier);
		return result;
	}

	/**
	 * Set value of PointDecimal_Point_OverReference
	 * @param pointdecimal_point_overreference
	 */
	public final void setPointDecimal_Point_OverReference(testsuite.proxies.Point_OverReference pointdecimal_point_overreference)
	{
		setPointDecimal_Point_OverReference(getContext(), pointdecimal_point_overreference);
	}

	/**
	 * Set value of PointDecimal_Point_OverReference
	 * @param context
	 * @param pointdecimal_point_overreference
	 */
	public final void setPointDecimal_Point_OverReference(com.mendix.systemwideinterfaces.core.IContext context, testsuite.proxies.Point_OverReference pointdecimal_point_overreference)
	{
		if (pointdecimal_point_overreference == null)
			getMendixObject().setValue(context, MemberNames.PointDecimal_Point_OverReference.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.PointDecimal_Point_OverReference.toString(), pointdecimal_point_overreference.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return pointDecimalMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final testsuite.proxies.PointDecimal that = (testsuite.proxies.PointDecimal) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "TestSuite.PointDecimal";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}