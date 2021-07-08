// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package rest.proxies;

public class Root
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject rootMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Rest.Root";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Root_Pie("Rest.Root_Pie"),
		Root_HeatMap("Rest.Root_HeatMap");

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

	public Root(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Rest.Root"));
	}

	protected Root(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject rootMendixObject)
	{
		if (rootMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Rest.Root", rootMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Rest.Root");

		this.rootMendixObject = rootMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Root.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static rest.proxies.Root initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return rest.proxies.Root.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static rest.proxies.Root initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new rest.proxies.Root(context, mendixObject);
	}

	public static rest.proxies.Root load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return rest.proxies.Root.initialize(context, mendixObject);
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
	 * @return value of Root_Pie
	 */
	public final java.util.List<myfirstmodule.proxies.Pie> getRoot_Pie() throws com.mendix.core.CoreException
	{
		return getRoot_Pie(getContext());
	}

	/**
	 * @param context
	 * @return value of Root_Pie
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<myfirstmodule.proxies.Pie> getRoot_Pie(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.Pie> result = new java.util.ArrayList<myfirstmodule.proxies.Pie>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Root_Pie.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(myfirstmodule.proxies.Pie.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of Root_Pie
	 * @param root_pie
	 */
	public final void setRoot_Pie(java.util.List<myfirstmodule.proxies.Pie> root_pie)
	{
		setRoot_Pie(getContext(), root_pie);
	}

	/**
	 * Set value of Root_Pie
	 * @param context
	 * @param root_pie
	 */
	public final void setRoot_Pie(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<myfirstmodule.proxies.Pie> root_pie)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (myfirstmodule.proxies.Pie proxyObject : root_pie)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.Root_Pie.toString(), identifiers);
	}

	/**
	 * @return value of Root_HeatMap
	 */
	public final java.util.List<myfirstmodule.proxies.HeatMap> getRoot_HeatMap() throws com.mendix.core.CoreException
	{
		return getRoot_HeatMap(getContext());
	}

	/**
	 * @param context
	 * @return value of Root_HeatMap
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<myfirstmodule.proxies.HeatMap> getRoot_HeatMap(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.HeatMap> result = new java.util.ArrayList<myfirstmodule.proxies.HeatMap>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Root_HeatMap.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(myfirstmodule.proxies.HeatMap.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of Root_HeatMap
	 * @param root_heatmap
	 */
	public final void setRoot_HeatMap(java.util.List<myfirstmodule.proxies.HeatMap> root_heatmap)
	{
		setRoot_HeatMap(getContext(), root_heatmap);
	}

	/**
	 * Set value of Root_HeatMap
	 * @param context
	 * @param root_heatmap
	 */
	public final void setRoot_HeatMap(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<myfirstmodule.proxies.HeatMap> root_heatmap)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (myfirstmodule.proxies.HeatMap proxyObject : root_heatmap)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.Root_HeatMap.toString(), identifiers);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return rootMendixObject;
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
			final rest.proxies.Root that = (rest.proxies.Root) obj;
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
		return "Rest.Root";
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